/**
 * Clase que cuenta la vocal 'u' en el texto.
 */
public class CuentaVocalesU implements Runnable {
    private final TextoImplementado texto;

    /**
     * Constructor de CuentaVocalesU.
     *
     * @param texto Instancia de TextoImplementado.
     */
    public CuentaVocalesU(TextoImplementado texto) {
        this.texto = texto;
    }

    @Override
    public void run() {
        for (char c : texto.palabra.toCharArray()) {
            if (c == 'u') {
                texto.incrementarU();
            }
        }
    }
}
