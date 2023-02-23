import javax.sound.midi.Soundbank;

public class DecoyDuck extends Duck {

    public  DecoyDuck () {
        System.out.println("-------DecoyDuck-------");
        QuackBehaviour quackBehaviour = new Squeak();
        quackBehaviour.quack();
        FlyBehaviour flyBehaviour = new FlyNoWay();
        flyBehaviour.fly();
    }

    @Override
    public void display() {
        System.out.println("look like Decoy duck");
    }
}
