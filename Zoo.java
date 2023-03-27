import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> zoo = new ArrayList<>();

    ArrayList<Animal> addAnimal(ArrayList<Animal> zoo, Animal animal) {
        zoo.add(animal);
        return zoo;
    }

    ArrayList<Animal> removeAnimal(ArrayList<Animal> zoo, int i) {
        zoo.remove(i);
        return zoo;
    }

    Animal getAnimal(ArrayList<Animal> zoo, int i) {
        return zoo.get(i);
    }







}
