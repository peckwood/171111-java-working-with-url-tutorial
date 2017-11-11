package com.raidencentral.url_connection_tutorial;

import java.net.*;
import java.io.*;

public class C2_URLReader {
    public static void main(String[] args) throws Exception {

        URL websiteURL = new URL("http://www.sina.com.cn/");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(websiteURL.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}