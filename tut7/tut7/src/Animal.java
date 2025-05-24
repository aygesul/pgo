public abstract class Animal {
    protected String name;
    protected int age;



    Animal (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;

    }

    public abstract void makeSound();
    public abstract void move();
    public abstract void displayInformation();



}
