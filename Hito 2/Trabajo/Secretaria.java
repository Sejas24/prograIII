package Trabajo;

public class Secretaria extends Oficinista {
    String NombreArea;

    public Secretaria() {
        super();
        System.out.println("Ingrese Area: ");
        NombreArea = Leer.nextLine();
    }
    public void ImprimirSecretaria() {
        mostrar();
        System.out.println("Area: " + NombreArea);
    }
}
