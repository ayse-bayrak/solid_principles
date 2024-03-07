package com.cydeo.solid.openClosed.example2.goodA;

import com.cydeo.solid.openClosed.example2.good.Operation;

public class Calculator {

    public void calculate(Operation operation) {

        int num1 = 10;
        int num2 = 2;

        operation.calculate(num1, num2);

    }

}
