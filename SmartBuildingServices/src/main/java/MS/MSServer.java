package MS;

import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Logger;

//required grpc package for the server side
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

//This is ImplBase class that was generated from the proto file.
//You need to change this location for your projects. NOTICE: The class is in StringsServiceGrpc.java -> StringsServiceImplBase class (this Base class is generated from proto file option java_outer_classname)
import MS.MonitoringSystemGrpc.MonitoringSystemImplBase;
import MS.LiveDashboardRequest;
import MS.LiveDashboardResponse;
import MS.MSServer;

public class MSServer extends MonitoringSystemImplBase {
	
	// First we create a logger to show server side logs in the console. logger instance will be used to log different events at the server console.
		private static final Logger logger = Logger.getLogger(MSServer.class.getName());

		// Main method would contain the logic to start the server.	For throws keyword refer https://www.javatpoint.com/throw-keyword
				// NOTE: THIS LOGIC WILL BE SAME FOR ALL THE TYPES OF SERVICES
		 public static void main(String[] args) throws IOException, InterruptedException {
			    
			// The StringServer is the current file name/ class name. Using an instance of this class different methods could be invoked by the client.
			 MSServer stringserver = new MSServer();
			   
			 // This is the port number where server will be listening to clients. Refer - https://en.wikipedia.org/wiki/Port_(computer_networking)
			    int port = 50059;
			    
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
		public StreamObserver<LiveDashboardRequest> liveDashboard(StreamObserver<LiveDashboardResponse> responseObserver) {
			// TODO Auto-generated method stub
			return new StreamObserver<LiveDashboardRequest>() {
				
				
			
			@Override
			public void onNext(LiveDashboardRequest request){
				// In bidirectional stream, both server and  client would be sending the stream of messages.
				// Here, for each message in stream from client, server is sending back one response.
				String Light = request.getVal1();
				int Temp = request.getTemp1();
				String Persons =request.getOccupant1();
				System.out.println("LIVE DASHBOARD");
					 System.out.println("Light Status: " + request.getVal1());	
					 System.out.println("Tempreature status: " + request.getTemp1());
					 System.out.println("Occupants status: " + request.getOccupant1());
					 
					 
					 
					
		         // Preparing and sending the reply for the client. Here, response is build and with the value (input1.toString()) computed by above logic.
		            LiveDashboardResponse reply = LiveDashboardResponse.newBuilder().setVal2(Light).setTemp2(Temp).setOccupant2(Persons).build();
		      
		            responseObserver.onNext(reply);
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stubal
				
			}

			@Override
			public void onCompleted() {
				 responseObserver.onCompleted();
				
			}
			
			
		};
		}

		@Override
		public void emergencyServices(CallRequest request, StreamObserver<CallResponse> responseObserver) {
			// TODO Auto-generated method stub
			//super.emergencyServices(request, responseObserver);
			
			// System.out.println("Receiving Information");
			 
				// Retrieve the value from the request of the client and convert it to array
				// String light = request.getVal1().toCharArray();
				 
				// LOGIC of THE METHOD 
					// NOTE: YOU MAY NEED TO MODIFY THIS LOGIC HERE.
				// System.out.println(characters.length);
				 
				// for(char c: characters) {			
					// Preparing and sending the reply for the client. Here, response is build and with the value (c) computed by above logic.
					 // Here, a stream of response is sent using the for loop.
				//	 responseObserver.onNext(CallResponse.newBuilder().setVal6(Character.toString(c)).build());
				 }
				 
				// responseObserver.onCompleted();
			}
				
