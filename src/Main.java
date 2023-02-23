
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
 *
 *
 * Uses Interface for this.
 * This design is ok but what if you have to change in fly
 * behaviour of all Ducks then you have to do changes in
 * all the Duck subclasses[It can lead to bug also]
 *
 *
 * Uses two interfaces FlyingBehaviour and QuackBehaviour
 * created set of class who implements FlyingBehaviour
 * - FlyWithWings  - FlyNoWay
 * created set of class who implements QuackBehaviour
 * - Quack  - MuteQuack  - Squeak
 *
 * subclasses of duck is
 *     - while making constructor of subclasses :-
 *         - creates an instances of FlyingBehaviour, QuackBehaviour
 */

public class Main {
    public static void main(String[] args) {

        Duck d1 = new MallardDuck();
        d1.display();


        Duck d2 = new RedHeadDuck();
        d2.display();

        Duck d3 = new RubberDuck();
        d3.display();

        Duck d4 = new DecoyDuck();
        d4.display();

    }
}