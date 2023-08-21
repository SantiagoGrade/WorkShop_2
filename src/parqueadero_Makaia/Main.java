package parqueadero_Makaia;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5, 10, 10.0);

        Carro carro1 = new Carro("ABC123", "Toyota", "Corolla");
        Carro carro2 = new Carro("FZL323", "Ford", "Mustand");
        Carro carro3 = new Carro("YZH132", "Mazda", "323");

        parqueadero.parquearCarro(carro1, 1, 2);
        parqueadero.parquearCarro(carro1, 3, 3);
        parqueadero.parquearCarro(carro1, 4, 6);

        parqueadero.mostrarEstadoParqueadero();

        double costoCarro1 = carro1.Costo(3);
        double costoCarro2 = carro1.Costo(6);
        double costoCarro3 = carro1.Costo(12);

        System.out.println("Costo para " + carro1 + ": $" + costoCarro1);
        System.out.println("Costo para " + carro2 + ": $" + costoCarro2);
        System.out.println("Costo para " + carro3 + ": $" + costoCarro3);

    }
}
