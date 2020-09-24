package object.users;

public class User {
    String email;
    String password;

    public User(String username,String password){
        this.email = username;
        this.password = password;
    }

    public String getEmail(){
        return email;
    }
}
