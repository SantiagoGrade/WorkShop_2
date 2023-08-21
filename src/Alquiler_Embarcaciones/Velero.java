package Alquiler_Embarcaciones;

public class Velero extends Embarcacion{
    protected int mastiles;
    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int mastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.mastiles = mastiles;
    }

    public boolean esGrande() {
        return mastiles > 4;
    }

    @Override
    public double precioAlquiler() {
        return 0;
    }
}
