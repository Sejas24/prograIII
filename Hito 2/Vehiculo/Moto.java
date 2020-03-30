package Vehiculo;

public class Moto extends Vehiculos {
    public  Moto(String Placa, int Nruedas,int Nasientos){
        super(Placa,Nruedas,Nasientos);
    }
    public void imprimirMoto(){
        System.out.printf("La Moto tiene Placa de : %s \n ",getPlaca());
    }
}
