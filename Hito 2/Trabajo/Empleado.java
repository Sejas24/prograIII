package Trabajo;

public class Empleado implements LeerInterface {

    public String primerNombre;
    public String primerApellido;
    public int ciNumero;
    public String ciExtension;

    public Empleado() {
        leer();
    }

    public void leer() {
        System.out.println("ingrese Nombre: ");
        primerNombre = Leer.nextLine();
        System.out.println("ingrese Apellido: ");
        primerApellido = Leer.nextLine();
        System.out.println("ingrese Lugar donde Saco el Carnet: ");
        ciExtension = Leer.nextLine();
        System.out.println("ingrese carnet de identidad: ");
        ciNumero = Leer.nextInt();
    }
    public void setPrimerNombre(String primerNombre){ this.primerApellido = primerNombre;}
    public String getPrimerNombre(){return this.primerNombre;}

    public void setPrimerApellido(String primerApellido){ this.primerApellido = primerApellido;}
    public String getPrimerApellido(){return this.primerApellido = primerApellido;}

    public void setCiNumero(int ciNumero){ this.ciNumero = ciNumero;}
    public int getCiNumero(){return this.ciNumero;}

    public void setCiExtension(String ciExtension){ this.ciExtension = ciExtension;}
    public String getCiExtension(){return this.ciExtension;}

    public void mostrar() {
        System.out.printf("Nombre: %s\n",getPrimerNombre());
        System.out.printf("Apellido: %s\n",getPrimerApellido());
        System.out.printf("Carnet: %d \n",getCiNumero());
        System.out.printf("CiExtension: %s\n",getCiExtension());
    }
}
