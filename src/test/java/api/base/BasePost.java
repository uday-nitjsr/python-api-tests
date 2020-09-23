package api.base;

import io.restassured.http.Headers;
import io.restassured.response.Response;

import java.util.Map;

public class BasePost implements BaseApi {
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
