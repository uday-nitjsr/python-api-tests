package object.users;

public class SignUpObject {
    UserObject user;

    public SignUpObject(String username,String email,String password){
        user = new UserObject(email,password);
        user.setUsername(username);
    }
}
