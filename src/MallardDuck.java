public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("look like mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck is plying");
    }

    @Override
    public void quack() {
        System.out.println("Mallard duck is quacking");
    }
}
