public class Cat extends Pet{
    private String fur;
    
    public Cat(String name, int height, int weight, String eyeColor, 
        String nick, String breed, boolean vaccination, String hairColor, String birth, String fur) {
        super(name, height, weight, eyeColor, nick, breed, vaccination, hairColor, birth);
        this.fur = fur;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + fur;
    }

    @Override
    void sound() {
        System.out.println("meow");
    }
}
