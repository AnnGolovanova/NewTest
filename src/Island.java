import Animal.Animal;

public class Island {
     private static String mass[][] = new String[100][20];

    public Island() {

    }
   /* public static String[][] getMass() {
        return this.mass;
    }*/

    public static String[][] getMass() {
        return mass;
    }

    public static void setMass(Animal nameAnimalObj, int numRow, int numCol) {
        String nameAnimal = Tools.getName(nameAnimalObj);
        if (Tools.checkAnimal(nameAnimal, numRow, numCol)) {
            mass[numCol][numRow] = mass[numCol][numRow] + "#" + nameAnimal;
            System.out.println("В ячейке " + numCol+"||"+numRow + "  " + mass[numCol][numRow]);
        }else {

           int[] cells = Tools.getCells(nameAnimal,numRow,numCol);
            mass[cells[0]][cells[1]] = mass[cells[0]][cells[1]] + "#" + nameAnimal;
            System.out.println("В ячейке" + cells[0]+ "||" +cells[1] + "  " + mass[cells[0]][cells[1]]);
        }

    }
}
