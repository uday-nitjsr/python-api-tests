package api.base;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class BasePost implements BaseApi {

    private final RequestSpecification httpRequest = RestAssured.given();

    public void addParam(Map<String, ?> map) {
        httpRequest.params(map);
    }

    public Response request(String url) {
        return httpRequest.post(url);
    }

    public void addHeaders(Headers header) {
        httpRequest.headers(header);
    }

    public void addBody(Object body) {
        httpRequest.body(body);
    }
}
