
package beispiel;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetMyIPAddress {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress myIP = InetAddress.getLocalHost();

		System.out.println();
		System.out.println(myIP.getLocalHost());
		
	}
    
}
