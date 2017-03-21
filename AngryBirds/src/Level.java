
import java.util.ArrayList;
import java.util.Vector;

public class Level {

    /**
     * @return the birds
     */
    public ArrayList<Bird> getBirds() {
        return birds;
    }

    /**
     * @param birds the birds to set
     */
    public void setBirds(ArrayList<Bird> birds) {
        this.birds = birds;
    }

    /**
     * @return the pigs
     */
    public ArrayList<Pig> getPigs() {
        return pigs;
    }

    /**
     * @param pigs the pigs to set
     */
    public void setPigs(ArrayList<Pig> pigs) {
        this.pigs = pigs;
    }

    /**
     * @return the obstacles
     */
    public ArrayList<Obstacle> getObstacles() {
        return obstacles;
    }

    /**
     * @param obstacles the obstacles to set
     */
    public void setObstacles(ArrayList<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    /**
     * @return the manager
     */
    public LevelManager getManager() {
        return manager;
    }

    /**
     * @param manager the manager to set
     */
    public void setManager(LevelManager manager) {
        this.manager = manager;
    }

    /**
     * @return the levelId
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * @param levelId the levelId to set
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    /**
     * @return the myObstacle
     */
    public Vector getMyObstacle() {
        return myObstacle;
    }

    /**
     * @param myObstacle the myObstacle to set
     */
    public void setMyObstacle(Vector myObstacle) {
        this.myObstacle = myObstacle;
    }

    /**
     * @return the myBird
     */
    public Vector getMyBird() {
        return myBird;
    }

    /**
     * @param myBird the myBird to set
     */
    public void setMyBird(Vector myBird) {
        this.myBird = myBird;
    }

    /**
     * @return the myGame
     */
    public Vector getMyGame() {
        return myGame;
    }

    /**
     * @param myGame the myGame to set
     */
    public void setMyGame(Vector myGame) {
        this.myGame = myGame;
    }

    private ArrayList<Bird> birds;

    private ArrayList<Pig> pigs;

    private ArrayList<Obstacle> obstacles;

    private LevelManager manager;

    private Integer levelId;

    private Vector myObstacle;
    private Vector myBird;
    private Vector myGame;

    public Integer getNumberOfBirds(ArrayList<Bird> birds) {
        return null;
    }

    public Integer getNumberOfPigs(ArrayList<Pig> pigs) {
        return null;
    }

    public Integer getObstacles(ArrayList<Obstacle> obstacles) {
        return null;
    }

    public Level(ArrayList<Bird> birds, ArrayList<Pig> pigs, ArrayList<Obstacle> obstacles, LevelManager manager, Integer levelId, Vector myObstacle, Vector myBird, Vector myGame) {
        this.birds = birds;
        this.pigs = pigs;
        this.obstacles = obstacles;
        this.manager = manager;
        this.levelId = levelId;
        this.myObstacle = myObstacle;
        this.myBird = myBird;
        this.myGame = myGame;
    }
    
    
}
