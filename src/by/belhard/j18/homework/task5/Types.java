package by.belhard.j18.homework.task5;

public class Types {

    public static void main(String[] args) {

        int a = 14;

        char c = (char) a;

        System.out.println((char) (c - 26));
        System.out.println((int)'\n');
        System.out.println("f");
        System.out.println("f");

        String result;
        /*if (a >= 97)
            result = "small letter";
        else
            result = "big letter";

        System.out.println(result);*/


        result = (a >= 97 && a <= 123) ? "small letter" :
                (a >=65 && a <= 90) ? "big letter" : "not english alphabet letter";

        System.out.println(result);

    }
}
