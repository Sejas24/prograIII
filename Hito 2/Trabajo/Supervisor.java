package Trabajo;

public class Supervisor extends Empleado {
    int sueldo, antiguedad;

    public Supervisor() {
        super();
        System.out.println("Ingrese  Sueldo: ");
        sueldo = Leer.nextInt();
        System.out.println("Ingrese Antiguedad: ");
        antiguedad = Leer.nextInt();
    }

    public void ImprimirSupervisor() {
        mostrar();
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Antiguedad: " + antiguedad);
    }
}