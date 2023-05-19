package Animal.Predators;

import Animal.Predators.Predators;

 public class Eagle extends Predators {
    int num;
     int moov = 3;
int max = 20;
    public Eagle() {
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
