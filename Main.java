
import java.util.ArrayList;
import java.util.Scanner;
//MiltonTG
public class Main {
    public static void main(String[] args) {
        OperacionSuma();
        //objeto
        Coche miCoche = new Coche();
        miCoche.añadirpuertas();

    }
    public static void OperacionSuma(){
        Scanner entrada = new Scanner(System.in);
        int t =0;
        System.out.println("Ingrese el primer numero");
        int a=entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b=entrada.nextInt();
        System.out.println("Ingrese el tercer numero");
        int c=entrada.nextInt();
        t=a+b+c;
        System.out.println("La suma es: " + t);
    }
}
class Coche {
    public void añadirpuertas(){
        Scanner escrito = new Scanner(System.in);

        System.out.println("Ingrese cuantas puertas tiene su coche");
        int puertas=escrito.nextInt();
        System.out.println("mi coche tiene " +puertas + " puertas." );

    }
}
