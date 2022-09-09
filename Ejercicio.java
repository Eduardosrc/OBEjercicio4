public class Ejercicio{
    public static void main(String[] args) {
        //Objetos de cliente y trabajador
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        //Asignación de datos para cliente
        cliente.nombre = "Theo";
        cliente.edad = 20;
        cliente.telefono = "144328954";
        cliente.credito = 1250;

        //Asignación de datos para trabajador
        trabajador.nombre = "Eduardo";
        trabajador.edad = 21;
        trabajador.telefono = "785932754";
        trabajador.salario = 1030;

        System.out.println("Cliente:");
        System.out.println("  Nombre: " + cliente.nombre);
        System.out.println("  Edad: " + cliente.edad);
        System.out.println("  Teléfono: " + cliente.telefono);
        System.out.println("  Crédito: " + cliente.credito);
        System.out.println();
        System.out.println("Trabajador:");
        System.out.println("  Nombre: " + trabajador.nombre);
        System.out.println("  Edad: " + trabajador.edad);
        System.out.println("  Teléfono: " + trabajador.telefono);
        System.out.println("  Salario: " + trabajador.salario);
    }
}
