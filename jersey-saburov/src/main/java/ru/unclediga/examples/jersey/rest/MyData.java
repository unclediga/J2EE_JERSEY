package ru.unclediga.examples.jersey.rest;

public class MyData {
    private String s;

    public MyData(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "MyData{" + '\'' + s + '\'' + '}';
    }
}
