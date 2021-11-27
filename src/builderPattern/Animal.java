package builderPattern;
import java.security.SecureRandom;
public class Animal {
    private String name;
    private boolean flyable;
    private int speed;

    private Animal(Builder builder) {
        name = builder.name;
        flyable = builder.flyable;
        speed = builder.speed;
    }

    public String getName() {
        return name;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public int getSpeed() {
        return speed;
    }

    // Customer service | inner class
    public static class Builder {
        private String name = "";
        private boolean flyable = true;
        private int speed;
        //Method chaining
    public Builder withName(String name){
        this.name = name;
        return this;
    }
    public Builder withFlyable(boolean flyable){
        this.flyable = flyable;
        return this;
    }
    public Builder withSpeed(int maxSpeed){
        this.speed = new SecureRandom().nextInt(maxSpeed);
        return this;
    }
    public Animal build(){
        return new Animal(this);
    }
}
}
