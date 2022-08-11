package MTS;

import java.io.IOException;
import java.util.logging.Logger;

// required grpc package for the server side
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import MTS.MotionTemperatureSensorGrpc.MotionTemperatureSensorImplBase;

public class MTSserver extends MotionTemperatureSensorImplBase{
	// First we create a logger to show server side logs in the console. logger instance will be used to log different events at the server console.
		private static final Logger logger = Logger.getLogger(MTSserver.class.getName());

	// Main method would contain the logic to start the server.	For throws keyword refer https://www.javatpoint.com/throw-keyword
	// NOTE: THIS LOGIC WILL BE SAME FOR ALL THE TYPES OF SERVICES
		 public static void main(String[] args) throws IOException, InterruptedException {
			    
			 // The StringServer is the current file name/ class name. Using an instance of this class different methods could be invoked by the client.
			 MTSserver stringserver = new MTSserver();

			 	// This is the port number where server will be listening to clients. Refer - https://en.wikipedia.org/wiki/Port_(computer_networking) 
			    int port = 50055;
			    
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
			super.lightActivation(request, responseObserver);
			
			
		}

		@Override
		public StreamObserver<TempRegulatorRequest> tempRegulator(
				StreamObserver<TempRegulatorResponse> responseObserver) {
			// TODO Auto-generated method stub
			return super.tempRegulator(responseObserver);
			
			
		}

		 
		 
}
