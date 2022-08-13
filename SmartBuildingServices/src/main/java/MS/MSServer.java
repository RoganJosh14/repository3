package MS;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

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
			 MSServer MSServer = new MSServer();
			 
			 Properties prop = MSServer.getProperties();
			 
			 MSServer.registerService(prop);
			   
			 // This is the port number where server will be listening to clients. Refer - https://en.wikipedia.org/wiki/Port_(computer_networking)
			    int port = Integer.valueOf(prop.getProperty("service_port")); //50059
			    
			    // Here, we create a server on the port defined in in variable "port" and attach a service "stringserver" (instance of the class) defined above.
			    Server server = ServerBuilder.forPort(port) // Port is defined in line 34
			        .addService(MSServer) // Service is defined in line 31
			        .build() // Build the server
			        .start(); // Start the server and keep it running for clients to contact.
			    
			    // Giving a logging information on the server console that server has started
			    logger.info("Server started, listening on " + port);
			    		    
			    // Server will be running until externally terminated.
			    server.awaitTermination();
		 }
		 
	private Properties getProperties() {
				
				Properties prop = null;		
				
				 try (InputStream input = new FileInputStream("src/main/resources/MS.properties")) {

			            prop = new Properties();

			            // load a properties file
			            prop.load(input);

			            // get the property value and print it out
			            System.out.println("Monitoring System Service properties ...");
			            System.out.println("\t service_type: " + prop.getProperty("service_type"));
			            System.out.println("\t service_name: " +prop.getProperty("service_name"));
			            System.out.println("\t service_description: " +prop.getProperty("service_description"));
				        System.out.println("\t service_port: " +prop.getProperty("service_port"));

			        } catch (IOException ex) {
			            ex.printStackTrace();
			        }
			
				 return prop;
			}
	
	private void registerService(Properties prop) {
		
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
			


		 
		 // Bidirectional Server
		 
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
		
		// Server Streaming
		@Override
		public void emergencyServices(CallRequest request, StreamObserver<CallResponse> responseObserver) {
			// TODO Auto-generated method stub
			//super.emergencyServices(request, responseObserver);
		
			 System.out.println("Receiving Information");
			 
				//Retrieve the value from the request of the client and convert it to array
				String Emergency  = request.getVal3();
				String call1 = "999 ( POLICE )";
				String call2 = "995 (FIRE)";		
				String call3 = "991 (Ambulance)";
				
				if (Emergency.equals(call1)) {
					System.out.println("Calling Police...");
				}else if 
					(Emergency.equals(call2)){
					System.out.println("Calling Fire Brigade...");
				}else if
					(Emergency.equals(call3)) {
					System.out.println("Calling Fire Ambulance...");	
				}
		
					// Preparing and sending the reply for the client. Here, response is build and with the value (c) computed by above logic.	 // Here, a stream of response is sent using the for loop.
				responseObserver.onNext(CallResponse.newBuilder().setVal6(Emergency).build());
				responseObserver.onNext(CallResponse.newBuilder().setVal7(Emergency).build());
				responseObserver.onNext(CallResponse.newBuilder().setVal8(Emergency).build());
				 
				responseObserver.onCompleted();
}
}


				
