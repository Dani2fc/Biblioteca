package ejecutable;

import controlador.controlador;
import modelo.Libros;
import vista.VentanaPrincipal;

public class test 
{
    public static void main (String[] args)
    {
       VentanaPrincipal miVentana= new VentanaPrincipal();
       Libros miModelo = new Libros(null, null, null, 0, null);  
       controlador miControlador = new controlador(miVentana,miModelo);

    }   
}