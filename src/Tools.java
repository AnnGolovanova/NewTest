import Animal.Animal;
import Animal.Herbivores.*;
import Animal.Predators.*;

import java.util.HashMap;
import java.util.Map;

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


    public static boolean checkAnimal(String nameAnimal, int numRow, int numCol) {

        String[][] mass = Island.getMass();
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

        String[][] mass = Island.getMass();
        while (checkAnimal(nameAnimal, tmpRowColl, tmpNumColl) == false) {
            if (tmpNumColl > mass.length) {
                tmpNumColl = 0;
                res[0] = tmpRowColl;
                res[1] = tmpNumColl;
            }
            numCol++;
        }

        return res;
    }

    public static int[] getRundomCells(Animal animal) {

        int tmpNumColl = (int) (animal.getMoov() + Math.random() * 10);
        int tmpRowColl = (int) (animal.getNum() + Math.random() * 10);

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

    public static void rundomGo() {
        Animal bear1 = Tools.creatObj("Bear");
        Animal boa = Tools.creatObj("Boa");
        Animal eagle = Tools.creatObj("Eagle");
        Animal fox = Tools.creatObj("Fox");
        Animal wolf = Tools.creatObj("Wolf");
        Animal sheep = Tools.creatObj("Sheep");
        Animal rabbit = Tools.creatObj("Rabbit");
        Animal mouse = Tools.creatObj("Mouse");
        Animal horse = Tools.creatObj("Horse");
        Animal goat = Tools.creatObj("Goat");
        Animal deer = Tools.creatObj("Deer");
        Island myIland = new Island();
        //myIland.setMass(bear1, bear1.getNum(), 1);
        for (int i = 0; i < 6; i++) {
            int[] cell1 = Tools.getRundomCells(bear1);
            int[] cell2 = Tools.getRundomCells(boa);
            int[] cell3 = Tools.getRundomCells(eagle);
            int[] cell4 = Tools.getRundomCells(fox);
            int[] cell5 = Tools.getRundomCells(wolf);
            int[] cell6 = Tools.getRundomCells(sheep);
            int[] cell7 = Tools.getRundomCells(rabbit);
            int[] cell8 = Tools.getRundomCells(mouse);
            int[] cell9 = Tools.getRundomCells(horse);
            int[] cell10 = Tools.getRundomCells(goat);
            int[] cell11 = Tools.getRundomCells(deer);

            myIland.setMass(bear1, cell1[0], cell1[1]);
            myIland.setMass(boa, cell2[0], cell2[1]);
            myIland.setMass(eagle, cell3[0], cell3[1]);
            myIland.setMass(fox, cell4[0], cell4[1]);
            myIland.setMass(wolf, cell5[0], cell5[1]);
            myIland.setMass(sheep, cell6[0], cell6[1]);
            myIland.setMass(rabbit, cell7[0], cell7[1]);
            myIland.setMass(mouse, cell8[0], cell8[1]);
            myIland.setMass(horse, cell9[0], cell9[1]);
            myIland.setMass(goat, cell10[0], cell10[1]);
            myIland.setMass(deer, cell11[0], cell11[1]);
        }
    }

    public static void move() {
        //int animal = obj.getNum();
        String[][] massIsland = Island.getMass();
        for (int i = 0; i < massIsland.length; i++) {

            for (int j = 0; j < massIsland[i].length; j++) {
                if (massIsland[i][j] != null) {
                    String[] tmp = massIsland[i][j].split("#");
                    for (int k = 0; k < tmp.length; k++) {
                        Animal animal = Tools.creatObj(tmp[k]);
                        if (animal != null) {
                            int[] cell = Tools.getRundomCells(animal);
                            Island.setMass(animal, cell[0], cell[1]);
                        }
                    }
                }

            }
        }

    }

    public static void eat() {
        HashMap<String, Integer> mapEat = new HashMap<>();
        mapEat.put("Wolf#Horse",10);
        mapEat.put("Wolf#Deer",15);
        mapEat.put("Wolf#Rabbit",60);
        mapEat.put("Wolf#Goat",60);
        mapEat.put("Wolf#Sheep",70);
        mapEat.put("Wolf#Mouse",80);

        mapEat.put("Boa#Rabbit",20);
        mapEat.put("Boa#Mouse",40);

        mapEat.put("Fox#Rabbit",70);
        mapEat.put("Fox#Mouse",90);

        mapEat.put("Bear#Horse",40);
        mapEat.put("Bear#Deer",80);
        mapEat.put("Bear#Rabbit",80);
        mapEat.put("Bear#Goat",70);
        mapEat.put("Bear#Sheep",70);
        mapEat.put("Bear#Mouse",90);

        mapEat.put("Eagle#Rabbit",90);
        mapEat.put("Eagle#Mouse",90);

        String[][] massIsland = Island.getMass();
        for (int i = 0; i < massIsland.length; i++) {
            for (int j = 0; j < massIsland[i].length; j++) {
                if (massIsland[i][j] != null) {
                    String[] tmp = massIsland[i][j].split("#");

                }

            }
        }
    }
    public static boolean randomProbability(int procent){
        int res = (int) (Math.random() * 100);
        return res<procent;
    }
    public static void eat(String[] massCells){
        for (int k = 0; k < massCells.length; k++) {
            Animal animal = Tools.creatObj(massCells[k]);
            String[] tmpMass;
            if (animal != null) {
                boolean isPredators = true;
                while (isPredators == false){
                    for (int i = 0; i < massCells.length; i++) {
                        if (Animal.isHerbivores() == false){
                            isPredators = true;
                        }

                    }
                }
            }
        }

    }
}
