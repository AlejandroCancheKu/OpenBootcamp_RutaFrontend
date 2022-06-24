public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.edad = 23;
        cliente.nombre = "Alejandro";
        cliente.numero = "9861036344";
        cliente.credito = 2500.50;

        trabajador.edad = 20;
        trabajador.nombre = "Anahi";
        trabajador.numero = "9861111806";
        trabajador.salario = 7500.50;

        System.out.println("CLIENTE");
        System.out.println("Edad: " + cliente.edad + "\nNombre: " + cliente.nombre + "\nNumero: " +
                cliente.numero + "\nCredito: " + cliente.credito);

        System.out.println("\n\nTRABAJADOR");
        System.out.println("Edad: " + trabajador.edad + "\nNombre: " + trabajador.nombre + "\nNumero: " +
                trabajador.numero + "\nSalario: " + trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    String numero;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}