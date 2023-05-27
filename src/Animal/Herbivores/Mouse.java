package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Mouse extends Herbivores {
    int num;
    int moov = 1;
    int max = 500;
    final double live = 0.05;
    double health = live;
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
