import java.util.Vector;

public class Bird {

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the power
     */
    public Integer getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * @return the shotTrajectoryId
     */
    public Integer getShotTrajectoryId() {
        return shotTrajectoryId;
    }

    /**
     * @param shotTrajectoryId the shotTrajectoryId to set
     */
    public void setShotTrajectoryId(Integer shotTrajectoryId) {
        this.shotTrajectoryId = shotTrajectoryId;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the damage
     */
    public Integer getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    /**
     * @return the Shot
     */
    public Vector getShot() {
        return Shot;
    }

    /**
     * @param Shot the Shot to set
     */
    public void setShot(Vector Shot) {
        this.Shot = Shot;
    }

    /**
     * @return the myTrajectory
     */
    public Vector getMyTrajectory() {
        return myTrajectory;
    }

    /**
     * @param myTrajectory the myTrajectory to set
     */
    public void setMyTrajectory(Vector myTrajectory) {
        this.myTrajectory = myTrajectory;
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

  private Integer id;

  private String name;

  private Integer power;

  private Integer shotTrajectoryId;

  private String color;

  private String type;

  private Integer damage;

    private Vector  Shot;
    private Vector  myTrajectory;
    private Vector  myLevel;
  
  public Integer getNextBird(int id) {
  return null;
  }

  public Integer shot(int shotTrajectoryId) {
  return null;
  }

  public Integer powerDamage(int damage) {
  return null;
  }

    public Bird(Integer id, String name, Integer power, Integer shotTrajectoryId, String color, String type, Integer damage, Vector Shot, Vector myTrajectory, Vector myLevel) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.shotTrajectoryId = shotTrajectoryId;
        this.color = color;
        this.type = type;
        this.damage = damage;
        this.Shot = Shot;
        this.myTrajectory = myTrajectory;
        this.myLevel = myLevel;
    }
  
  

}