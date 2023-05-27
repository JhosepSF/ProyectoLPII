import java.util.Scanner;
import java.util.ArrayList;

//Esta clase es sobre la gestion de seguridad o modulo de seguridad 
public class GS 
{
    public static Scanner entrada = new Scanner(System.in);
    //Variables globales
    static ArrayList <Usuarios> TotalUsuarios = new ArrayList<Usuarios>();

    //Metodo q devuelve verdadero si es que el usuario esta bn ingresado
    static boolean ValidacionUser (String User, String UserS)
    {
        if(User.equals(UserS))
        {
            return true;
        }
        return false;
    }

    //Metodo q devuelve verdadero si es que la contraseña esta bn ingresada
    static boolean ValidacionContraseña (String Contraseña, String ContraseñaS)
    {
        if(Contraseña.equals(ContraseñaS))
        {
            return true;
        }
        return false;
    }

    //Este metodo sera para recrear la matriz con los valores ya puestos y agregar nuevos a la tabla de Usuarios
    static void CargarDatos(Usuarios U,int Tipo)
    {
        String TipoUsuario = "";
        String valor = "";
        int Contador = 1;
        
        //Se selecciona que tipo de usuario se va a agregar
        switch (Tipo)
        {
            case 1:
                for (int i = 0; i < TotalUsuarios.size(); i ++)
                {
                    //Con el charAt obtenemos el primer caracter del String del codigo y luego con String.valueOf lo pasamos a String nuevamente
                    valor = String.valueOf(TotalUsuarios.get(i).getTipoUsuario().charAt(0));
                    //Compramos si el valor obtenido es igual al denominador de Administradores (A)
                    if(valor.equals("A"))
                    {
                        //Si lo es, subimos el numero del contador para luego lograr que nuestro nuevo ingresante tenga un codigo unico y consecutivo
                        Contador = Contador + 1;
                    }
                }
                TipoUsuario = "A0" + String.valueOf(Contador);
            break;
         
            case 2:
                for (int i = 0; i < TotalUsuarios.size(); i ++)
                {
                    valor = String.valueOf(TotalUsuarios.get(i).getTipoUsuario().charAt(0));
                    if(valor.equals("G"))
                    {    
                        Contador = Contador + 1;
                    }
                }
                TipoUsuario = "G0" + String.valueOf(Contador);
            break;
         
            case 3:
                for (int i = 0; i < TotalUsuarios.size(); i ++)
                {
                    valor = String.valueOf(TotalUsuarios.get(i).getTipoUsuario().charAt(0));
                    if(valor.equals("C"))
                    {
                        Contador = Contador + 1;
                    }
                }
                TipoUsuario = "C0" + String.valueOf(Contador);
            break;
         
            case 4:
                for (int i = 0; i < TotalUsuarios.size(); i ++)
                {
                    valor = String.valueOf(TotalUsuarios.get(i).getTipoUsuario().charAt(0));
                    if(valor.equals("M"))
                    {
                        Contador = Contador + 1;
                    }
                }
                TipoUsuario = "M0" + String.valueOf(Contador);
            break;
        }
        //Aqui se rellena los valores del usuario y se asigna sus correspondientes a la tabla 
        U.Llenar(TipoUsuario);
        TotalUsuarios.add(U); 
    }

    //Metodo para imprimir los datos de la tabla
    static void Impresion ()
    {
        for(Usuarios US : TotalUsuarios)
        {
            System.out.println("Id Tipo Usuario: " + US.getTipoUsuario() + " ,Nombre: " + US.getNombre() + " , DNI: " + US.getDNI());
        }
    }

    //Metodo que permitira la creacion de nuevos usuarios
    static void newUser ()
    {
        Usuarios U1 = new Usuarios();
        System.out.println("Que tipo de usuario deseas crear" + "\n" +
                            "Administrador = 1" + "\n" +
                            "Gerente = 2" + "\n" +
                            "Cajero = 3" + "\n" +
                            "Mesero = 4");
        int creacion = entrada.nextInt();
        CargarDatos(U1, creacion);
        Impresion();   
    }

    public static void main (String[]args)
    {
        //Se agrega al usuario Administrador 1
        TotalUsuarios.add(new Usuarios("A01", "123", "Jhosep", "72394996", "986644487", 20));

        //Ingreso y verificacion de usuario
        System.out.println("Ingrese su nombre de usuario para acceder");
        if (ValidacionUser(entrada.nextLine(), TotalUsuarios.get(0).getNombre()))
        {
            //Verificacion de contraseña
            System.out.println("Ingrese su contraseña");
            if(ValidacionContraseña(entrada.nextLine(), TotalUsuarios.get(0).getContraseña()))
            {
                //Acciones q puede realizar el Administrador
                System.out.println("Puede crear nuevo usuario, ¿Desea hacerlo?" + "\n" + "Si = 1, No = 0");
                int Seleccion = entrada.nextInt();
                if(Seleccion == 1) 
                {
                    newUser();
                }
            }
        }
    }
}