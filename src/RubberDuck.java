public class RubberDuck extends Duck {

    public RubberDuck () {
        System.out.println("-------RubberDuck-------");
        quackBehaviour = new MuteQuack();

        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
}
