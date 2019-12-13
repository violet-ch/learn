package httpclient;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class HttpClient {

    public static void main(String[] args) {


    }

    public void doPost(){
        try {
            CloseableHttpClient client = HttpClients.createDefault();
            HttpPost request = new HttpPost();
            request.setEntity(new StringEntity("hello jack","UTF-8"));
            CloseableHttpResponse response = client.execute(request);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doGet(){
        try {
            CloseableHttpClient client = HttpClients.createDefault();
            HttpGet request = new HttpGet();
            CloseableHttpResponse response = client.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
