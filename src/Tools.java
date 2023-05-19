import Animal.Animal;
import Animal.Herbivores.*;
import Animal.Predators.*;

public class Tools {
    public static Animal creatObj(String nameObj) {
        //возвращает обьект класса
        //String[] f = obj.getClass().getName().split("\\.");
        //String a = f[f.length-1];
        switch (nameObj) {
            case "Bear" -> {
                return new Bear();
            }
            case "Boa" -> {
                return new Boa();
            }
            case "Eagle" -> {
                return new Eagle();
            }
            case "Fox" -> {
                return new Fox();
            }
            case "Wolf" -> {
                return new Wolf();
            }
            case "Sheep" -> {
                return new Sheep();
            }
            case "Rabbit" -> {
                return new Rabbit();
            }
            case "Mouse" -> {
                return new Mouse();
            }
            case "Horse" -> {
                return new Horse();
            }
            case "Goat" -> {
                return new Goat();
            }
            case "Deer" -> {
                return new Deer();
            }
        }
        //return null;
        return null;
    }

    public static double health(Object obj) {
        //берет здоровье
        return 0;
    }

    public static String getType(Object obj) {
        //берет тип животного или говорит что это растение
        return "";
    }

    public static String getName(Object obj) {
        //берет  животного или говорит что это растение
        String[] f = obj.getClass().getName().split("\\.");
        String a = f[f.length - 1];
        return a;
    }

    public static int getQuantity(Object obj) {
        //колличество единиц обьекта
        return 0;
    }

    public static void move(Animal obj) {
        int animal = obj.getNum();

    }

    public static boolean checkAnimal(String nameAnimal, int numRow, int numCol) {

        Island ilond = new Island();
        String[][] mass = ilond.getMass();
        String cells = mass[numCol][numRow];
        if (cells == null) {
            return true;

        }
        String[] newMss = cells.split("#");
        Animal obj = creatObj(nameAnimal);
        int num = obj.getMax();
        int tmpNum = 0;
        for (String x : newMss) {
            if (x == nameAnimal) {
                tmpNum++;
            }
        }
        return num > tmpNum;
    }

    public static int[] getCells(String nameAnimal, int numRow, int numCol) {
        int tmpNumColl = numCol;
        int tmpRowColl = numRow;
        int[] res = new int[1];
        Island ilond = new Island();
        String[][] mass = ilond.getMass();
        while (checkAnimal(nameAnimal, tmpRowColl, tmpNumColl) == false) {
            if (tmpNumColl > ilond.getMass().length) {
                tmpNumColl = 0;
                res[0] = tmpRowColl;
                res[1] = tmpNumColl;
            }
            numCol++;
        }

        return res;
    }

    public static int[] getRundomCells(Animal animal) {

        int tmpNumColl = (int) (animal.getMoov() + Math.random()*10);
        int tmpRowColl = (int) (animal.getNum() + Math.random()*10);

        if (tmpNumColl > 100) {
            tmpNumColl = 1;
        }
        if (tmpRowColl > 20) {
            tmpRowColl = 1;
        }
        int[] res = new int[2];
        res[0] = tmpNumColl;
        res[1] = tmpRowColl;
        return res;
    }
}
