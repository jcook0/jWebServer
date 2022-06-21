package jHTTPServer.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WebWorker implements Runnable {

	private static final String CONNECTION_HEADER = "Connection";

	private final Socket client = new Socket();
	
	public void run() {
		
	}

	private void closeConnection() {
		try {
			client.close();
		} catch (IOException e) {
			//LOG.error("Failed to close client connection", e);
		}
	}
	
}
