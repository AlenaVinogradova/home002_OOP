/* 2.1 Место обитания
2.2 Дата нахождения */

public abstract class Wild extends Animal{

    String area;
    String dateFinding;

    public Wild(String name, int height, int weight, String eyeColor, String area, String dateFinding) {
        super(name, height, weight, eyeColor);
        this.area = area;
        this.dateFinding = dateFinding;
    }

    // @Override
    // void sound() {
    //     // TODO Auto-generated method stub
        
    // }
    
    @Override
    public String toString() {
        return super.toString() + ", area: " + area + ", date of finding: " + dateFinding;
    }
}
