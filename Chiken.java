public class Chiken extends Bird{

    public Chiken(String name, int height, int weight, String eyeColor, int flight) {
        super(name, height, weight, eyeColor, flight);
    }

    @Override
    void sound() {
        System.out.println("cluck-cluck");
    }
    
}
