package com.ucb;

import java.util.Scanner;

public class Main
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        /**Figura a = new Figura();
        a.dibujar();*/

        Figura b = new Cuadrado();
        b.dibujar();
        b.leerDatos();

        /*System.out.println("Hola");
        int a= sc.nextInt();
        System.out.println(a);*/
    }
}
