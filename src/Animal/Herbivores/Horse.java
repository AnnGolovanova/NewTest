package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Horse extends Herbivores {
    int num;
    int moov = 4;
    int max = 20;
    public Horse() {
        this.num++;
    }

    public int getNum() {
        return num;
    }

    @Override
    public int getMax() {
        return this.max;
    }

    @Override
    public int getMoov() {
        return this.moov;
    }
}
