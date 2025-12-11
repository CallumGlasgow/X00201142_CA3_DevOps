package org.example;

public class Calculator {
    
    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double subtract(double num1, double num2){
        return num1 - num2;
    }

    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    public double divide(double num1, double num2){
        if (num2 == 0) throw new  IllegalArgumentException("Cannot divide by zero");
        double result = num1 / num2;

        return result;
    }

    // square the number
    public double square(double num){
        return num * num;
    }

    public double cube(double num){
        return num * num * num;
    }

}
