package Animal.Herbivores;

import Animal.Animal;

abstract public class Herbivores extends Animal {

    private int quantity;
    static final boolean isHerbivores = true;

    public Herbivores() {
        this.quantity++;
    }

    public boolean isHerbivores() {
        return isHerbivores;
    }
}
