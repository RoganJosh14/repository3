package MTS;

import java.util.Random;
import java.util.logging.Logger;

//required grpc package for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import MTS.MTSClient;

public class MTSClient {
	
	// First we create a logger to show client side logs in the console. logger instance will be used to log different events at the client console.
		// This is optional. Could be used if needed.
		private static  Logger logger = Logger.getLogger(MTSClient.class.getName());

		// Creating stubs for establishing the connection with server.
		// Blocking stub
		private static MotionTemperatureSensorGrpc.MotionTemperatureSensorBlockingStub blockingStub;
		// Asynch stub
		private static MotionTemperatureSensorGrpc.MotionTemperatureSensorStub asyncStub;
		
		// The main method will have the logic for client.
		public static void main(String[] args) throws Exception {
		// First a channel is being created to the server from client. Here, we provide the server name (localhost) and port (50055).
			// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50075).usePlaintext().build();

			//stubs -- generate from proto
			blockingStub = MotionTemperatureSensorGrpc.newBlockingStub(channel);
			asyncStub = MotionTemperatureSensorGrpc.newStub(channel);

			// Unary RPC call
			  LightActivation();
			  TempRegulator();

			//  empty(); 	//passing an empty message - no server reply, error message

			// Closing the channel once message has been passed.		
			channel.shutdown();

		}

		
		public static void LightActivation() {
			// First creating a request message. Here, the message contains a string in setVal
			LightActivationRequest req = LightActivationRequest.newBuilder().setVal1("LightOff").build();
			//  Calling a remote RPC method using blocking stub defined in main method. req is the message we want to pass.
			LightActivationResponse response = blockingStub.lightActivation(req);

			//response contains the output from the server side. Here, we are printing the value contained by response. 
			System.out.println(response.getVal2());
			
		}

		public static void TempRegulator() {

			// Handling the stream for client using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
			StreamObserver<TempRegulatorResponse> responseObserver = new StreamObserver<TempRegulatorResponse>() {

				@Override
				public void onNext(TempRegulatorResponse value) {
					System.out.println("Regulated Tempreature: " + value.getCelcius());
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub

				}

				@Override
				public void onCompleted() {
					System.out.println("The tempreature has been recorded ");

				}

			};

			// Here, we are calling the Remote TempRegulator method. Using onNext, client sends a stream of messages.
			StreamObserver<TempRegulatorRequest> requestObserver = asyncStub.tempRegulator(responseObserver);

			try {

				requestObserver.onNext(TempRegulatorRequest.newBuilder().setVal("18").build());
				requestObserver.onNext(TempRegulatorRequest.newBuilder().setVal("18").build());
				requestObserver.onNext(TempRegulatorRequest.newBuilder().setVal("18").build());
				requestObserver.onNext(TempRegulatorRequest.newBuilder().setVal("18").build());

				System.out.println("SENDING INFORMATION");

				// Mark the end of requests
				requestObserver.onCompleted();
				
				System.out.println("Tempeature has been received");

				// Sleep for a bit before sending the next one.
				Thread.sleep(new Random().nextInt(1000) + 500);


			} catch (RuntimeException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}


		}

	}