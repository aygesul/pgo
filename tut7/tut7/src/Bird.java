public class Bird extends Animal {
    private String wingSize;
     Bird(String name, int age , String wingType) {
         super(name, age);
         this.wingSize = wingType;

    }
    public String getWingSize() {
         return this.wingSize;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " cooed");
    }

    @Override
    public void move() {
        System.out.println(getName() + " flies");
    }

    @Override
    public void displayInformation() {
        System.out.println(getName() + " is a bird aged " +getAge() + " who has " + getWingSize() +" wings");
    }
    public void layEggs(){
         System.out.println(getName() + " lays eggs");
    }
}
