public class RubberDuck extends Duck {

    public RubberDuck () {
        System.out.println("-------RubberDuck-------");
        QuackBehaviour quackBehaviour = new MuteQuack();
        quackBehaviour.quack();
        FlyBehaviour flyBehaviour = new FlyNoWay();
        flyBehaviour.fly();
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
}
