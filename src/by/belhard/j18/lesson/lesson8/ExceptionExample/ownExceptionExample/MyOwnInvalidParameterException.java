package by.belhard.j18.lesson.lesson8.ExceptionExample.ownExceptionExample;

public class MyOwnInvalidParameterException extends Exception {

    public MyOwnInvalidParameterException(int i1, int i2) {
        super(prepareMessage(i1, i2));
    }

    private static String prepareMessage(int i1, int i2) {

        return String.format("Invalid parameters: %d,%d", i1, i2);
    }
}