package api.features.users.login;

import api.base.BaseApi;
import api.base.BasePost;
import com.google.gson.Gson;
import object.users.UserObject;
import object.users.login.LoginObject;

public class Login extends BasePost {
    String url = BaseApi.url + "/users/login";

    String username;
    String password;

    public String login(){
        UserObject user = new UserObject(username,password);
        LoginObject login = new LoginObject(user);
        Gson userJson = new Gson();
        
        addBody(userJson.toJson(login));
        return request(url).body().jsonPath().get("user.token");
    }

    public Login(String username,String password){
        this.username = username;
        this.password = password;
    }

}
