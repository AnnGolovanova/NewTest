package Animal.Predators;

import Animal.Animal;

abstract public class Predators extends Animal {
    private int quantity;

    public Predators() {
        this.quantity++ ;
    }

    public static class Bear extends Predators {
    }
}
