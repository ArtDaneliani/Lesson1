package by.belhard.j18.lesson2;

public class task10 {
    public static void main(String[] args) {

        Country country1 = new Country("Brazil", 123456);

        Person person1 = new Person
                ("Alfredo", 29, country1, Sex.MALE);
        Person person2 = new Person
                ("Tereza", 16, person1.country, Sex.FEMALE);


        System.out.printf
                ("Name is" + " " + person2.name);
        System.out.printf
                (country1.title + " "+ "zipCode is" +" "+ country1.zipCode);
        System.out.print
                (person1.age);
        System.out.print
                (person1.sex);
    }
}