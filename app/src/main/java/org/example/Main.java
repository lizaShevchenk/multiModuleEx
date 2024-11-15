package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String message = StringUtils.trim(Constants.HELLO.getValue());
        new UtilHello().utilHelloMethod(message);
    }
}