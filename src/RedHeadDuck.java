public class RedHeadDuck extends Duck {

    public RedHeadDuck () {
        System.out.println("-------RedHeadDuck-------");
        quackBehaviour = new Quack();

        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("look like red head duck");
    }

}
