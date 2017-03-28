
import java.util.Vector;

public class Pig {

    private Integer idEnemy;

    private Integer positionX;

    private Integer positionY;

    private Integer distance;

    private Integer angle;

    private Integer hp;

    public Integer getIdEnemy() {
        return idEnemy;
    }

    public void setIdEnemy(Integer idEnemy) {
        this.idEnemy = idEnemy;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getAngle() {
        return angle;
    }

    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

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

    public Pig(Integer idEnemy, Integer positionX, Integer positionY, Integer distance, Integer angle, Integer hp) {
        this.idEnemy = idEnemy;
        this.positionX = positionX;
        this.positionY = positionY;
        this.distance = distance;
        this.angle = angle;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "" + this.getIdEnemy() + " " + this.getPositionX() + " " + this.getPositionY() + " " + this.getDistance() + " " + this.getAngle() + " " + this.getHp();
    }

}
