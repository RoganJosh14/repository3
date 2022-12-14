package Authorization;


	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.jmdns.JmDNS;
	import javax.jmdns.ServiceEvent;
	import javax.jmdns.ServiceInfo;
	import javax.jmdns.ServiceListener;
	import javax.swing.BoxLayout;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

import Authorization.AuthorizationGrpc.AuthorizationBlockingStub;
import Authorization.AuthorizationGrpc.AuthorizationStub;

import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.DefaultComboBoxModel;
	import java.awt.FlowLayout;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTextArea;

	import Authorization.LoginRequest;
	import Authorization.AuthorizationGrpc.AuthorizationBlockingStub;
	import Authorization.AuthorizationGrpc.AuthorizationStub;
	import io.grpc.ManagedChannel;
	import io.grpc.ManagedChannelBuilder;


	import java.awt.event.ActionListener;
	import java.io.IOException;
	import java.net.InetAddress;
	import java.net.UnknownHostException;
	import java.awt.event.ActionEvent;

public class AuthorizationGUI {
		
		private static AuthorizationBlockingStub blockingStub;
		private static AuthorizationStub asyncStub;

		private ServiceInfo AuthorizationServiceInfo;
		
		
		private JFrame frame;
		private JTextField textNumber1;
		private JTextField textNumber2;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						AuthorizationGUI window = new AuthorizationGUI();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public AuthorizationGUI() {
			
			String math_service_type = "_login._tcp.local.";
			discoverMathService(math_service_type);
			
			String host = AuthorizationServiceInfo.getHostAddresses()[0];
			int port = AuthorizationServiceInfo.getPort();
			
			ManagedChannel channel = ManagedChannelBuilder
					.forAddress(host, port)
					.usePlaintext()
					.build();

			//stubs -- generate from proto
			blockingStub = AuthorizationGrpc.newBlockingStub(channel);

			asyncStub = AuthorizationGrpc.newStub(channel);

			
			initialize();
		}

		
		
		private void discoverMathService(String service_type) {
			
			
			try {
				// Create a JmDNS instance
				JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

					
				jmdns.addServiceListener(service_type, new ServiceListener() {
					
					@Override
					public void serviceResolved(ServiceEvent event) {
						System.out.println("Math Service resolved: " + event.getInfo());

						AuthorizationServiceInfo = event.getInfo();

						int port = AuthorizationServiceInfo.getPort();
						
						System.out.println("resolving " + service_type + " with properties ...");
						System.out.println("\t port: " + port);
						System.out.println("\t type:"+ event.getType());
						System.out.println("\t name: " + event.getName());
						System.out.println("\t description/properties: " + AuthorizationServiceInfo.getNiceTextString());
						System.out.println("\t host: " + AuthorizationServiceInfo.getHostAddresses()[0]);
					
						
					}
					
					@Override
					public void serviceRemoved(ServiceEvent event) {
						System.out.println("Math Service removed: " + event.getInfo());

						
					}
					
					@Override
					public void serviceAdded(ServiceEvent event) {
						System.out.println("Math Service added: " + event.getInfo());

						
					}
				});
				
				// Wait a bit
				Thread.sleep(2000);
				
				jmdns.close();

			} catch (UnknownHostException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setTitle("Client - Service Controller");
			frame.setBounds(100, 100, 500, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
			
			frame.getContentPane().setLayout(bl);
			
			JPanel panel_service_1 = new JPanel();
			frame.getContentPane().add(panel_service_1);
			panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JLabel lblNewLabel_1 = new JLabel("Number 1");
			panel_service_1.add(lblNewLabel_1);
			
			textNumber1 = new JTextField();
			panel_service_1.add(textNumber1);
			textNumber1.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Number 2");
			panel_service_1.add(lblNewLabel_2);
			
			textNumber2 = new JTextField();
			panel_service_1.add(textNumber2);
			textNumber2.setColumns(10);
			
			
		}
}

