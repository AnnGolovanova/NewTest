package Animal.Predators;

import Animal.Predators.Predators;

public class Wolf extends Predators {
    int num;
    int moov = 3;
    int max = 30;

    public Wolf() {
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
