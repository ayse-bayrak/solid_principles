package com.cydeo.solid.openClosed.example2.goodA;

public class Addition implements Operation {

    @Override
    public void calculate(int n1, int n2) {
        System.out.println("addition: " + (n1+n2));
    }
}
