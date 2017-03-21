
import java.util.Vector;

public class Pig {

    /**
     * @return the idEnemy
     */
    public Integer getIdEnemy() {
        return idEnemy;
    }

    /**
     * @param idEnemy the idEnemy to set
     */
    public void setIdEnemy(Integer idEnemy) {
        this.idEnemy = idEnemy;
    }

    /**
     * @return the positionX
     */
    public Integer getPositionX() {
        return positionX;
    }

    /**
     * @param positionX the positionX to set
     */
    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    /**
     * @return the positionY
     */
    public Integer getPositionY() {
        return positionY;
    }

    /**
     * @param positionY the positionY to set
     */
    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    /**
     * @return the distance
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    /**
     * @return the angle
     */
    public Integer getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    /**
     * @return the hp
     */
    public Integer getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(Integer hp) {
        this.hp = hp;
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

    private Integer idEnemy;

    private Integer positionX;

    private Integer positionY;

    private Integer distance;

    private Integer angle;

    private Integer hp;

    private Vector Shot;
    private Vector myLevel;

    public Integer getPosition(int positionX, int positionY) {
        return null;
    }

    public Integer getDistance(int distance) {
        return null;
    }

    public Integer getAngle(int angle) {
        return null;
    }

    public Integer getHp(int hp) {
        return null;
    }

    public Pig(Integer idEnemy, Integer positionX, Integer positionY, Integer distance, Integer angle, Integer hp, Vector Shot, Vector myLevel) {
        this.idEnemy = idEnemy;
        this.positionX = positionX;
        this.positionY = positionY;
        this.distance = distance;
        this.angle = angle;
        this.hp = hp;
        this.Shot = Shot;
        this.myLevel = myLevel;
    }

     
}
