
import java.util.ArrayList;
import java.util.Scanner;
//MiltonTG
public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroIf ;
        int numeroWhile=0;
        int numeroDowhile=0;
        int numeroSwitch;

        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        numeroIf =escaner.nextInt();

        VALIDANUMERO(numeroIf);

        System.out.println("Ejercicio while");
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("Ejercicio DO While");
        do {
            System.out.println(numeroDowhile);
            numeroDowhile++;
        } while (numeroDowhile ==0);

        System.out.println("Ejercicio For");
        for ( int numeroFor=0; numeroFor<=3;  numeroFor++){
            System.out.println(numeroFor);
        }

        MiraEstacion( );

    }

    public static void VALIDANUMERO(int num){
        if (num>0){
            System.out.println("EL Nº " +num +" es positivo" );
        }else if (num<0){
            System.out.println("EL Nº " +num +" es negativo" );
        }else {
            System.out.println("EL Nº " +num +" es 0" );
        }

    }

    public static void MiraEstacion(){
        String estacion;
        Scanner Tp = new Scanner(System.in);
        System.out.println("Ingrese el nombre de una estación del año:");

        estacion = Tp.nextLine();
        System.out.println(estacion);

        switch (estacion){
            case "VERANO":
            case "verano":
                System.out.println("La estacion escogida es: "+estacion);
                break;
            case "INVIERNO":
            case "invierno":
                System.out.println("La estacion escogida es: "+estacion);
                break;
            case "OTOÑO":
            case "otoño":
                System.out.println("La estacion escogida es: "+estacion);
                break;
            case "PRIMAVERA":
            case "primavera":
                System.out.println("La estacion escogida es: "+estacion);
                break;
            default:
                System.out.println("Lo que ha escrito no es una estacion");
                break;
        }
