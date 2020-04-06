package Trabajo;

public class Main {
    public static void main(String[] args) {
        Empleado Emp= new Empleado();
        Emp.mostrar();
        Gerente ger = new Gerente();
        ger.ImprimirGerente();
        Supervisor sup = new Supervisor();
        sup.ImprimirSupervisor();
        Oficinista ofi = new Oficinista();
        ofi.ImprimirOficinista();
        Secretaria sec = new Secretaria();
        sec.ImprimirSecretaria();
        Mensajero mens = new Mensajero();
        mens.ImprimirMensajero();
    }
}
