package com.raidencentral.url_connection_tutorial;

import java.net.*;
import java.io.*;

public class C4_URLConnectionReader {
    public static void main(String[] args) throws Exception {
        URL oracle = new URL("http://www.baidu.com/");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}
