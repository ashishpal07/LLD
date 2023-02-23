
/**
 * 1. SimDuck app
 * every duck can quack and swim
 * every duck will look different
 *
 * 2. Duck can fly as well eg. lets say rubber duck will be there
 *
 * Due to inheritance [Corns]
 * ❏ A. Code is duplicated across subclasses.
 * ❏ B. Runtime behavior changes are difficult.
 * ❏ E. Ducks can’t fly and quack at the same time.
 * ❏ F. Changes can unintentionally affect other ducks
 */

public class Main {
    public static void main(String[] args) {

        Duck d1 = new MallardDuck();
        d1.display();

        Duck d2 = new RedHeadDuck();
        d2.display();

    }
}