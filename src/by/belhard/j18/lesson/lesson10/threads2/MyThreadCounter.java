package by.belhard.j18.lesson.lesson10.threads2;

public class MyThreadCounter implements Runnable {

    private final Counter counter;

    public MyThreadCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10000000; i++)
            counter.inc();

        System.out.println("thread ends");
    }
}
