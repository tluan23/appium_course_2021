package lesson05;

public class Tiger extends Animal{
    public int speed = randomSpeed(100);

    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
