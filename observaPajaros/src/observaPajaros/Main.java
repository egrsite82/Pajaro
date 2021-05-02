package observaPajaros;

import java.util.Scanner;

public class Main {  
    public static String ask(Scanner scan, String kysymys) {
        System.out.print(kysymys+" ");
        return scan.nextLine();
    }
 
    public static void add(Scanner scan, PajaroBD db) {
        String nombre = ask(scan, "Nombre:");
        String latinNombre = ask(scan, "Nombre en Latin:");
 
        db.addPajaro(nombre, latinNombre);
    }
 
    public static void observation(Scanner scan, PajaroBD db) {
        String nombre = ask(scan, "Nombre:");
 
        boolean success = db.observado(nombre);
        if (!success) {
            System.out.println("Datos no encontrados!");
        }
    }
 
    public static void show(Scanner scan, PajaroBD db) {
        String nombre = ask(scan, "Nombre:");
        String respuesta = db.muestraPajaro(nombre);
        if (respuesta == null) {
            System.out.println("Datos no encontrados!");
        } else {
            System.out.println(respuesta);
        }
    }
 
    public static void estadisticas(Scanner scan, PajaroBD db) {
        System.out.print(db.estadisticas());
    }
 
    public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);
        PajaroBD db = new PajaroBD();
 
        while (true) {
            String command = ask(scanner, "Seleccione una opción: (1)Agregar, (2)Observar, (3)Mostrar, (4) Estadisticas. (0) Salir");
 
            if (command.equals("0")) {
                break;
            } else if (command.equals("1")) {
                add(scanner,db);
            } else if (command.equals("2")) {
                observation(scanner,db);
            } else if (command.equals("3")) {
                show(scanner,db);
            } else if (command.equals("4")) {
                estadisticas(scanner,db);
            } else {
                System.out.println("Comando Erroneo");
            }
        }
    }
 
}