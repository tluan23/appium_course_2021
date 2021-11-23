package lesson05;

public class Horse extends Animal {
    public int speed = randomSpeed(75);

    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
