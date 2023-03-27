public class Tiger extends Wild{
    public Tiger(String name, int height, int weight, String eyeColor, String area, String dateFinding) {
        super(name, height, weight, eyeColor, area, dateFinding);
    }

    @Override
    void sound() {
        System.out.println("roarrr");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
