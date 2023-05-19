package Animal.Predators;

import Animal.Predators.Predators;

public class Fox extends Predators {
    int num;
    int moov = 2;
    int max = 30;
    public Fox() {
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
