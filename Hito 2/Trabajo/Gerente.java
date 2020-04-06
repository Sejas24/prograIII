package Trabajo;

public class Gerente extends Empleado  {
    int bono,sueldo,antiguedad;
    public Gerente(){
        super();
        System.out.println("Ingrese Bono: ");
        bono = Leer.nextInt();
        System.out.println("Ingrese  Sueldo: ");
        sueldo= Leer.nextInt();
        System.out.println("Ingrese Antiguedad: ");
        antiguedad= Leer.nextInt();
    }
    public void ImprimirGerente(){
        mostrar();
        System.out.println("Bono: " + bono );
        System.out.println("Sueldo: " + sueldo );
        System.out.println("Antiguedad: " + antiguedad );
    }
}
