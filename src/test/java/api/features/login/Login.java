package api.features.login;

import api.base.BaseApi;
import api.base.BasePost;

public class Login extends BasePost {
    String url = BaseApi.url + "/users/login";

    String username;
    String password;

    public String login(){
        addBody("{\"user\":{\"email\":\""+username+"\",\"password\":\""+password+"\"}}");
        return request(url).body().jsonPath().get("user.token");
    }

    public Login(String username,String password){
        this.username = username;
        this.password = password;
    }

}
