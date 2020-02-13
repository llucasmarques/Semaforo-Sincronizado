package semafaro.sincronizado;

import java.util.Random;

public class SemafaroD implements Runnable {

    private static Random generator = new Random();
    private MudancaEstado md = new MudancaEstado();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(generator.nextInt(3000));
                md.VV();
                md.VA();
                md.VV2();
                md.AV();
            } 
            catch (InterruptedException exception) {
                exception.printStackTrace();
            } // fim do catch 
        }
    }

}
