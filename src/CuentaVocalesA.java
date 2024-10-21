/**
 * Clase que cuenta la vocal 'a' en el texto.
 */
public class CuentaVocalesA implements Runnable {
    private final TextoImplementado texto;

    /**
     * Constructor de CuentaVocalesA.
     * @param texto Instancia de TextoImplementado.
     */
    public CuentaVocalesA(TextoImplementado texto) {
        this.texto = texto;
    }

    @Override
    public void run() {
        for (char c : texto.palabra.toCharArray()) {
            if (c == 'a') {
                texto.incrementarA();
            }
        }
    }
}