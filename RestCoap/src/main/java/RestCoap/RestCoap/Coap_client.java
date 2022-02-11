package RestCoap.RestCoap;

import java.io.IOException;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.elements.exception.ConnectorException;

public class Coap_client {

	public static void main(String[] args) {
		CoapClient client = new CoapClient("coap://172.16.34.118/humidity");
		for(int i = 0; i<10; i++) {
			String text;
			try {
				text = client.get().getResponseText();
				System.out.println("text "+text);
				Thread.sleep(1000);
			} catch (ConnectorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
