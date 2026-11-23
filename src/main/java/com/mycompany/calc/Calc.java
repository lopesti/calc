package com.mycompany.calc;

public class Calc {

    public static void main(String[] args) {
        CalculadoraCompra calc = new CalculadoraCompra();
        System.out.println("Total (15.0 x 3): " + calc.calcularTotal(15.0, 3));
    }
}
