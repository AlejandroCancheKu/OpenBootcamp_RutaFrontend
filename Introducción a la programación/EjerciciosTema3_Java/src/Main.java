public class Main {
    public static void main(String[] args) {

        System.out.println("RESULTADO PRIMERA PARTE");
        suma(10,20,30);


        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        System.out.println("\nRESULTADO SEGUNDA PARTE");
        System.out.println("El numero de puertas que tiene el objeto es: " + miCoche.numPuertas);
    }
    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b +c;
        System.out.println("La suma es:" + resultado);
    }
}

class Coche{
    public int numPuertas = 0;
    public void AumentarPuertas(){
        this.numPuertas++;
    }
}