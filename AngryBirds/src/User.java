
import java.util.Vector;

public class User {

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the levelInfo
     */
    public String getLevelInfo() {
        return levelInfo;
    }

    /**
     * @param levelInfo the levelInfo to set
     */
    public void setLevelInfo(String levelInfo) {
        this.levelInfo = levelInfo;
    }

    private Integer id;

    private String username;

    private String levelInfo;

    public String getLevelInfo(String levelInfo) {
        return null;
    }

    public User(Integer id, String username, String levelInfo) {
        this.id = id;
        this.username = username;
        this.levelInfo = levelInfo;
    }
    
    

}
