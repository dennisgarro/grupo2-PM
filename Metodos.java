import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Objlibrop3[][] LlenarMatrizLibro(int d) {
        Objlibrop3[][] m = new Objlibrop3[d][d];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                Objlibrop3 o = new Objlibrop3();
                System.out.println("Ingrese el titulo del libro");
                o.setTitulo(sc.next());
                System.out.println("Ingrese el Autor del libro ");
                o.setAutor(sc.next());
                System.out.println("Ingrese el año de publicacion del libro");
                while (!sc.hasNextInt()) {
                    System.out.println("por favor ingrese un dato numerico para el año");
                    sc.next();
                }
                o.setApublicacion(sc.nextInt());
                System.out.println("Ingrese el precio del libro ");
                while (!sc.hasNextDouble()) {
                    System.out.println("por favor ingrese un dato numerico para el precio");
                    sc.next();
                }
                o.setPrecio(sc.nextDouble());
                System.out.println("");
                m[i][j] = o;
            }
        }
        return m;
    }
    public void MotrarMatrizOriginalLibro(Objlibrop3[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Nombre del libro : " + m[i][j].getTitulo());
                System.out.println("Autor del libro: " + m[i][j].getAutor());
                System.out.println("Año de publicacion del libro"+ m[i][j].getApublicacion());
                System.out.println("Precio Producto: " + m[i][j].getPrecio());  
                System.out.println();  
        }
        
    }
}
    public String PrecioMayor(Objlibrop3[][] m)
    {
        String r ="";
        double p_mayor=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getPrecio()> p_mayor) {
                    p_mayor=m[i][j].getPrecio();
                    r = "El libro mas costoso de la libreria: \nTitulo: "+ m[i][j].getTitulo()+"\n Autor : "+ 
                    m[i][j].getAutor()+"\n Año de publicacion : "+ m[i][j].getApublicacion()+"\n precio : "+ m[i][j].getPrecio()+"\n Libros Evaluados : "+(m.length*m.length) ;
                }
            }
        }


        return r;
    }
}
