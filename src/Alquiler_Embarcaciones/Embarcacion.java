package Alquiler_Embarcaciones;

public abstract class Embarcacion implements CuotaAlquiler{
    protected Capitan capitan;
    protected double precioBase;
    protected int fechaFabricacion;
    protected double eslora;

    protected Embarcacion(Capitan capitan, double precioBase, int fechaFabricacion, double eslora){
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.fechaFabricacion = fechaFabricacion;
        this.eslora = eslora;
    }

    public double precioAlquier(){
        return 0;
    }
}
