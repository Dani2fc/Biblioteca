package ejecutable;

import javax.swing.JOptionPane;

import modelo.Libros;

public class test {
    public static void main(String[] args) {
        // Input
        String nameL = JOptionPane.showInputDialog("Digite el nombre del libro: ");
        String nameA = JOptionPane.showInputDialog("Digite el nombre del Autor: ");
        int yearE = Integer.parseInt(JOptionPane.showInputDialog("Digite el año de edición del libro: "));
        boolean dlxE = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "¿El libro es una edición de lujo?\n Escrbir true para si y false para no "));

        Libros miLibro = new Libros(nameL, nameA, yearE, dlxE);
        miLibro.edicionDeLujo();
        JOptionPane.showMessageDialog(null, miLibro.toString(), "Biblioteca señor Pérez", 1);
    }
}