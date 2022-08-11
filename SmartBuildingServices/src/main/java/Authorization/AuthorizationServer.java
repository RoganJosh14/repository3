package Authorization;

import java.io.IOException;
import java.util.logging.Logger;

// required grpc package for the server side
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import Authorization.AuthorizationGrpc.AuthorizationImplBase;

public class AuthorizationServer extends AuthorizationImplBase {
	private static final Logger logger = Logger.getLogger(AuthorizationServer.class.getName());

	// Main method would contain the logic to start the server.	For throws keyword refer https://www.javatpoint.com/throw-keyword
	// NOTE: THIS LOGIC WILL BE SAME FOR ALL THE TYPES OF SERVICES
		 public static void main(String[] args) throws IOException, InterruptedException {
			    
			 // The StringServer is the current file name/ class name. Using an instance of this class different methods could be invoked by the client.
			 AuthorizationServer AuthorizationServer = new AuthorizationServer();

			 	// This is the port number where server will be listening to clients. Refer - https://en.wikipedia.org/wiki/Port_(computer_networking) 
			    int port = 50065;
			    
			    // Here, we create a server on the port defined in in variable "port" and attach a service "stringserver" (instance of the class) defined above.
			    Server server = ServerBuilder.forPort(port) // Port is defined in line 34
			        .addService(AuthorizationServer) // Service is defined in line 31
			        .build() // Build the server
			        .start(); // Start the server and keep it running for clients to contact.
			    
			    // Giving a logging information on the server console that server has started
			    logger.info("Server started, listening on " + port);
			    		    
			    // Server will be running until externally terminated.
			    server.awaitTermination();
		 }

		@Override
		public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
			// TODO Auto-generated method stub
			//super.login(request, responseObserver);
			System.out.println("Recieving Login Details");	
			String username = request.getVal1();
			String tenant1 = "Joshua";
			//String tenant2 = "Rohit";
			//String tenant3 = "James";
			//String tenant4 = "Alice";
			//String tenant5 = "Mary";
			String access = "Entry Success!";
			String deny = "Denied Entry!";
			 if(username.equals(tenant1)) {
				 System.out.println("Welcome " + access);
			 }else if(username != tenant1){
				 System.out.println("Sorry " + deny);
			 }
	
			LoginResponse reply = LoginResponse.newBuilder().setVal2(username).build();	
			 
			responseObserver.onNext(reply);
			
			responseObserver.onCompleted();
		}

		@Override
		public void floorUnitSelection(FloorUnitSelectionRequest request,
				StreamObserver<FloorUnitSelectionResponse> responseObserver) {
			// TODO Auto-generated method stub
			//super.floorUnitSelection(request, responseObserver);
			
			String floor = new String(request.getVal3());
			String unit = "01" + floor;
			String select = floor;
			String noEntry = "ACCESS DENIED";
			
			if(unit == floor) {
				unit = select;
			}
			else{
				if(unit != floor){
					unit = noEntry;	
				}
			}
			FloorUnitSelectionResponse reply = FloorUnitSelectionResponse.newBuilder().setVal4(floor).build();	
			
			responseObserver.onNext(reply);
			
			responseObserver.onCompleted();
			
		}
		

}
