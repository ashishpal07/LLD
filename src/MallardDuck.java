public class MallardDuck extends Duck {

    public MallardDuck () {
        System.out.println("-------MallardDuck-------");
        QuackBehaviour quackBehaviour = new Quack();
        quackBehaviour.quack();
        FlyBehaviour flyBehaviour = new FlyWithWings();
        flyBehaviour.fly();
    }
    @Override
    public void display() {
        System.out.println("look like mallard duck");
    }

}
