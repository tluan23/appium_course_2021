package builderPattern;
import java.util.ArrayList;
import java.util.List;

import static builderPattern.Animal.Builder;
public class TestAnimalWithBuilder {
    public static void main(String[] args) {
        Builder builder = new Animal.Builder();
        List<Animal> animals = new ArrayList<>();
        List<Animal> animalsLegal = new ArrayList<>();
        Animal animal1 = builder.withName("Tiger").withSpeed(100).withFlyable(false).build();
        Animal animal2 = builder.withName("Rabbit").withSpeed(70).withFlyable(false).build();
        Animal animal3 = builder.withName("Pig").withSpeed(60).withFlyable(false).build();
        Animal animal4 = builder.withName("Eagle").withSpeed(111).withFlyable(true).build();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        isLegal(animals,animalsLegal);
        checkWinner(animalsLegal, animal1);
        System.out.println(animal1.getName() + animal1.getSpeed());
        System.out.println(animal2.getName() + animal2.getSpeed());
        System.out.println(animal3.getName() + animal3.getSpeed());
        System.out.println(animal4.getName() + animal4.getSpeed());
    }
    public static void isLegal(List<Animal> animals,List<Animal> animalsLegal){
        for (Animal animal : animals) {
            if(!animal.isFlyable())
                animalsLegal.add(animal);
        }
    }
    public static void checkWinner(List<Animal> list, Animal tempWinner) {
        List<Animal> winnerList = new ArrayList<>();
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
        for (Animal animal : winnerList) {
            System.out.println("Winner is: " + animal.getName() + " with speed: " + animal.getSpeed());
        }
    }
}
