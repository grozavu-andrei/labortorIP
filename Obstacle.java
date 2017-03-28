

public class Obstacle implements LevelObjects{

    private int id;

    private String type;

    private String shape;

    private int positionX;

    private int positionY;

    private int hp;

    public Obstacle(int id, String type, String shape, int positionX, int positionY, int hp) {
        this.id = id;
        this.type = type;
        this.shape = shape;
        this.positionX = positionX;
        this.positionY = positionY;
        this.hp = hp;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getShape() {
        return shape;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getHp() {
        return hp;
    }

    public String toString() {
        return "Id: " + this.id + " Type: " + this.type + " Shape: " + this.shape + " Position: " + this.positionX + " " + this.positionY + " HP: " + this.hp;
    }

}