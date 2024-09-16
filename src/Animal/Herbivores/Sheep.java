package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Sheep extends Herbivores {
    int num;
    int moov = 3;
    int max = 140;
    double live = 140;
    double health = live;
    public Sheep() {
        this.num++;
    }
    public int getNum() {
        return num;
    }

    @Override
    public int getMax() {
        return this.max;
    }

    public int getMoov() {
        return moov;
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
