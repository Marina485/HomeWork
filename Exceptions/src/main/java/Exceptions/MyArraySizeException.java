package Exceptions;

public class MyArraySizeException extends NumberFormatException {
    public MyArraySizeException(String message) {
        super(message);
    }
}