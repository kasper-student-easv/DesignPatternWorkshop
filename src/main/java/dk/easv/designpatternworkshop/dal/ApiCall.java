package dk.easv.designpatternworkshop.dal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiCall {

    String baseurl = "http://10.5.10.10:8080/fox/commands/";

    public void getConfig(int id) throws Exception {
        URL url = new URL(baseurl+"get/"+id);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");


    }



    public static void main() throws Exception {
        URL url = new URL("http://10.5.10.10:8080/fox/commands/get");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        System.out.println(content);
    }
}
