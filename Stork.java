public class Stork extends Bird implements Fly{

 
    public Stork(String name, int height, int weight, String eyeColor, int flight) {
        super(name, height, weight, eyeColor, flight);
    }

    @Override
    public void fly() {
        System.out.println("I fly at " + flight + " meters");
    }

    @Override
    void sound() {
        System.out.println("eae");
    }
    
}
