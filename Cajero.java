import java.util.Scanner;
public class Cajero 
{  
    //El Scanner
    static Scanner entrada = new Scanner(System.in);
    //Y la caja
    static int Caja;
    //Metodo que inicializa el valor de apertura de caja
    public static void Apertura ()
    {
        System.out.println("Ingrese la cantidad de dinero al inicio del negocio");
        Caja = entrada.nextInt();
    }
}