package api.features.articles;

import api.features.login.Login;
import api.base.BaseApi;
import api.base.BaseGet;
import io.restassured.http.Header;

public class Articles extends BaseGet {
    String url = BaseApi.url + "/articles";
    Login login;
    public int getArticleCount(){
        return request(url).body().jsonPath().get("articlesCount");
    }

    public int getArticleCountOnFeed(){
        return request(url).body().jsonPath().get("articlesCount");
    }

    public Articles(){

    }

    public Articles(String token){
        Header header = new Header("Authorization","Token "+token);
        addHeader(header);
    }


}
