public class Pedido
{
    private String CodPlato;
    private int Cantidad, Mesa;

    Pedido(int Mesa, String CodPlato, int Cantidad)
    {
        this.Mesa = Mesa;
        this.CodPlato = CodPlato;
        this.Cantidad = Cantidad;
    }

    String getCodPlato()
    {
        return CodPlato;
    }

    int getCantidad()
    {
        return Cantidad;
    }

    int getMesa()
    {
        return Mesa;
    }
}