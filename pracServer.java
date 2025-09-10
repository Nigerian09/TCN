import java.util.*;
import java.net.*;

public class pracServer{
	public static void main(String args[]){
		try{
			DatagramSocket serverSocket = new DatagramSocket();
			InetAddress clientAddress = InetAddress.getByName("localhost");
			int clientPort = 12345;

			Scanner sc = new Scanner(System.in);
			System.out.println("Server is running...");
			while(true){
			System.out.print("Enter a Message: ");
			String message = sc.nextLine();
			byte[] buffer = message.getBytes();
			DatagramPacket packet = new DatagramPacket(
				buffer, buffer.length, clientAddress, clientPort
				);
			serverSocket.send(packet);
			System.out.println("Message is Sent : " + message);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}