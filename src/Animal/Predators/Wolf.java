package Animal.Predators;

import Animal.Predators.Predators;

public class Wolf extends Predators {
    int num;
    int moov = 3;
    int max = 30;
    double live = 50;
    double health = live;
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
