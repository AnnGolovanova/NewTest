package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Goat extends Herbivores {
    //коза
    int num;
    int moov = 3;
    int max = 140;
    final double live = 50;
    double health = 50;
    public Goat() {
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

    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public void setHealth(double val) {
        this.health = val;
    }

    public double getLive() {
        return this.live;
    }


}
