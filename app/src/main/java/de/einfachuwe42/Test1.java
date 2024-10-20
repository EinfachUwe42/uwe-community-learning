package de.einfachuwe42;

public class Test1 {


    public Test1() {

    }

    public void start() {

        new Thread(() -> {

            long counter = 0;
            while(true){

                counter++;
                System.out.printf("count: %d%n", counter);

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }).start();

    }
}
