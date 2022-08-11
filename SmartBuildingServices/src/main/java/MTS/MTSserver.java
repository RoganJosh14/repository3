package MTS;

import java.io.IOException;
import java.util.logging.Logger;

import Authorization.LoginResponse;
// required grpc package for the server side
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import MTS.MotionTemperatureSensorGrpc.MotionTemperatureSensorImplBase;
import MTS.TempRegulatorResponse;
import MTS.TempRegulatorRequest;

public class MTSserver extends MotionTemperatureSensorImplBase{
	// First we create a logger to show server side logs in the console. logger instance will be used to log different events at the server console.
		private static final Logger logger = Logger.getLogger(MTSserver.class.getName());

	// Main method would contain the logic to start the server.	For throws keyword refer https://www.javatpoint.com/throw-keyword
	// NOTE: THIS LOGIC WILL BE SAME FOR ALL THE TYPES OF SERVICES
		 public static void main(String[] args) throws IOException, InterruptedException {
			    
			 // The StringServer is the current file name/ class name. Using an instance of this class different methods could be invoked by the client.
			 MTSserver stringserver = new MTSserver();

			 	// This is the port number where server will be listening to clients. Refer - https://en.wikipedia.org/wiki/Port_(computer_networking) 
			    int port = 50075;
			    
			    // Here, we create a server on the port defined in in variable "port" and attach a service "stringserver" (instance of the class) defined above.
			    Server server = ServerBuilder.forPort(port) // Port is defined in line 34
			        .addService(stringserver) // Service is defined in line 31
			        .build() // Build the server
			        .start(); // Start the server and keep it running for clients to contact.
			    
			    // Giving a logging information on the server console that server has started
			    logger.info("Server started, listening on " + port);
			    		    
			    // Server will be running until externally terminated.
			    server.awaitTermination();
		 }

		@Override
		public void lightActivation(LightActivationRequest request,
				StreamObserver<LightActivationResponse> responseObserver) {
			// TODO Auto-generated method stub
			//super.lightActivation(request, responseObserver);
			System.out.println("Scanning for Motion");	
			String motion = request.getVal1();
			String on = "LightOn";
			String access = "Motion Detected!";
			String dark = "No motion!";
			 if(motion.equals(on)) {
				 System.out.println("Light Activated " + access);
			 }else if(motion != on){
				 System.out.println("Light De-Activated " + dark );
			 }
			 //Change to "LightOn" on client to activate light.
	
			LightActivationResponse reply = LightActivationResponse.newBuilder().setVal2(motion).build();	
			 
			responseObserver.onNext(reply);
			
			responseObserver.onCompleted();
		}
			

		@Override
		public StreamObserver<TempRegulatorRequest> tempRegulator(
				StreamObserver<TempRegulatorResponse> responseObserver) {
			// TODO Auto-generated method stub
			return new StreamObserver<TempRegulatorRequest>() {
			
			int celcius = 18;
			
			// For each message in the stream, get one stream at a time.
			// NOTE: YOU MAY MODIFY THE LOGIC OF onNext, onError, onCompleted BASED ON YOUR PROJECT.
			@Override
			public void onNext(TempRegulatorRequest value){
				// Here, in this example we compute the value of string length for each message in the stream. 
				System.out.println("receiving temperature -> " + value.getVal());
				// Keep on adding all the length values to compute the total length of strings sent by the client in the stream 
				celcius += value.getVal().length();
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
			}

			// Once the complete stream is received this logic will be executed.
			@Override
			public void onCompleted() {
				// Preparing and sending the reply for the client. Here, response is build and with the value (length) computed by above logic.
				 // Here, response is sent once the client is done with sending the stream.
				  TempRegulatorResponse res = TempRegulatorResponse.newBuilder().setCelcius(celcius).build();
		          responseObserver.onNext(res);
		          responseObserver.onCompleted();
			}
			
			
		};
}
}
