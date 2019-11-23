package by.belhard.j18.lesson2.task6;

public class task10 {
    public static void main(String[] args) {

        Country country1 = new Country("Brazil", 123456);

        Person person1 = new Person
                ("Alfredo", 29, country1, Sex.MALE);
        Person person2 = new Person
                ("Tereza", 16, person1.country, Sex.FEMALE);


        System.out.println
                ("Name is" + " " + person2.name);
        System.out.println
                (country1.title + ",  "+ "zipCode is" +" "+ country1.zipCode + ",  " + person2.age + "y.  " + person2.sex);

    }
}