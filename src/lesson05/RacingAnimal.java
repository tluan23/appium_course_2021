package lesson05;

import java.util.ArrayList;
import java.util.List;

public class RacingAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal tempWinner = dog;
//        dog.setSpeed(100);
//        horse.setSpeed(100);
//        tiger.setSpeed(50);

        List<Animal> list = new ArrayList<Animal>();
        list.add(dog);
        list.add(horse);
        list.add(tiger);

        checkWinner(list,tempWinner);
//        System.out.println("Dog speed: " + dog.getSpeed());
//        System.out.println("Horse speed: " + horse.getSpeed());
//        System.out.println("Tiger speed: " + tiger.getSpeed());

    }
//        public static void checkWinner(List<Animal> list,Animal tempWinner)
//    {
//        for (int i = 1; i < list.size(); i++) {
//            if(list.get(i).getSpeed()>=tempWinner.getSpeed()){
//                tempWinner = list.get(i);
//            }
//        }
//        System.out.println("Winner is: "+tempWinner.getClass().getSimpleName() + " with speed: "+ tempWinner.getSpeed());
//    }
    //the method will show all the winner with the same speed
    public static void checkWinner(List<Animal> list, Animal tempWinner) {
        List<Animal> winnerList = new ArrayList<Animal>();
        winnerList.add(tempWinner);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getSpeed() > tempWinner.getSpeed()) {
                tempWinner = list.get(i);
                for (int i1 = 0; i1 < winnerList.size(); i1++) {
                    winnerList.remove(i1);
                }
                winnerList.add(tempWinner);
            }else if (list.get(i).getSpeed() == tempWinner.getSpeed()){
                tempWinner = list.get(i);
                winnerList.add(tempWinner);
            }
        }
        for (int i = 0; i < winnerList.size(); i++) {
            System.out.println("Winner is: "+winnerList.get(i).getClass().getSimpleName() + " with speed: "+ winnerList.get(i).getSpeed());
        }
    }
}
