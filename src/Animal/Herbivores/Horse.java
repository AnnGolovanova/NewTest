package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Horse extends Herbivores {
    int num;
    int moov = 4;
    int max = 20;
    final double live = 400;
    double health = live;
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
    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public double getLive() {
        return this.live;
    }

    @Override
    public void setHealth(double val) {
        this.health=val;
    }


}
