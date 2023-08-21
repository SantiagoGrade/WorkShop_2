package Alquiler_Embarcaciones;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Capitan capitan = null;
        Embarcacion embarcacion = null;

        int opcion;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Ingresar datos del Capitan");
            System.out.println("2. Ingresar datos del Barco");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Desea comprar el yate");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del Capitan: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese apellido del Capitan: ");
                    String apellido = scanner.next();
                    System.out.print("Ingrese matricula de navegación: ");
                    String matricula = scanner.next();
                    capitan = new Capitan(nombre, apellido, matricula);
                    System.out.println("Datos del Capitan ingresados.");
                    break;

                case 2:
                    System.out.println("Seleccione el tipo de Barco:");
                    System.out.println("1. Yate");
                    System.out.println("2. Velero");
                    System.out.print("Ingrese la opción: ");
                    int opcionBarco = scanner.nextInt();

                    System.out.print("Ingrese precio base del Barco: ");
                    double precioBase = scanner.nextDouble();
                    System.out.print("Ingrese valor adicional: ");
                    double valorAdicional = scanner.nextDouble();
                    System.out.print("Ingrese año de fabricación: ");
                    int anioFabricacion = scanner.nextInt();
                    System.out.print("Ingrese eslora del Barco: ");
                    double eslora = scanner.nextDouble();

                    if (opcionBarco == 1) {
                        System.out.print("Ingrese cantidad de camarotes del Yate: ");
                        int camarotes = scanner.nextInt();
                        embarcacion = new Yate(capitan, precioBase, valorAdicional, anioFabricacion, eslora, camarotes);
                        System.out.println("Datos del Yate ingresados.");
                    } else if (opcionBarco == 2) {
                        System.out.print("Ingrese cantidad de mástiles del Velero: ");
                        int mastiles = scanner.nextInt();
                        embarcacion = new Velero(capitan, precioBase, valorAdicional, anioFabricacion, eslora, mastiles);
                        System.out.println("Datos del Velero ingresados.");
                    }
                    break;

                case 3:
                    System.out.println("MENU DE MOSTRAR DATOS");
                    System.out.println("1. Mostrar datos del Capitan");
                    System.out.println("2. Mostrar datos del Yate");
                    System.out.println("3. Mostrar datos del Velero");
                    System.out.print("Seleccione una opción: ");
                    int opcionMostrar = scanner.nextInt();

                    if (opcionMostrar == 1 && capitan != null) {
                        System.out.println("Datos del Capitan:");
                        System.out.println("Nombre: " + capitan.nombre);
                        System.out.println("Apellido: " + capitan.apellido);
                        System.out.println("Matricula de Navegación: " + capitan.matriculaNavegacion);
                    } else if (opcionMostrar == 2 && embarcacion instanceof Yate) {
                        Yate yate = (Yate) embarcacion;
                        System.out.println("Datos del Yate:");
                        System.out.println("Precio Base: $" + yate.precioBase);
                        System.out.println("Valor Adicional: $" + yate.adicional);
                        System.out.println("Año de Fabricación: " + yate.fechaFabricacion);
                        System.out.println("Eslora: " + yate.eslora);
                        System.out.println("Camarotes: " + yate.camarotes);
                        String lujo = yate.esLujo() ? "Sí" : "No";
                        System.out.println("¿Es de lujo? " + lujo);

                    } else if (opcionMostrar == 3 && embarcacion instanceof Velero) {
                        Velero velero = (Velero) embarcacion;
                        System.out.println("Datos del Velero:");
                        System.out.println("Precio Base: $" + velero.precioBase);
                        System.out.println("Valor Adicional: $" + velero.adicional);
                        System.out.println("Año de Fabricación: " + velero.fechaFabricacion);
                        System.out.println("Eslora: " + velero.eslora);
                        System.out.println("Mástiles: " + velero.mastiles);
                        System.out.println("¿Es grande? " + (velero.esGrande() ? "Sí" : "No"));

                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 4:
                    if (embarcacion instanceof Yate) {
                        Yate yate = (Yate) embarcacion;
                        System.out.println("Seleccione una opción para el yate:");
                        System.out.println("1. Alquilar");
                        System.out.println("2. Comprar");
                        System.out.print("Seleccione una opción: ");
                        int opcionYate = scanner.nextInt();

                        if (opcionYate == 1) {
                            double montoAlquiler = yate.precioAlquiler();
                            System.out.println("El monto del alquiler es: $" + montoAlquiler);
                        } else if (opcionYate == 2) {
                            String compraYate = yate.comprar();
                            System.out.println(compraYate);
                        } else {
                            System.out.println("Opción inválida para el yate.");
                        }
                    } else {
                        System.out.println("No ha ingresado un yate.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 5);
    }
}
