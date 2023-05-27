package Animal.Predators;

import Animal.Predators.Predators;

 public class Eagle extends Predators {
    int num;
     int moov = 3;
     double live = 6;
     double health = live;
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
