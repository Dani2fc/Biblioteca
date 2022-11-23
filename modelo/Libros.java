package modelo;

public class Libros{
    // Atributos
    protected String nombreLibro;
    protected String nombreAutor;
    protected int yearEdition;
    protected boolean deluxeEdition;
    private String edicionDeLujo = "";
    private String otros = "";

    // Constructor
    public Libros(String nameL, String nameA, int yearE, boolean dlxE){
        this.nombreLibro = nameL;
        this.nombreAutor = nameA;
        this.yearEdition = yearE;
        this.deluxeEdition = dlxE;
    }

    // Métodos
    public String edicionDeLujo(){
        if(deluxeEdition == true){
            edicionDeLujo = "Edición de Lujo";
        }else{
            edicionDeLujo = "Edición estándar";
        }
        return edicionDeLujo;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public int getYearEdition() {
        return yearEdition;
    }

    public void setYearEdition(int yearEdition) {
        this.yearEdition = yearEdition;
    }

    public boolean isDeluxeEdition() {
        return deluxeEdition;
    }

    public void setDeluxeEdition(boolean deluxeEdition) {
        this.deluxeEdition = deluxeEdition;
    }

    public String toString(){
        return "Datos del libro registrado: "+ nombreLibro + ", "+ nombreAutor+ ", "+ yearEdition+ ", "+ edicionDeLujo;
    }
}