package by.belhard.j18.lesson.lesson10.threads2;

public class Counter {

    private int a = 0;

    public void inc() {
        synchronized (this) {
            a++;
        }
    }

    public int getA() {
        return a;
    }
}
