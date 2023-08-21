package parqueadero_Makaia;

class Carro implements Estacionable {
    private String placa;
    private String marca;
    private String modelo;

    public Carro(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String toString() {
        return marca + " " + modelo + " (" + placa + ")";
    }

    @Override
    public boolean estacionar(int fila, int columna) {
        return true;
    }

    @Override
    public double Costo(int horas) {
        return horas * 10;
    }
}
