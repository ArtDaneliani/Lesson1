package by.belhard.j18.lesson.lesson7.abstractExample;

public class OfficeWorker extends AbstractWorker {

    public OfficeWorker(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("Work not hard");
    }
}