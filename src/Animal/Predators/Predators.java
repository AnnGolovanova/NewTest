package Animal.Predators;

import Animal.Animal;

abstract public class Predators extends Animal {
    private int quantity;
    static final boolean isHerbivores = false;

    public Predators() {
        this.quantity++;
    }

    public static boolean isHerbivores() {
        return isHerbivores;
    }

}
