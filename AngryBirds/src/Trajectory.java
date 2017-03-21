
import java.util.Vector;

public class Trajectory {

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
     * @return the x
     */
    public Integer getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public Integer getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * @return the z
     */
    public Integer getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(Integer z) {
        this.z = z;
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

    private Integer id;

    private Integer x;

    private Integer y;

    private Integer z;

    private Vector myBird;

    public void clear() {
    }

    public void rotateAround() {
    }

    public void set() {
    }

    public Trajectory(Integer id, Integer x, Integer y, Integer z, Vector myBird) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.z = z;
        this.myBird = myBird;
    }

    
}
