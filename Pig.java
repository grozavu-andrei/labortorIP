

public class Pig implements LevelObjects{

    /**
     * @return the idEnemy
     */
    public int getIdEnemy() {
        return idEnemy;
    }

    /**
     * @param idEnemy the idEnemy to set
     */
    public void setIdEnemy(int idEnemy) {
        this.idEnemy = idEnemy;
    }

    /**
     * @return the positionX
     */
    public int getPositionX() {
        return positionX;
    }

    /**
     * @param positionX the positionX to set
     */
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    /**
     * @return the positionY
     */
    public int getPositionY() {
        return positionY;
    }

    /**
     * @param positionY the positionY to set
     */
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    /**
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     * @return the angle
     */
    public int getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(int angle) {
        this.angle = angle;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

   

    private int idEnemy;

    private int positionX;

    private int positionY;

    private int distance;

    private int angle;

    private int hp;


    public int getPositionX(int positionX) {
        return positionX;
    }
    
    public int getPositionY(int positionY){
        return positionY;
    }

    public int getDistance(int distance) {
        return distance;
    }

    public int getAngle(int angle) {
        return angle;
    }

    public int getHp(int hp) {
        return hp;
    }

    public Pig(int idEnemy, int positionX, int positionY, int distance, int angle, int hp) {
        this.idEnemy = idEnemy;
        this.positionX = positionX;
        this.positionY = positionY;
        this.distance = distance;
        this.angle = angle;
        this.hp = hp;
    }
    
    @Override
    public String toString(){
       
        return ""+this.getIdEnemy()+" "+this.getPositionX()+" "+this.getPositionY()+" "+this.getDistance()+" "+this.getAngle()+" "+this.getHp();
    }
     
}
