package Vehiculo;

public class Main {
    public static void main(String[] args) {
        Moto m = new Moto("316HYH",2,1);
        m.imprimirMoto();
        Trufi Tf = new Trufi("2420ZCA",4,15);
        Tf.imprimirTrufi();
        Micros Mc = new Micros("1254FGT",4,30);
        Mc.imprimirMicros();
    }
}
