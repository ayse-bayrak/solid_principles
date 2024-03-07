package com.cydeo.solid.openClosed.example2.goodA;

public class Substraction implements Operation{
    @Override
    public void calculate(int n1, int n2) {
        System.out.println("subtraction: "+ (n1-n2));
    }
}
