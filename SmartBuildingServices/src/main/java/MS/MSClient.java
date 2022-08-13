package MS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import MS.MSClient;
import MS.LiveDashboardRequest;
import MS.LiveDashboardResponse;
import MS.MonitoringSystemGrpc;
import MS.CallRequest;
import MS.CallResponse;
//required grpc package for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;


public class MSClient {
	
	// First we create a logger to show client side logs in the console. logger instance will be used to log different events at the client console.
			// This is optional. Could be used if needed.
		private static  Logger logger = Logger.getLogger(MSClient .class.getName());

		// Creating stubs for establishing the connection with server.
					// Blocking stub
		private static MonitoringSystemGrpc.MonitoringSystemBlockingStub blockingStub;
		// Asynch stub
		private static MonitoringSystemGrpc.MonitoringSystemStub asyncStub;
		
		// The main method will have the logic for client.
		public static void main(String[] args) throws Exception {
			// First a channel is being created to the server from client. Here, we provide the server name (localhost) and port (50058).
			// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

			//stubs -- generate from proto
			blockingStub = MonitoringSystemGrpc.newBlockingStub(channel);
			asyncStub = MonitoringSystemGrpc.newStub(channel);

			//bidirectional streaming and Server Streaming
			LiveDashboard();
			EmergencyServices();

			// Closing the channel once message has been passed.		
			channel.shutdown();

		}
		
		// bi-directional streaming 
		
		public static void LiveDashboard() {

			// Handling the server stream for client using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
			StreamObserver<LiveDashboardResponse> responseObserver = new StreamObserver<LiveDashboardResponse>() {
				
				
				
				@Override
				public void onNext(LiveDashboardResponse value) {
				
					System.out.println("Live feed: " + value.getVal2() + value.getTemp2() + value.getOccupant2());
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
				
					

				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Live Information..");
				}



			};

			// Here, we are calling the Remote reverseStream method. Using onNext, client sends a stream of messages.
			StreamObserver<LiveDashboardRequest> requestObserver = asyncStub.liveDashboard(responseObserver);

			try {

				requestObserver.onNext(LiveDashboardRequest.newBuilder().setVal1("Light ON").build());
				requestObserver.onNext(LiveDashboardRequest.newBuilder().setTemp1(12).build());
				requestObserver.onNext(LiveDashboardRequest.newBuilder().setOccupant1("3 People").build());

				System.out.println("SENDING INFORMATION");

				// Mark the end of requests
				requestObserver.onCompleted();


				// Sleep for a bit before sending the next one.
				Thread.sleep(new Random().nextInt(1000) + 500);


			} catch (RuntimeException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
		
			public static void EmergencyServices() {
				
				// First creating a request message. Here, the message contains a string in setVal
				CallRequest request = CallRequest.newBuilder().setVal3("999 ( POLICE )").build();

				// as this call is blocking. The client will not proceed until all the messages in stream has been received. 
				try {
					// Iterating each message in response when calling remote split RPC method.
					Iterator<CallResponse> responces = blockingStub.emergencyServices(request);
					
					// Client keeps a check on the next message in stream.
					while(responces.hasNext()) {
						CallResponse temp = responces.next();
						System.out.println(temp.getVal6());				
					}

				} catch (StatusRuntimeException e) {
					e.printStackTrace();
				}
				
			}

		}


