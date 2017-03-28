public class Bird implements LevelObjects{

    private int id;

    private String name;

    private String power;

    private String color;

    private String type;

    private int damage;

    public Bird(int id, String name, String power, String color, String type, int damage) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.color = color;
        this.type = type;
        this.damage = damage;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPower() {
        return this.power;
    }

    public String getColor() {
        return this.color;
    }

    public String getType() {
        return this.type;
    }

    public int getDamage() {
        return this.damage;
    }

    public Integer getNextBird(int id) {
        return null;
    }

    public Integer shot(int shotTrajectoryId) {
        return null;
    }

    public String toString() {
        return "Id: " + this.id + " Name: " + this.name + " Power : " + this.power + " Color: " + this.color + " Type: " + this.type + " Damage: " + this.damage;
    }

}