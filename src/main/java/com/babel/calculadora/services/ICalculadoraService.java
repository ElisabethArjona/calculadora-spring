package com.babel.calculadora.services;

import org.springframework.stereotype.Service;

@Service
public interface ICalculadoraService  {

    public double sumar(double num1, double num2);
    public double restar(double num1, double num2);
    public double multiplicar(double num1, double num2);
    public double dividir(double num1, double num2);

}
