import Animal.Animal;
import Animal.Herbivores.Horse;
import jdk.dynalink.beans.StaticClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.submit(new Task());
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("разбросали");
        executorService.submit(new Task2());
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("походили");
        executorService.submit(new Task3());
        System.out.println("поели");
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);

        //Tools.rundomGo();
        //System.out.println("----------------------------------");
        //Tools.move();
        //System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        //Tools.eat();
        //System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee-");

    }

    static class Task implements Runnable {

        @Override
        public void run() {
            Tools.rundomGo();

        }
    }

    static class Task2 implements Runnable {

        @Override
        public void run() {
            Tools.move();
        }
    }

    static class Task3 implements Runnable {
        @Override
        public void run() {
            Tools.eat();

        }
    }
}