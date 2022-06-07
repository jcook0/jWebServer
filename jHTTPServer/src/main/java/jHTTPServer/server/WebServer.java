package jHTTPServer.server;

import java.nio.file.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WebServer {
	
	int PORT = 80;
	Path docroot;
	
	private static Logger LOGGER = LogManager.getLogger(WebServer.class);
	
	private boolean running = false;
	
	public WebServer(int port, Path docroot) {
		
		if (port < 0 || port > 65535) {
			throw new IllegalArgumentException("Port must be in the range 0-65535.");
		}
		
		this.PORT = port;
		this.docroot = docroot;
	}
	
	public void start() {
		
		if (running) {
			this.stop();
		}
		
		LOGGER.info("Starting server on port " + PORT);
		
		running = true;
	}
	
	public void stop() {
		
		
		
		running = false;
	}
}
