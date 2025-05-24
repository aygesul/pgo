public class Main {

    public static void main(String[] args) {

        Mammal elephant = new Mammal("elephant", 5, "gray");
        Bird blueJay = new Bird("blueJay", 4, "small");
        Reptile gecko = new Reptile("gecko", 2, 26);

        elephant.makeSound();
        elephant.move();
        elephant.displayInformation();
        elephant.feedMilk();
        blueJay.makeSound();
        blueJay.move();
        blueJay.displayInformation();
        blueJay.layEggs();
        gecko.makeSound();
        gecko.move();
        gecko.displayInformation();
        gecko.shedSkin();

    }

}