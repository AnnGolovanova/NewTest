package Animal;

import lombok.Getter;

@Getter
abstract public class Animal {
    abstract public int getNum();

    abstract public int getMax();
    abstract public int getMoov();
    abstract public  boolean isHerbivores() ;
    abstract public double getHealth();
    abstract public double getLive();
    abstract public void setHealth(double val);

}
