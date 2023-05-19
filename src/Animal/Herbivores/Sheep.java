package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Sheep extends Herbivores {
    int num;
    int moov = 3;
    int max = 140;
    public Sheep() {
        this.num++;
    }
    public int getNum() {
        return num;
    }

    @Override
    public int getMax() {
        return this.max;
    }

    public int getMoov() {
        return moov;
    }
}
