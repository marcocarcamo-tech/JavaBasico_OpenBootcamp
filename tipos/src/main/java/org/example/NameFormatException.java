package org.example;

public class NameFormatException extends Exception{

    private static final long serialVerionUID = 1L;

    public NameFormatException(String errorMessage){
        super(errorMessage);
    }
}
