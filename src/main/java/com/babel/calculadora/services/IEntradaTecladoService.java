package com.babel.calculadora.services;

import org.springframework.stereotype.Service;

@Service
public interface IEntradaTecladoService {

    public String pedirCadena(String cad);

    public char pedirChar(String cad);

    public int pedirEntero(String cadena);

    public float pedirFloat(String cadena);

    public double pedirDouble(String cadena);

    public long pedirLong(String cadena);

    public int pedirEdad(String cadena);

    public char continuar();

    public boolean pedirBoolean(String cadena);
}
