package jHTTPServer;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import jHTTPServer.server.WebServer;

/*
 * 	Main.java
 * 	Entry point
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		FileSystem fs = FileSystems.getDefault();
		Path docroot = fs.getPath("docroot");
		
		WebServer server = new WebServer(80, docroot);
		server.start();
	}

}
