package api.features.users.login;

import api.base.BaseApi;
import api.base.BasePost;
import com.google.gson.Gson;
import object.users.User;

public class Login extends BasePost {
    String url = BaseApi.url + "/users/login";

    String username;
    String password;

    public String login(){
        User user = new User(username,password);
        object.users.login.Login login = new object.users.login.Login(user);
        Gson userJson = new Gson();
        addBody(userJson.toJson(login));
        return request(url).body().jsonPath().get("user.token");
    }

    public Login(String username,String password){
        this.username = username;
        this.password = password;
    }

}
