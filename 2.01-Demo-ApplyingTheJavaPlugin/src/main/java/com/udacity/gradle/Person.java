package com.udacity.gradle;

import org.apache.commons.lang3.StringUtils;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args){
        System.out.println(StringUtils.swapCase("Hello from Java"));
    }
}
