package com.babel.calculadora.services;

import com.babel.calculadora.models.DobleNumero;
import org.springframework.stereotype.Service;

@Service
public class GestorUsuarioService implements IGestorUsuarioService{

    private final IEntradaTecladoService entradaTecladoService;

    public GestorUsuarioService(IEntradaTecladoService entradaTecladoService){
        this.entradaTecladoService = entradaTecladoService;
    }

    public int menu() {
        int option = 0;
        do {
            System.out.println(" -- MENU --");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            option = entradaTecladoService.pedirEntero("Introduzca la opcion deseada: ");
        } while ((option < 0) || (option > 6));
        return option;
    }

    @Override
    public DobleNumero numeros() {
        double num1, num2;
        num1 = entradaTecladoService.pedirDouble("Introduzca el primer numero: ");
        num2 = entradaTecladoService.pedirDouble("Introduzca el segundo numero: ");
        return new DobleNumero(num1,num2);
    }
}
