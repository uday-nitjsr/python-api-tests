package object.users;

public class UserObject {
    private String email;
    private String password;
    private String username;
    private String bio;
    private String image;


    public UserObject(String email, String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail(){
        return email;
    }

    public void setUsername(String username){
        this.username = username;
    }
}
