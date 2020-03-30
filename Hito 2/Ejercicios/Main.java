package Ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Ejercicios Ejer = new Ejercicios();
/*
        //Ejercicio 1: Fibonacci

        System.out.println("Ingrese Cantidad de Valores de la Serie de Fibonacci");
        int Cantidad = leer.nextInt();
        Ejer.Fibonacci(Cantidad);


        //Ejercicio 2: Metodos de Ordenamiento

        int Bur[] = {5,2,4,6,1,3};
        int Ins[] = {3,1,9,8,4,2,5,7};
        System.out.println("Ordenado por el Metodo Burbuja \n");
        Ejer.burbuja(Bur);
        Ejer.mostrarArreglo(Bur);
        System.out.println("Ordenado por el Metodo Insercion \n");
        Ejer.burbuja(Ins);
        Ejer.mostrarArreglo(Ins);
*/
        //Ejercicio 3: Leer N cadenas
        Ejer.nCadenas();

        //Ejercicio 4: Cantidad de Pares
        int array[] = new int[10];
        System.out.println("Ingresara 10 numeros");
        for(int i=0; i<10;i++)
        {
            System.out.printf("ingrese numero %d: ",i);
            array[i]=leer.nextInt();
        }
        System.out.printf("La Cantidad de Numeros Pares en el Array son: %d",Ejer.ContPares(array));
    }
}
