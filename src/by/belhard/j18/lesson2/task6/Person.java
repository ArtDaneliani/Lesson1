package by.belhard.j18.lesson2.task6;

public class Person {

    String name;
    int age;
    Country country;
    Sex sex;

    public Person(String name, int age, Country country, Sex sex) {

        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
    }

    public Person(String name, int age, Country country) {

        this(name, age, country, Sex.MALE);
    }

    public int growOld() {
        return ++age;
    }

    public void eat(String dish) {
        System.out.printf("I'm eating %s. Om-nom-nom!, /n, dish");

    }

    public Country getCountry() {
        return country;
    }

}
