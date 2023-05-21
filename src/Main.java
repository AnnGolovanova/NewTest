import Animal.Animal;
import Animal.Herbivores.Horse;

public class Main {
    public static void main(String[] args) {
        //Horse d = new Horse();
       /* System.out.println(Math.random()*10);
        Animal bear1 = Tools.creatObj("Bear");
        Island myIland = new Island();
        myIland.setMass(bear1, bear1.getNum(), 1);
        for (int i = 0; i < 6; i++) {
            int[] cell = Tools.getRundomCells(bear1);
            myIland.setMass(bear1,cell[0],cell[1]);
        }*/
        Tools.rundomGo();
        System.out.println("----------------------------------");
        Tools.move();
        System.out.println("----------------------------------");

    }


}