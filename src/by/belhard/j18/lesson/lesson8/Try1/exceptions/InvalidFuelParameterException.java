package by.belhard.j18.lesson.lesson8.Try1.exceptions;

public class InvalidFuelParameterException extends RuntimeException {
    public InvalidFuelParameterException(String s) {
        super(s);
    }
}