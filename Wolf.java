public class Wolf extends Wild{
    private boolean leader;

    public Wolf(String name, int height, int weight, String eyeColor, String area, String dateFinding, boolean leader) {
        super(name, height, weight, eyeColor, area, dateFinding);
        this.leader = leader;
    }

    @Override
    void sound() {
        System.out.println("wooo");
    }

    @Override
    public String toString() {
        if (leader == true) return super.toString() + ", leader";
        return super.toString() + ", follower";
    }
}
