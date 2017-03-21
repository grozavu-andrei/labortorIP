import java.util.Vector;

public class LevelManager extends Bird {

    public LevelManager(Integer id, String name, Integer power, Integer shotTrajectoryId, String color, String type, Integer damage, Vector Shot, Vector myTrajectory, Vector myLevel) {
        super(id, name, power, shotTrajectoryId, color, type, damage, Shot, myTrajectory, myLevel);
    }

    /**
     * @return the birdData
     */
    public String getBirdData() {
        return birdData;
    }

    /**
     * @param birdData the birdData to set
     */
    public void setBirdData(String birdData) {
        this.birdData = birdData;
    }

    /**
     * @return the myUser
     */
    public Vector getMyUser() {
        return myUser;
    }

    /**
     * @param myUser the myUser to set
     */
    public void setMyUser(Vector myUser) {
        this.myUser = myUser;
    }

    /**
     * @return the myLevel
     */
    public Vector getMyLevel() {
        return myLevel;
    }

    /**
     * @param myLevel the myLevel to set
     */
    public void setMyLevel(Vector myLevel) {
        this.myLevel = myLevel;
    }

  private String birdData;

    private Vector  myUser;
    private Vector  myLevel;

  public String getBirdData(String birdData) {
  return null;
  }

  public void collision() {
  }

  public void update() {
  }

}