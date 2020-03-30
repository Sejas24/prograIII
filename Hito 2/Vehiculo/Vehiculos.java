package Vehiculo;

public class Vehiculos {
    public String Placa;
    public int NRuedas;
    public int Nasientos;

    public Vehiculos(String Placa, int NRuedas, int Nasientos) {
        this.Placa = Placa;
        this.NRuedas = NRuedas;
        this.Nasientos = Nasientos;
    }
    public void SetPlaca(String Placa){
        this.Placa = Placa;
    }
    public String getPlaca(){ return this.Placa = Placa;}
}
