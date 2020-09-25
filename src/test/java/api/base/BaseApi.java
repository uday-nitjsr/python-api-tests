package api.base;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public interface BaseApi {
    public enum MethodType {
        GET, PUT, POST, DELETE;
    }

    RequestSpecification httpRequest = null;
    String url = "http://localhost:3000/api";


    void addParam(Map<String, ?> map);

    Response request(String url);

    void addHeaders(Headers header);

}
