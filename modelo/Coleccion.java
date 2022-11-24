package modelo;

public class Coleccion extends Libros {
    public String nombreColeccion;
    public int numColeccion;

    public Coleccion(String nLi, String nAu1,String nAu2, int yEd, String dlxE, String nCol, int sCol)
    {
        super(nLi, nAu1,nAu2, yEd, dlxE);
        this.nombreColeccion= nCol;
        this.numColeccion= sCol;
    }
    public String getNombreColeccion() {
        return nombreColeccion;
    }
    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
    public int getSerieColeccion() {
        return numColeccion;
    }
    public void setSerieColeccion(int numColeccion) {
        this.numColeccion = numColeccion;
    }
}
