package Alquiler_Embarcaciones;

public abstract class Embarcacion implements CuotaAlquiler{
    protected Capitan capitan;
    protected double precioBase;
    protected double adicional;
    protected int fechaFabricacion;
    protected double eslora;

    protected Embarcacion(Capitan capitan, double precioBase,double adicional, int fechaFabricacion, double eslora){
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.adicional = adicional;
        this.fechaFabricacion = fechaFabricacion;
        this.eslora = eslora;
    }

    public double precioAlquier(){
        double monto = precioBase;
        if (fechaFabricacion > 2020){
            monto += 20000;
        }
        return monto;
    }
}
