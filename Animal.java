/* 1.Рост животного
2.Вес животного
3.Цвет глаз животного

1.Издать звук
2.Напечатать информацию о животном */

public abstract class Animal {
    protected String name;
    protected int height;
    protected int weight;
    protected String eyeColor;             
                      
    public Animal(String name, int height, int weight, String eyeColor) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }
    
    abstract void sound();

    @Override
    public String toString() {
        return name + " " + height + "sm " + weight + "kg " + eyeColor + " eyes";
    }

}
