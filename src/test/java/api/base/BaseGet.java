package api.base;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import java.util.Map;

public class BaseGet implements BaseApi{

    public void addParam(Map<String, ?> map) {
        httpRequest.params(map);
    }

    public Response request(String url){
        return httpRequest.get(url);
    }

    public void addHeaders(Headers header) {
        httpRequest.headers(header);
    }

    public void addHeader(Header header){
        httpRequest.header(header);
    }
}
