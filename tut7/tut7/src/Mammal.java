public class Mammal extends Animal {
    private String color;
    Mammal(String name, int age, String color) {
        super(name, age);
        this.color = color;

    }
    public String getColor() {
        return this.color;
    }
    @Override
    public void makeSound() {
        System.out.println( getName() + " makes a sound");
    }

    @Override
    public void move() {
        System.out.println(getName() +" walks");
    }

    @Override
    public void displayInformation() {
        System.out.println( "the animal is a/an " + getColor() + " " + getName() + " who is  " + getAge() + " years old");
    }
    public void feedMilk(){
        System.out.println(getName() + " feeds milk");

    }
}
