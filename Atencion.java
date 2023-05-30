import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Scanner;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.Timer;
public class Atencion
{
   //Creacion de array de mesas
   static ArrayList <Mesas> TotalMesas = new ArrayList<Mesas>();
   //Creacion del array de la comanda
   static ArrayList <Pedido> TotalComandas = new ArrayList<Pedido>();
   //Creacion del array carta
   static TreeMap <String, Carta> Carta = new TreeMap<String, Carta>();
   //El Scanner
   static Scanner entrada = new Scanner(System.in);

   //Metodo para registrar la cantidad de mesas
   public static void RegistroMesas ()
   {
      System.out.println("Ingrese la cantidad de mesas");
      int m = entrada.nextInt();
      int n = 1;
      do
      {
         TotalMesas.add(new Mesas(n, "Libre")); 
         m --;
         n ++;
      }while(m > 0);
   }
   
   //El registro de carta con una clave unica
   public static void RegistrarCarta()
   {
      Carta.put("A01",new Carta("Salchipapa", 6));
      Carta.put("A02",new Carta("Pollo Broaster", 12));
      Carta.put("A03",new Carta("Hamburguesa",10));
      Carta.put("A04",new Carta("Pollo a la plancha", 13));
   }

   //Se registran los pedidos asignandolos a una mesa como clave, y cambiando el estado de la mesa a ocupado
   public static void RegistroComadas()
   {
      int respuesta, can;
      String cod;
      boolean repetir = true;
      
      //Va a imprimir cualquier mesa q cumpla con la especificacion de estar libre
      System.out.println("Las mesas libres son");
      for(Mesas m : TotalMesas)
      {
         if(m.getEstado().equals("Libre"))
         {
            System.out.println("Mesa numero " + m.getNumero());
            //Se pregunta si se desea seleccionar esa mesa para hacer el pedido ahi
            System.out.println("Desea seleccionar esta mesa?");
            respuesta = entrada.nextInt();
            if(respuesta == 1)
            {
               //Se cambia el estado
               m.setEstado("Ocupado");
               do
               {
                  //Se ingresa pedido
                  System.out.println("Ingrese su pedido");
                  cod = entrada.next();
                  System.out.println("Ingrese la cantidad");
                  can = entrada.nextInt();
                  TotalComandas.add(new Pedido(m.getNumero(), cod, can));
                  System.out.println("Desea agregar mas cosas?");
                  repetir = entrada.nextBoolean();
               }while (repetir == true);
            }
         }
      }
   }
   
   public void mainAtencion ()
   {
      RegistroMesas();
      
      RegistrarCarta();

      RegistroComadas();
   }

   public static void main (String[]args)
   {
      RegistroMesas();
      
      RegistrarCarta();

      RegistroComadas();
   }
}