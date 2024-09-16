package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Deer extends Herbivores {
//олень
    int num;
    int moov = 4;
    int max = 20;
    final double live = 300;
    double health = 300;
    public Deer() {
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

    public  double getLive() {
        return this.live;
    }

}
