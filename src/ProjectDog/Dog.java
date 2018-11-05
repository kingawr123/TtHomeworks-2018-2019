package ProjectDog;

public class Dog {
    private String name;
    private String color;
    private int speed;

    public Dog(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }
    public Dog(){}

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
