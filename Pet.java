/* 1.1 Кличка
1.2 Порода
1.3 Наличие прививок
1.4 Цвет шерсти
1.5 Дата рождения

1.5 Проявлять ласку */

public abstract class Pet extends Animal{

String nick;
String breed;
boolean vaccination;
String hairColor;
String birth;


    public Pet(String name, int height, int weight, String eyeColor, 
        String nick, String breed, boolean vaccination, String hairColor, String birth) {
        super(name, height, weight, eyeColor);
        this.nick = nick;
        this.breed = breed;
        this.vaccination = vaccination;
        this.hairColor = hairColor;
        this.birth = birth;
    }

    // @Override
    // void sound() {
    //     // TODO Auto-generated method stub
        
    // }

    public void caress(){
        System.out.println("showing affection");
    }

    @Override
    public String toString() {
        if(vaccination == true) return name + " " + breed + " " + nick + " " + height + "sm " + weight + "kg " + 
                eyeColor + " eyes, color: " + hairColor + ", date birth: " + birth + ", vaccinated";
        return name + " " + breed + " " + nick + " " + height + "sm " + weight + "kg " + 
                eyeColor + " eyes, color: " + hairColor + ", date birth: " + birth + ", not vaccinated";
    }

    // @Override
    // void sound() {
    //     System.out.println("sound");
    // }
    
}
