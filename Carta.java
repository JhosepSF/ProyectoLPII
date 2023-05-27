public class Carta 
{
    public String Nombre;
    public double Precio;
    Carta(String Nombre, double Precio)
    {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    double getPrecio()
    {
        return Precio;
    }

    String getNombre()
    {
        return Nombre;
    }
}