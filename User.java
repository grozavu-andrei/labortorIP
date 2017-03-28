
public class User {

    private int id;

    private String username;

    private String gameInfo;

    private String password;

    public User(int id, String username, String password, String gameInfo) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gameInfo = gameInfo;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    public String getGameInfo() {
        return gameInfo;
    }

}
