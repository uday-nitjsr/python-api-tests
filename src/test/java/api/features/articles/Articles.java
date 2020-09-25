package api.features.articles;

import api.base.BaseApi;
import api.base.BaseGet;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Articles extends BaseGet {
    String url = BaseApi.url + "/articles";
    int limit;
    int offset;
    Response response;

    public void setLimit(int limit) {
        this.limit = limit;
        addQueryParameter("limit",this.limit);
    }

    public void setOffset(int offset) {
        this.offset = offset;
        addQueryParameter("offset",this.offset);
    }

    public void fetchResponse(){
        response = request(url);
    }

    public int getArticleCount(){
        return response.body().jsonPath().get("articlesCount");
    }

    public int getArticleCountOnFeed(){
        return response.body().jsonPath().get("articlesCount");
    }

    public Articles(){
    }

    public Articles(String token){
        Header header = new Header("Authorization","Token "+token);
        addHeader(header);
    }

    public String responseString(){
        return response.body().asString();
    }
}
