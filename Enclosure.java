import java.util.ArrayList;
import java.util.List;

class Enclosure {
    private String name;
    private List<Animal> animals;

    public Enclosure(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void simulateBehaviors() {
        System.out.println("--- Simulating Behaviors in " + name + " ---");
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            if (animal instanceof Mammal) {
                ((Mammal) animal).nurse();
            } else if (animal instanceof Bird) {
                ((Bird) animal).layEggs();
            }
        }
    }
}