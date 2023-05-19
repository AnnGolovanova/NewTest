import Animal.Animal;

public class Island {
    private String mass[][] = new String[100][20];

    public Island() {

    }
    public String[][] getMass() {
        return mass;
    }

    public void setMass(Animal nameAnimalObj, int numRow, int numCol) {
        String nameAnimal = Tools.getName(nameAnimalObj);
        if (Tools.checkAnimal(nameAnimal, numRow, numCol)) {
            mass[numCol][numRow] = mass[numCol][numRow] + "#" + nameAnimal;
            System.out.println("В ячейке" + numCol+numRow + "  " + mass[numCol][numRow]);
        }else {

           int[] cells = Tools.getCells(nameAnimal,numRow,numCol);
            mass[cells[0]][cells[1]] = mass[cells[0]][cells[1]] + "#" + nameAnimal;
            System.out.println("В ячейке" + cells[0]+ cells[1] + "  " + mass[cells[0]][cells[1]]);
        }

    }
}
