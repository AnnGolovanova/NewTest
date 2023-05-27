package Animal.Predators;

public class Bear extends Predators{
    int num;
    int moov = 2;
    int max = 5;
    double live = 500;
    double health = live;
    public Bear() {
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
