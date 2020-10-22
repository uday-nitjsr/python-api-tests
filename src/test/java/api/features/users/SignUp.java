package api.features.users;

import api.base.BaseApi;
import api.base.BasePost;
import com.google.gson.Gson;
import object.users.SignUpObject;

public class SignUp extends BasePost {

    String url = BaseApi.url + "/users";

    private String username;
    private String email;
    private String password;

    public String signUp(){
        SignUpObject signUpObject = new SignUpObject(username,email,password);
        Gson userJson = new Gson();

        addBody(userJson.toJson(signUpObject));
        return request(url).body().jsonPath().get("user.token");
    }

    public SignUp(String username,String email,String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
