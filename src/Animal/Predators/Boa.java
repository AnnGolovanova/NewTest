package Animal.Predators;

import Animal.Predators.Predators;

public class Boa extends Predators {
    int num;
    int moov = 1;
    int max = 30;
    double live = 15;
    double health = live;
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

    @Override
    public int getMoov() {
        return this.moov;
    }
}
