import java.util.Scanner;
public class Usuarios 
{
    private String TipoUsuario, Contraseña, Nombre, DNI, Telefono;
    private int Edad;
    public Scanner entrada = new Scanner(System.in);

    public Usuarios()
    {
        this.TipoUsuario = "";
        this.Contraseña = "";
        this.Nombre = "";
        this.DNI = "";
        this.Telefono = "";
        this.Edad = 0;
    }

    public Usuarios (String TipoUsuario, String Contraseña, String Nombre, String DNI, String Telefono, int Edad)
    {
        this.TipoUsuario = TipoUsuario;
        this.Contraseña = Contraseña;
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Telefono = Telefono;
        this.Edad = Edad;
    }

    String getTipoUsuario()
    {
        return TipoUsuario;
    }

    void setTipoUsuario(String TipoUsuario)
    {
      this.TipoUsuario = TipoUsuario;
    }

    String getNombre()
    {
        return Nombre;
    }

    String getContraseña()
    {
        return Contraseña;
    }
    
    String getDNI()
    {
        return DNI;
    }

    String getTelefono()
    {
        return Telefono;
    }

    int getEdad()
    {
        return Edad;
    }
     
    void Llenar(String TipoUsuario)
    {
        setTipoUsuario(TipoUsuario);
        System.out.println("Ingrese su nombre completo");
        Nombre = entrada.nextLine();
        System.out.println("Ingrese la contraseña del usuario");
        Contraseña = entrada.nextLine();
        System.out.println("Ingrese el DNI del usuario");
        DNI = entrada.nextLine();
        System.out.println("Ingrese el telefono del usuario");
        Telefono = entrada.nextLine();
        System.out.println("Ingrese la edad del usuario");
        Edad = entrada.nextInt();
    }
}