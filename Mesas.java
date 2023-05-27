public class Mesas
{
   public int Numero;
   public String Estado;
   
   Mesas(int Numero, String Estado)
   {
      this.Numero = Numero;
      this.Estado = Estado;
   }
   
   int getNumero ()
   {
      return Numero;
   }
   
   String getEstado()
   {
      return Estado;
   }

   void setEstado(String Estado)
   {
      this.Estado = Estado;
   }
}