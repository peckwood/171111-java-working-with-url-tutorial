package com.raidencentral.url_connection_tutorial;

import java.io.*;
import java.net.*;

public class C6_GenerateContract {
    public static void main(String[] args) throws Exception {

        //String parentSpu = URLEncoder.encode("0010-PUSP-0021", "UTF-8");
        String parentSpu ="0010-PUSP-0021";

        URL url = new URL("http://tg.kkzhuang.com:8080/baasanc/KKZhuang/KKZAncient/ListMerchandiseByParentSpu");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
       conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setDoOutput(true);

        OutputStreamWriter out = new OutputStreamWriter(
                                         conn.getOutputStream());
        out.write("parentSpu=" + parentSpu);
        out.close();

        BufferedReader in = new BufferedReader(
                                    new InputStreamReader(
                                    conn.getInputStream()));
        String decodedString;
        while ((decodedString = in.readLine()) != null) {
            System.out.println(decodedString);
        }
        in.close();
    }
}