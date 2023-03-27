import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    static void menu() {
        Animal kotik = new Cat("kotik", 70, 5, "blue", "Barsik", 
            "munchkin", false, "black", "1.4.2017", "shorthair");
        Animal sobaka = new Dog("sobaka", 70, 15, "blue", "Pios", 
            "terrirer", false, "black", "1.4.2015", true);
        Animal volk = new Wolf("volk", 80, 55, "blue", "taiga", "1.1.20", false);
        Animal tigr = new Tiger("tigr", 100, 200, "blue", "taiga", "1.1.20");

        Zoo z = new Zoo();
        ArrayList<Animal> zo = new ArrayList<>();
        zo.add(tigr);
        zo.add(volk);
        zo.add(kotik);
        zo.add(sobaka);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Select option:\n1 - add animal\n2 - remove animal\n3 - find animal\n4 - find all\n5 - make sound\n6 - make all sounds");
        int select = scan.nextInt();
        switch (select) {
            case 1:
                // System.out.println("enter ");
                z.addAnimal(zo, tigr);
                break;
            case 2:
                System.out.println("enter number");
                int r = scan.nextInt();
                z.removeAnimal(zo, r);
                break;
            case 3:
                System.out.println("enter number");
                int g = scan.nextInt();
                System.out.println(z.getAnimal(zo, g));
                break;
            case 4:
                for (Animal animal : zo) {
                    System.out.println(animal);
                }
                break;
            case 5:
                System.out.println("enter number");
                int s = scan.nextInt();
                (z.getAnimal(zo, s)).sound();
                break;
            case 6:
                for (int i = 0; i < zo.size(); i++) {
                    (z.getAnimal(zo, i)).sound();
                }
                break;
            default:
                break;
        }
        scan.close();
    }
}
