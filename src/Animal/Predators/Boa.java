package Animal.Predators;

import Animal.Predators.Predators;

public class Boa extends Predators {
    int num;
    int moov = 1;
    int max = 30;
    //удав
    public Boa() {
        this.num ++;
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
