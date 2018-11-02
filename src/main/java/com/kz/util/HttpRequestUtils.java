package com.kz.util;

import sun.net.www.http.HttpClient;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequestUtils {


    public static String sendPostWithHttpsClient(String method, String reqUrl, String params) throws Exception{

        String result = "";

        try {

            URL url = new URL(reqUrl);

            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

            connection.setRequestMethod(method);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setUseCaches(false);
            connection.connect();

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream(), "utf-8"));
            writer.write(params);
            writer.close();

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = connection.getInputStream();

                byte[] bytes = new byte[inputStream.available()];
                inputStream.read(bytes);

                result = new String(bytes, "utf-8");

            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            return result;
        }


    }




    public static String sendPostWithHttpClient(String method, String reqUrl, String params) throws Exception{

        String result = "";

        try {

            URL url = new URL(reqUrl);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod(method);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setUseCaches(true);
            connection.connect();

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream(), "utf-8"));
            writer.write(params);
            writer.close();

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = connection.getInputStream();

                //byte[] bytes = new byte[inputStream.available()];
                //inputStream.read(bytes);

                //result = new String(bytes, "utf-8");


                /*
                *   byte[] buffer = new byte[4096];
	                int n = 0;
	                while (-1 != (n = input.read(buffer))) {
	                output.write(buffer, 0, n);
                *
                * */

                byte[] bytes = toByteArray(inputStream);


                result = new String(bytes, "utf-8");


            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            return result;
        }


    }


    private static byte[] toByteArray(InputStream input) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int n = 0;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
        }
        return output.toByteArray();
    }


}
