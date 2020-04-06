package Trabajo;

public class Oficinista extends Empleado {
    int SueldoBasico;
    String CodArea;

    public Oficinista() {
        super();
        System.out.println("Ingrese  Sueldo: ");
        SueldoBasico = Leer.nextInt();
        System.out.println("Ingrese Area: ");
        CodArea = Leer.nextLine();
    }

    public void ImprimirOficinista() {
        mostrar();
        System.out.println("Sueldo: " + SueldoBasico);
        System.out.println("Area: " + CodArea);
    }
}
