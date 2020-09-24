package object.users;

public class UserObject {
    String email;
    String password;

    public UserObject(String username, String password){
        this.email = username;
        this.password = password;
    }

    public String getEmail(){
        return email;
    }
}
