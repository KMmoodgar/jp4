package RestCoap.RestCoap;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class MyResource1 extends CoapResource {
	public MyResource1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private int i=0;
	
	
	@Override
	public void handleGET(CoapExchange exchange) {
		exchange.respond("hello world"+i++);
	}

	public static void main(String[] args) {
		CoapServer server = new CoapServer();
		server.add(new MyResource1("hello"));
		server.add(new MyResource1("hello1"));
		server.start();

	}

}
