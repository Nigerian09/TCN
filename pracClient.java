import java.net.*;

public class pracClient{
	public static void main(String args[]){
		try{
			DatagramSocket clientSocket = new DatagramSocket(12345);
			byte[] buffer = new byte[1024];

			System.out.println("CLient is Ready mame..");
			
			while(true){
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
				clientSocket.receive(packet);

				String message = new String(packet.getData(), 0, packet.getLength());
				System.out.println("Received Message: "+ message);
			} 
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}