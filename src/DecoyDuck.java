import javax.sound.midi.Soundbank;

public class DecoyDuck extends Duck {

    public  DecoyDuck () {
        System.out.println("-------DecoyDuck-------");
        quackBehaviour = new Squeak();

        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("look like Decoy duck");
    }
}
