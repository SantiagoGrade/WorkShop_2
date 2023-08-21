package Alquiler_Embarcaciones;

public class Yate extends Embarcacion{
    protected int camarotes;

    public Yate (Capitan capitan,double precioBase,double adicional, int fechaFabricacion, double eslora, int camarotes){
        super(capitan,precioBase,adicional,fechaFabricacion,eslora);
        this.camarotes = camarotes;
    }
    public String comprar(){
        if(camarotes > 7){
            return "Yate de lujo";
        }else{
            return "Yate normal";
        }
    }

    public boolean esLujo(){
       return camarotes > 7;
    }
    @Override
    public double precioAlquiler() {
        return 0;
    }
}
