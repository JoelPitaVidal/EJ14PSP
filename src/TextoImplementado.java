import javax.swing.JOptionPane;
/**
 * Clase TextoImplementado.
 * Se encarga de contar las vocales en un texto dado.
 */
public class TextoImplementado {
    // Texto en el que se contarán las vocales
    public String palabra;

    // Contadores de vocales
    private int contadorA = 0;
    private int contadorE = 0;
    private int contadorI = 0;
    private int contadorO = 0;
    private int contadorU = 0;

    public TextoImplementado(String palabra) {
        this.palabra = palabra;
    }

    /**
     * Incrementa el contador de la vocal 'a'.
     */
    public synchronized void incrementarA() {
        contadorA++;
    }

    /**
     * Incrementa el contador de la vocal 'e'.
     */
    public synchronized void incrementarE() {
        contadorE++;
    }

    /**
     * Incrementa el contador de la vocal 'i'.
     */
    public synchronized void incrementarI() {
        contadorI++;
    }

    /**
     * Incrementa el contador de la vocal 'o'.
     */
    public synchronized void incrementarO() {
        contadorO++;
    }

    /**
     * Incrementa el contador de la vocal 'u'.
     */
    public synchronized void incrementarU() {
        contadorU++;
    }

    /**
     * Devuelve el número total de vocales contadas.
     * @return El número total de vocales.
     */
    public synchronized int getTotal() {
        return contadorA + contadorE + contadorI + contadorO + contadorU;
    }

    /**
     * Muestra el número total de vocales contadas.
     */
    public void mostrarTotal() {
        JOptionPane.showMessageDialog(null, "El total de vocales es: " + getTotal());
    }
}
