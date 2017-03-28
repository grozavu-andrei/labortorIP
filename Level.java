
import java.util.ArrayList;
import java.util.Vector;

public class Level {

    private ArrayList<Bird> birds;

    private ArrayList<Pig> pigs;

    private ArrayList<Obstacle> obstacles;

    private LevelManager manager;

    private int levelId;
    
     public Level(ArrayList<Bird> birds, ArrayList<Pig> pigs, ArrayList<Obstacle> obstacles, LevelManager manager, int levelId) {
        this.birds = birds;
        this.pigs = pigs;
        this.obstacles = obstacles;
        this.manager = manager;
        this.levelId = levelId;

    }


    public ArrayList<Bird> getBirds() {
        return birds;
    }

    public void setBirds(ArrayList<Bird> birds) {
        this.birds = birds;
    }

    public ArrayList<Pig> getPigs() {
        return pigs;
    }

    public void setPigs(ArrayList<Pig> pigs) {
        this.pigs = pigs;
    }

    public ArrayList<Obstacle> getObstacles() {
        return obstacles;
    }

    public void setObstacles(ArrayList<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public int getNumberOfBirds() {
        return birds.size();
    }

    public int getNumberOfPigs() {
        return pigs.size();
    }

    public int getNumberOfObstacles() {
        return obstacles.size();
    }
    
    

   
}
