/**
 * Clase que cuenta la vocal 'i' en el texto.
 */
public class CuentaVocalesI implements Runnable {
    private final TextoImplementado texto;

    /**
     * Constructor de CuentaVocalesI.
     *
     * @param texto Instancia de TextoImplementado.
     */
    public CuentaVocalesI(TextoImplementado texto) {
        this.texto = texto;
    }

    @Override
    public void run() {
        for (char c : texto.palabra.toCharArray()) {
            if (c == 'i') {
                texto.incrementarI();
            }
        }
    }
}