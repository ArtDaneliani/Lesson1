package by.belhard.j18.homework;

public class hw2 {

    public static void main(String[] args) {

        int radius = 5, circleX = 0, circleY = 0;
        int pointX = 3, pointY = 4;

        int dX = circleX - pointX;
        int dX = circleY - pointY;


        double distanceSquare =  dX * dX + dY * dY;
        int radiusSquare = radius * radius;

        if (distanceSquare < radiusSquare)
            System.out.println("inside");
        else if (distanceSquare == radiusSquare) {
            System.out.println("on");

        }



    }
}
