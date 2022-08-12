package Authorization;

//required java packages for the program. Depends on your logic.
import java.util.logging.Level;
import java.util.logging.Logger;

//required grpc package for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import Authorization.Message.Enum;
import Authorization.Empty;
import Authorization.Message;
import Authorization.AuthorizationClient;
import Authorization.LoginRequest;
import Authorization.LoginResponse;
import Authorization.AuthorizationGrpc;

public class AuthorizationClient {
	// First we create a logger to show client side logs in the console. logger instance will be used to log different events at the client console.
		// This is optional. Could be used if needed.
		private static  Logger logger = Logger.getLogger(AuthorizationClient.class.getName());

		// Creating stubs for establishing the connection with server.
		// Blocking stub
		private static AuthorizationGrpc.AuthorizationBlockingStub blockingStub;
		// Asynch stub
		private static AuthorizationGrpc.AuthorizationStub asyncStub;
		
		// The main method will have the logic for client.
		public static void main(String[] args) throws Exception {
		// First a channel is being created to the server from client. Here, we provide the server name (localhost) and port (50055).
			// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

			//stubs -- generate from proto
			blockingStub = AuthorizationGrpc.newBlockingStub(channel);
			asyncStub = AuthorizationGrpc.newStub(channel);

			// Unary RPC call
			  login();
			  floorUnitSelection();

			//  empty(); 	//passing an empty message - no server reply, error message

			// Closing the channel once message has been passed.		
			channel.shutdown();

		}
		
		public static void login() {
			// First creating a request message. Here, the message contains a string in setVal
			LoginRequest req = LoginRequest.newBuilder().setVal1("Joshua").build();
			//  Calling a remote RPC method using blocking stub defined in main method. req is the message we want to pass.
			LoginResponse response = blockingStub.login(req);

			//response contains the output from the server side. Here, we are printing the value contained by response. 
			//System.out.println(response.getVal2());
			System.out.println(response.getVal2());
			System.out.println("***************************************************");
			System.out.println("***************************************************");
			
		}
		
		public static void floorUnitSelection () {
			
			System.out.println("***************************************************");
			System.out.println("***************************************************");
			// First creating a request message. Here, the message contains a string in setVal
			FloorUnitSelectionRequest req = FloorUnitSelectionRequest.newBuilder().setVal3("one").build();
			//  Calling a remote RPC method using blocking stub defined in main method. req is the message we want to pass.
			FloorUnitSelectionResponse response = blockingStub.floorUnitSelection(req);

			//response contains the output from the server side. Here, we are printing the value contained by response. 
			System.out.println(response.getVal4());
		}
		
		
		
		public static void empty() {
			// First creating a request message. Here, the message contains emply message as defined in proto enum
			Message req = Message.newBuilder().setDetail(Enum.UNKNOWN).build();
			try {
				// Calling a remote RPC method using blocking stub defined in main method. req is the message we want to pass.
				Empty response = blockingStub.empty(req);
				//response contains the output from the server side. Here, we are printing the value contained by response.
				System.out.println("one response " + response.toString());

			}catch(StatusRuntimeException ex) {
				// Print if any error/exception is generated.
				System.out.println( ex.getMessage());
				//ex.printStackTrace();
			}
		
		}
}
