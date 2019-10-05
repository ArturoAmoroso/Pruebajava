package com.ucb;

public class Cuadrado extends Figura
{
    private int largo;
    Cuadrado()
    {
        //super();
        //System.out.println("Constructor Cuadrado");
    }

    @Override()
    public void dibujar() {
        System.out.println("Dibujando Cuadrado");
    }

    @Override
    protected void leerDatos() {
        System.out.println("Leyendo");
    }
}
