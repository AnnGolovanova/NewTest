package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Rabbit extends Herbivores {
    int num;
    int moov = 2;
    int max = 150;
    double live = 2;
    double health = live;
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
    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public double getLive() {
        return this.live;;
    }

    @Override
    public void setHealth(double val) {
        this.health = val;
    }
}
