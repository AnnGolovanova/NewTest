package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Mouse extends Herbivores {
    int num;
    int moov = 1;
    int max = 500;
    public Mouse() {
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
