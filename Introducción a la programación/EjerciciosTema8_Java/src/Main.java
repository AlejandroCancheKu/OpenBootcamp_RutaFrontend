public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(23);
        persona1.setNombre("Alejandro");
        persona1.setTelefono("9861036344");

        Persona persona2 = new Persona();
        persona2.setEdad(22);
        persona2.setNombre("Esperanza");
        persona2.setTelefono("9861147246");

        System.out.println(persona1.getEdad() + " " + persona1.getNombre() + " " + persona1.getTelefono());
        System.out.println(persona2.getEdad() + " " + persona2.getNombre() + " " + persona2.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
