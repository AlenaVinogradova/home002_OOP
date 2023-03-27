public abstract class Bird extends Animal{
    int flight;
    
    public Bird(String name, int height, int weight, String eyeColor, int flight) {
        super(name, height, weight, eyeColor);
        this.flight = flight;
    }

    
}
