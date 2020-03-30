package Vehiculo;

public class Micros extends Vehiculos {
    public  Micros(String Placa, int Nruedas,int Nasientos){
        super(Placa,Nruedas,Nasientos);
    }
    public void imprimirMicros(){
        System.out.printf("El Micro tiene Placa de : %s \n",getPlaca());
    }
}
