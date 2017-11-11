package com.raidencentral.url_connection_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class C3_ConnectToURL {
	public static void main(String[] args) {
		try {
		    URL myURL = new URL("http://baidu.com/");
		    URLConnection myURLConnection = myURL.openConnection();
		    myURLConnection.connect();
		} 
		catch (MalformedURLException e) { 
		    // new URL() failed
		    // ...
		} 
		catch (IOException e) {   
		    // openConnection() failed
		    // ...
		}
	}
}
