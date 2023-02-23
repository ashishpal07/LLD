public class RedHeadDuck extends Duck {

    public RedHeadDuck () {
        System.out.println("-------RedHeadDuck-------");
        QuackBehaviour quackBehaviour = new Quack();
        quackBehaviour.quack();
        FlyBehaviour flyBehaviour = new FlyWithWings();
        flyBehaviour.fly();
    }

    @Override
    public void display() {
        System.out.println("look like red head duck");
    }

}
