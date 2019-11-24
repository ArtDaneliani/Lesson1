package by.belhard.j18.lesson.lesson7.abstractExample;

public class FactoryWorker extends AbstractWorker {

    public FactoryWorker(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("Work hard");
    }
}