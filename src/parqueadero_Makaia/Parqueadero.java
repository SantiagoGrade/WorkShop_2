package parqueadero_Makaia;

public class Parqueadero {
    private int[][] espacios;
    private double tarifaPorHora;

    public Parqueadero(int filas, int columnas, double tarifaPorHora) {
        espacios = new int[filas][columnas];
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean parquearCarro(Estacionable estacionable, int fila, int columna) {
        if (fila < 0 || fila >= espacios.length || columna < 0 || columna >= espacios[0].length) {
            return false;
        }

        if (espacios[fila][columna] == 0) {
            espacios[fila][columna] = 1;
            return estacionable.estacionar(fila, columna);
        } else {
            return false;
        }
    }
    public void estadocelda(){
        for (int i = 0; i < espacios.length; i++) {
            for (int j = 0; j < espacios[0].length; j++) {
                System.out.print(espacios[i][j]);
            }
            System.out.println();
        }
    }
    public void mostrarEstadoParqueadero() {
        for (int i = 0; i < espacios.length; i++) {
            for (int j = 0; j < espacios[0].length; j++) {
                if (espacios[i][j] == 0) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }
}
