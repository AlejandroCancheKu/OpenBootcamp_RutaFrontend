public class Main {
    public static void main(String[] args) {

        //If
        System.out.println("ESTRUCTURA DE CONTROL: IF");
        int numeroIf = -25;

        if (numeroIf < 0){
            System.out.println("El numero " + numeroIf + " es negativo ");
        } else if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        }else{
            System.out.println("El numero " + numeroIf + " es cero");
        }

        //While
        System.out.println("\nESTRUCTURA DE CONTROL: WHILE");
        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("El valor actual de la variable numeroWhile es: " + numeroWhile);
        }

        //DoWhile
        System.out.println("\nESTRUCTURA DE CONTROL: DO WHILE");
        int numeroDoWhile = 3;
        do{
            numeroWhile++;
            System.out.println("El valor actual de la variable numeroDoWhile es: " + numeroDoWhile);
        }while (numeroDoWhile < 3);

        //For
        System.out.println("\nESTRUCTURA DE CONTROL: FOR");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("El valor actual de la variable numeroFor es: " + numeroFor);
        }

        //Switch
        System.out.println("\nESTRUCTURA DE CONTROL: SWITCH");
        String estacion = "invierno";
        switch (estacion){
            case "primavera":
                System.out.println("La estacion es primavera");
                break;
            case "verano":
                System.out.println("La estacion es verano");
                break;
            case "otoño":
                System.out.println("La estacion es otoño");
                break;
            case "invierno":
                System.out.println("La estacion es invierno");
                break;
            default:
                System.out.println("No existe la estacion");
        }
    }
}