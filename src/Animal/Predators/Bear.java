package Animal.Predators;

public class Bear extends Predators{
    int num;
    int moov = 2;
    int max = 5;
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
}
