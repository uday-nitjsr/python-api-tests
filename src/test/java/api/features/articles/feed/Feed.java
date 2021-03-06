package api.features.articles.feed;

import api.base.BaseApi;
import api.base.BaseGet;
import api.features.users.login.Login;
import io.restassured.http.Header;

public class Feed extends BaseGet {
    String url = BaseApi.url + "/articles/feed";
    Login login;
    int limit;
    int offset;

    public void setLimit(int limit) {
        this.limit = limit;
        addQueryParameter("limit",limit);
    }

    public void setOffset(int offset) {
        this.offset = offset;
        addQueryParameter("offset",offset);
    }

    public int getArticleCount(){
        return request(url).body().jsonPath().get("articlesCount");
    }

    public int getArticleCountOnFeed(){
        return request(url).body().jsonPath().get("articlesCount");
    }

    public Feed(String token){
        Header header = new Header("Authorization","Token "+token);
        addHeader(header);
    }
}
