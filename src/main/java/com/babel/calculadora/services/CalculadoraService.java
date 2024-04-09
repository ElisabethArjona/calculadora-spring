package com.babel.calculadora.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService implements ICalculadoraService {
    @Override
    public double sumar(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double restar(double num1, double num2) {
        return num1-num2;
    }

    @Override
    public double multiplicar(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double dividir(double num1, double num2) {
        if (num2 == 0)
            num2 = 1;

        return num1/num2;
    }
}
