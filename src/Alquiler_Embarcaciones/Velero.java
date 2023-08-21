package Alquiler_Embarcaciones;

public class Velero extends Embarcacion{
    protected int mastiles;
    public Velero(Capitan capitan, double precioBase, int anioFabricacion, double eslora, int mastiles) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.mastiles = mastiles;
    }

    public boolean esGrande() {
        return mastiles > 4;
    }

    @Override
    public double precioAlquiler() {
        double monto = precioBase;
        if (fechaFabricacion > 2020){
            monto += 20000;
        }
        return monto;
    }
}
