
public class Juan_David_Liñan {
   public void P3(int d)
   {
      Metodos m = new Metodos();
      Objlibrop3[][] M = new Objlibrop3[d][d];
      M=m.LlenarMatrizLibro(d);
      m.MotrarMatrizOriginalLibro(M);
      System.out.println(m.PrecioMayor(M));
   }
}
