
import java.util.Vector;

public class Obstacle {

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
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * @param shape the shape to set
     */
    public void setShape(String shape) {
        this.shape = shape;
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

    private String type;

    private String shape;

    private Integer positionX;

    private Integer positionY;

    private Integer hp;

    private Integer id;

    private Vector myLevel;

    public Integer getPosition(int positionX, int positionY) {
        return null;
    }

    public Integer getHp(int hp) {
        return null;
    }

    public Obstacle(String type, String shape, Integer positionX, Integer positionY, Integer hp, Integer id, Vector myLevel) {
        this.type = type;
        this.shape = shape;
        this.positionX = positionX;
        this.positionY = positionY;
        this.hp = hp;
        this.id = id;
        this.myLevel = myLevel;
    }

      
}
