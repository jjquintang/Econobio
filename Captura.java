import java.util.Scanner;
public class Captura
{    
    int apagado;
    public static void main(String[] args){
        System.out.println("ingrese su tiempo de baño");
        Scanner scan = new Scanner(System.in);   
        int apagado = scan.nextInt();
        Procesamiento p = new Procesamiento();
        p.metprocesamiento(apagado);
    } 

}
