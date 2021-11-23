package lesson05;

public class Dog extends Animal{
    public int speed = randomSpeed(60);

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
