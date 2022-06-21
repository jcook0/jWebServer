package jHTTPServer.server;

import java.nio.file.Path;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WebServer {
	
	private static Logger LOGGER = LogManager.getLogger(WebServer.class);
	
	private int port = 0;
	Path docroot;	
	private boolean running = false;
	
	public WebServer(int port, Path docroot) {
		if (port < 0 || port > 65535) {
			throw new IllegalArgumentException("Invalid port. Port must be in the range 0-65535.");
		}
		
		this.port = port;		
		this.docroot = docroot;	
	}
	
	public void start() {
		if (running) {
			this.stop();
		}
		
		LOGGER.info("Starting server on port " + this.port);
		
		running = true;
	}
	
	public void stop() {
		running = false;
	}
}
