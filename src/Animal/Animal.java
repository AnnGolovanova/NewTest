package Animal;

import lombok.Getter;

@Getter
abstract public class Animal {
    abstract public int getNum();

    abstract public int getMax();
    abstract public int getMoov();
    public static boolean isHerbivores() {
        return Animal.isHerbivores();
    }
}
