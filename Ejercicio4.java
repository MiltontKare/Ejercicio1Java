import java.util.Scanner;
//MILTON TG
public class Ejercicio4 {
     public static void main(String[] args){
         Cliente ncliente =new Cliente();
         Trabajador ntrabajador = new Trabajador();
         ncliente.SetNombre("Mario");
         ncliente.SetEdad(24);
         ncliente.SetTelefono(2478973);
         ncliente.SetCredito(400);
         ntrabajador.SetNombre("Milton");
         ntrabajador.SetEdad(27);
         ntrabajador.SetTelefono(2696532);
         ntrabajador.SetSalario(800);

         System.out.println("CLIENTE");
         System.out.println(" NOMBRE: "+ ncliente.GetNombre()+" Edad: " +ncliente.GetEdad()+ " Telefono: "
                 +ncliente.GetTelefono()+" Credito: "+ncliente.GetCredito());
         System.out.println("TRABAJADOR");
         System.out.println(" NOMBRE: "+ ntrabajador.GetNombre()+" Edad: " +ntrabajador.GetEdad()+ " Telefono: "
                 +ntrabajador.GetTelefono()+" Credito: "+ntrabajador.GetSalario());

    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;
    public Persona(){

    }
    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String GetNombre() {
        return this.nombre;
    }
    public void SetEdad(int edad) {
        this.edad = edad;
    }
    public int GetEdad() {
        return this.edad;
    }
    public void SetTelefono(int telefono){
        this.telefono=telefono;
    }
    public int GetTelefono(){
        return telefono;
    }

}
class Cliente extends Persona{
    private int credito;

    public void SetCredito(int credito){
        this.credito=credito;
    }
    public int GetCredito(){
        return this.credito;
    }
    public Cliente(){
    }
}
class Trabajador extends Persona{
    private int salario;
    public void SetSalario(int salario){
        this.salario=salario;
    }
    public int GetSalario(){
        return this.salario;
    }
    public Trabajador(){

    }

}
