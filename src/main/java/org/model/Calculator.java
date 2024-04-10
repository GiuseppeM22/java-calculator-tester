package org.model;

public class Calculator {

    //- float add(float num1, float num2)
    public float add(float num1, float num2) {
        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            throw new IllegalArgumentException("I parametri devono essere numeri float.");
        }
        return num1 + num2;
    }

    //- float subtract(float num1, float num2)
    public float subtract(float num1, float num2) {
        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            throw new IllegalArgumentException("I parametri devono essere numeri float.");
        }
        return num1 - num2;
    }

    //- float divide(float num1, float num2)
    public float divide(float num1, float num2) {
        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            throw new IllegalArgumentException("I parametri devono essere numeri float.");
        }
        if (num1 == 0 && num2 == 0) {
            throw new IllegalArgumentException("Operazione matematica non consentita");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Infinito");
        }
        return num1 / num2;
    }

    //- float multiply(float num1, float num2)
    public float multiply(float num1, float num2) {
        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            throw new IllegalArgumentException("I parametri devono essere numeri float.");
        }
        return num1 * num2;
    }

}
