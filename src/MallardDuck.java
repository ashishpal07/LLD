public class MallardDuck extends Duck {

    public MallardDuck () {
        System.out.println("-------MallardDuck-------");
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("look like mallard duck");
    }

}
