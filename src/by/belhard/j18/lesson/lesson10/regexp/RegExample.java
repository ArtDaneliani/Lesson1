package by.belhard.j18.lesson.lesson10.regexp;

public class RegExample {
    public static void main(String[] args) {

        String input = "f1bo;iawhgf9q43hgq93";

        String output = input.replaceAll("[\\d]", "*");

        System.out.println(input);
        System.out.println(output);
    }
}
