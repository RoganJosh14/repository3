package Authorization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

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
			 
			 Properties prop = AuthorizationServer.getProperties();
			 
			 AuthorizationServer.registerService(prop);

			 	// This is the port number where server will be listening to clients. Refer - https://en.wikipedia.org/wiki/Port_(computer_networking) 
			    int port = Integer.valueOf(prop.getProperty("service_port")); //50065
		    
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
		 
		 
	private Properties getProperties() {
				
				Properties prop = null;		
				
				 try (InputStream input = new FileInputStream("src/main/resources/login.properties")) {

			            prop = new Properties();

			            // load a properties file
			            prop.load(input);

			            // get the property value and print it out
			            System.out.println("Authorization Service properties ...");
			            System.out.println("\t service_type: " + prop.getProperty("service_type"));
			            System.out.println("\t service_name: " +prop.getProperty("service_name"));
			            System.out.println("\t service_description: " +prop.getProperty("service_description"));
				        System.out.println("\t service_port: " +prop.getProperty("service_port"));

			        } catch (IOException ex) {
			            ex.printStackTrace();
			        }
			
				 return prop;
			}
	
	private  void registerService(Properties prop) {
		
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            String service_type = prop.getProperty("service_type") ;//"_http._tcp.local.";
	            String service_name = prop.getProperty("service_name")  ;// "example";
	           // int service_port = 1234;
	            int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;

	            
	            String service_description_properties = prop.getProperty("service_description")  ;//"path=index.html";
	            
	            // Register a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
	            jmdns.registerService(serviceInfo);
	            
	            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
	            
	            // Wait a bit
	            Thread.sleep(1000);

	            // Unregister all services
	            //jmdns.unregisterAllServices();

	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
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
			
			System.out.println("***************************************************");
			System.out.println("***************************************************");
		}

		@Override
		public void floorUnitSelection(FloorUnitSelectionRequest request,
				StreamObserver<FloorUnitSelectionResponse> responseObserver) {
			// TODO Auto-generated method stub
			//super.floorUnitSelection(request, responseObserver);
			System.out.println("***************************************************");
			System.out.println("***************************************************");
			
			
			String floor = request.getVal3();
			String unit = "one";
			String select = "01-01";
			String noEntry = "ACCESS DENIED";
			
			if(floor.equals(unit)) {
			 System.out.println("Accessible unit " + select);
			}
			else if(floor != unit){
				System.out.println("No units Available " + noEntry);
				
				}
			FloorUnitSelectionResponse reply = FloorUnitSelectionResponse.newBuilder().setVal4(floor).build();	
			
			responseObserver.onNext(reply);
			
			responseObserver.onCompleted();
			
		}
		

}
