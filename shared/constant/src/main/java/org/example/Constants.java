package org.example;

public enum Constants {

    HELLO("    Hello from util and constant modules!   ");

    private final String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
