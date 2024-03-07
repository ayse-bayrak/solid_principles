package com.cydeo.solid.openClosed.example2.goodA;

public class TestGoodA {
    public static void main(String[] args) {

        new Addition().calculate(10,5); //addition: 15
        new Substraction().calculate(10,5); //subtraction: 5
        new Division().calculate(10,5); //division: 2
    }
}
