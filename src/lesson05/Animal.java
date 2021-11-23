package lesson05;

import java.security.SecureRandom;


public class Animal {
    public Animal() {
    }

    public static int randomSpeed(int maxSpeed){
        int randomSpeed = new SecureRandom().nextInt(maxSpeed);
        return randomSpeed;
    }

    public int getSpeed() {
        return 0;
    }
    public void setSpeed(int speed) {
    }
}
