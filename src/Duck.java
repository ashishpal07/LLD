public abstract class Duck {

    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public Duck () {}

    public void performFly () {
        flyBehaviour.fly();
    }

    public void performQuack () {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All this Duck is swimming");
    }

    public abstract void display ();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
