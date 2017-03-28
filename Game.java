
import java.util.ArrayList;

public class Game {

    private ArrayList<Level> levels;
    private static Game instance = null;
    private Integer userId;

    private Game(ArrayList<Level> levels, Integer userId) {
        this.levels = levels;
        this.userId = userId;
    }

    public void setLevels(ArrayList<Level> levels) {
        this.levels = levels;
    }

    public ArrayList<Level> getLevels() {
        return levels;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public static Game getInstance(ArrayList<Level> levels, Integer userId) {
        if (instance == null) {
            instance = new Game(levels, userId);
        }
        return instance;
    }

}
