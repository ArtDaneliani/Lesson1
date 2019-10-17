package by.belhard.j18.lesson2.task5;

public class Cycles {
    public static void main(String[] args) {

       int[] intArray = {1, 3, 7, -11, 8};

       for (int i = 0; i < intArray.length i--){
            System.out.println(intArray[i - 1] + " ");
       }

        System.out.print('\n');

       for (int i = intArray.length; i > 0; i--)
           System.out.println(intArray[i] + " ");
        System.out.println();

       for (int i : intArray)
           System.out.println(i);
}
