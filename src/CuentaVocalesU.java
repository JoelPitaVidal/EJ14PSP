public class CuentaVocalesU implements Runnable{
    TextoImplementado text = new TextoImplementado("aeiou",0,0,0,0,0,0);

    @Override
    public void run() {
        for(int x=0;x<text.palabra.length();x++) {
            if ((text.palabra.charAt(x)=='i')){
                text.setContadorU(text.contadorU++);
            }
        }
    }
}