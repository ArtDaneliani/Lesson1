package by.belhard.j18.homework;


public class Task7 {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 1 && j == 1)
                    System.out.print("    ");
                else
                    System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}