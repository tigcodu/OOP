public class Dog extends Animal implements AnimalStuff {
   
    @Override
    public void makeNoise() {
        System.out.println("Arf arf");
    }

    @Override
    public void move() {
        System.out.println("Moving..");
    }

    @Override
    public void eat() {
        System.out.println("Eating..");
    }
    
}
