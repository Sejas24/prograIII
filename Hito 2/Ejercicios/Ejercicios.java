package Ejercicios;

import java.util.Scanner;
public class Ejercicios {

    //Ejercicio 1 : Serie Fibonacci
       public void Fibonacci(int Cantidad){
           int a=0 , b=1 , i=1, aux;
           System.out.println(a);
           while (i<Cantidad){
               aux = a;
               a=b;
               b= aux + a;
               System.out.println(b);
               i++;
           }
       }

       //Ejercicio 2: Metodo Burbuja y Insercion

       public void burbuja(int arreglo[])
       {
           for(int i = 0; i < arreglo.length - 1; i++) {
               for (int j = 0; j < arreglo.length - 1; j++) {
                   if (arreglo[j] > arreglo[j + 1]) {
                       int tmp = arreglo[j + 1];
                       arreglo[j + 1] = arreglo[j];
                       arreglo[j] = tmp;
                   }
               }
           }
       }
    public void Insercion(int arreglo[]){
        int clave,i,N=arreglo.length;
        for(int j=1;j<N;j++){
            clave= arreglo[j];
            i= j-1;
            while(i>-1 && arreglo[i]>clave){
                arreglo[i+1] = arreglo[i];
                i=i-1;
            }
            arreglo[i+1] = clave;
        }
    }
    public void mostrarArreglo(int a[]){
        for(int i=1;i<=a.length;i++){
            System.out.print(a[i-1] + " ");
        }
        System.out.print("\n");
    }

    //Ejercicio 3: Leer N cadenas

    public  void nCadenas(){
           Scanner leer = new Scanner(System.in);
        while (leer.hasNext()){
               System.out.println("Ingrese una Palabra: \n");
               String Cadena = leer.nextLine();
               if (Cadena.length() == 10)
               {
                   System.out.println("Cadena Encontrada\n");
                   break;
               }
           }
    }

    //Ejercicio 4: Array de Enteros
    public int ContPares(int array[]){
           int contador=0;
           for(int i=0;i<array.length;i++)
           {
               if(array[i] % 2 == 0)
               {
                   contador++;
               }
           }
           return contador;
    }

}
