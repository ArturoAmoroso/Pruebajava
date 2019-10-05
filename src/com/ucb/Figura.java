package com.ucb;

public abstract class Figura
{
    Figura()
    {
        //System.out.println("Constructor de Figura");
    }
    protected void dibujar()
    {
        System.out.println("Dibujando ...");
    }
    protected abstract  void leerDatos();
}
