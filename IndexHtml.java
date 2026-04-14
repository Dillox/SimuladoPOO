import java.util.Scanner;

public class IndexHtml {

    public static void mostrar(String seccion) {

        switch (seccion) {

            case "poo":
                System.out.println("=== POO ===");
                System.out.println("La Programación Orientada a Objetos es un paradigma basado en objetos que contienen datos y métodos.");
                break;

            case "clases":
                System.out.println("=== Clases ===");
                System.out.println("Una clase es una plantilla para crear objetos.");
                System.out.println("""
class Persona {
    String nombre;
    int edad;
}
""");
                break;

            case "objetos":
                System.out.println("=== Objetos ===");
                System.out.println("Un objeto es una instancia de una clase.");
                System.out.println("""
Persona p1 = new Persona();
p1.nombre = "Juan";
p1.edad = 20;
""");
                break;

            case "atributos":
                System.out.println("=== Atributos ===");
                System.out.println("Son las variables dentro de una clase.");
                System.out.println("""
class Persona {
    String nombre;
    int edad;
}
""");
                break;

            case "pilares":
                System.out.println("=== Pilares de la POO ===");
                System.out.println("Encapsulamiento");
                System.out.println("Herencia");
                System.out.println("Polimorfismo");
                System.out.println("Abstracción");
                break;

            case "acceso":
                System.out.println("=== Niveles de Acceso ===");
                System.out.println("public, private, protected, default");
                System.out.println("""
public class Persona {
    private String nombre;
    public int edad;
}
""");
                break;

            case "java":
                System.out.println("=== Ejemplo Completo en Java ===");
                System.out.println("""
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Ana", 25);
        p.mostrarDatos();
    }
}
""");
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n=== SIMULADOR POO ===");
            System.out.println("1. POO");
            System.out.println("2. Clases");
            System.out.println("3. Objetos");
            System.out.println("4. Atributos");
            System.out.println("5. Pilares");
            System.out.println("6. Niveles de Acceso");
            System.out.println("7. Ejemplo Java");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1": mostrar("poo"); break;
                case "2": mostrar("clases"); break;
                case "3": mostrar("objetos"); break;
                case "4": mostrar("atributos"); break;
                case "5": mostrar("pilares"); break;
                case "6": mostrar("acceso"); break;
                case "7": mostrar("java"); break;
                case "0": System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida.");
            }

        } while (!opcion.equals("0"));

        scanner.close();
    }
}