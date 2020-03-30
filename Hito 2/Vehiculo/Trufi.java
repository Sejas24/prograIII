package Vehiculo;

public class Trufi extends Vehiculos {
    public  Trufi(String Placa, int Nruedas,int Nasientos){
        super(Placa,Nruedas,Nasientos);
    }
    public void imprimirTrufi(){
        System.out.printf("El Trufi tiene Placa de : %s \n ",getPlaca());
    }
}
