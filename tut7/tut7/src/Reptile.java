public class Reptile extends Animal {
 private double bodyTemperature;
  Reptile(String name, int age, double bodyTemperature) {
     super(name, age);
     this.bodyTemperature = bodyTemperature;
 }
 public double getBodyTemperature() {
      return this.bodyTemperature;
 }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " makes sound");
    }

    @Override
    public void move() {
        System.out.println(getName() + " crawls");

    }

    @Override
    public void displayInformation() {
        System.out.println(getName() + " is a " + getAge() + " year old Reptile that has a " + getBodyTemperature() + " degree body temperature");

    }

    public void shedSkin(){
        System.out.println(getName() + " sheds its skin");
    }
}
