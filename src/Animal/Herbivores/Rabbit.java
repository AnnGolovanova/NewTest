package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Rabbit extends Herbivores {
    int num;
    int moov = 2;
    int max = 150;
    public Rabbit() {
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
