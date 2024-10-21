/**
 * Clase que cuenta la vocal 'o' en el texto.
 */
public class CuentaVocalesO implements Runnable {
    private final TextoImplementado texto;

    /**
     * Constructor de CuentaVocalesO.
     *
     * @param texto Instancia de TextoImplementado.
     */
    public CuentaVocalesO(TextoImplementado texto) {
        this.texto = texto;
    }

    @Override
    public void run() {
        for (char c : texto.palabra.toCharArray()) {
            if (c == 'o') {
                texto.incrementarO();
            }
        }
    }
}