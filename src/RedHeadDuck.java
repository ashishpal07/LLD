public class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("look like red head duck");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying");
    }

    @Override
    public void quack() {
        System.out.println("Red head duck is quacking");
    }
}
