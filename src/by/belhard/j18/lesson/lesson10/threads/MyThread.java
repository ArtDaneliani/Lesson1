package by.belhard.j18.lesson.lesson10.threads;

public class MyThread extends Thread {

    private final String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1000);
                System.out.println(name + " " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}