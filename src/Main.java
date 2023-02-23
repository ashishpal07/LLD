
/**
 * SimDuck app
 * every duck can quack and swim
 * every duck will look different
 */

public class Main {
    public static void main(String[] args) {

        Duck d1 = new MallardDuck();
        d1.display();

        Duck d2 = new RedHeadDuck();
        d2.display();

    }
}