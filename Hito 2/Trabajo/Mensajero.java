package Trabajo;

public class Mensajero extends Oficinista  {
    String Turno;

    public Mensajero() {
        super();
        System.out.println("Ingrese Turno: ");
        Turno = Leer.nextLine();
    }
    public void ImprimirMensajero() {
        mostrar();
        System.out.println("Turno: " + Turno);
    }
}
