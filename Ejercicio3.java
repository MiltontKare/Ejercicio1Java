import java.util.Scanner;
//MiltonTG
public class Ejercicio3 {
    public static void main(String[] args){
        //Creacion de objetos
        Persona persona = new Persona();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String n=teclado.nextLine();
        System.out.println("Ingrese su edad");
        int ed= teclado.nextInt();
        System.out.println("Ingrese su celular");
        int cel = teclado.nextInt();

        persona.SetNombre(n);
        persona.SetEdad(ed);
        persona.SetCelular(cel);
        
        System.out.println("Su nombre es:" + persona.GetNombre());
        System.out.println("Su edad es:" + persona.GetEdad());
        System.out.println("Su celular es:" + persona.GetCelular());
    }
}



 class Persona{
    //Declaracion variables privadas
    private int edad;
    private String nombre;
    private int celular;

    public Persona(){

    }

    public void SetEdad(int edad){
        this.edad=edad;
    }
    public int GetEdad(){
        return this.edad;
    }
    public void SetNombre(String nombre){
        this.nombre=nombre;
    }
    public String GetNombre(){
        return this.nombre;
    }

    public void SetCelular(int celular){
        this.celular = celular;
    }

    public int GetCelular(){
        return this.celular;
    }



 }

