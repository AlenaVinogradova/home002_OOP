public class Dog extends Pet{
    private boolean trained;
    
    public Dog(String name, int height, int weight, String eyeColor, 
        String nick, String breed, boolean vaccination, String hairColor, String birth, boolean trained) {
        super(name, height, weight, eyeColor, nick, breed, vaccination, hairColor, birth);
        this.trained = trained;
    }

    void train() {
        System.out.println("training");
    }

    @Override
    public String toString() {
        if (trained == true) return super.toString() + ", trained";
        return super.toString() + ", not trained";
    }

    @Override
    void sound() {
        System.out.println("wuff");
    }
}
