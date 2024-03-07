package com.cydeo.solid.openClosed.example2.goodA;

public class Division implements Operation{
    @Override
    public void calculate(int n1, int n2) {
        System.out.println("division: "+ (n1/n2));
    }
}
