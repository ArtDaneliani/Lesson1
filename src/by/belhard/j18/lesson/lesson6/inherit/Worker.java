package by.belhard.j18.lesson.lesson6.inherit;

public class Worker extends Person {

    private int salary;

    public Worker(String name, int age, double weight, int salary) {
        super(name, age, weight);
        this.salary = salary;
    }

    public void work() {
        System.out.println("How tired i am...");
    }

    @Override
    public int growOld() {

        super.growOld();

        return super.growOld();
    }

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}