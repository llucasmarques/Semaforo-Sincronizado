package semafaro.sincronizado;

public class MudancaEstado {

    private boolean control = false;
    private int cor = 0;

    public synchronized void VV() {
        while (cor != 0) {
            try {
                wait();
            } // fim do try
            catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println("Vermelho");
        System.out.println("\t\t Verde");
        cor = 1;
        notify();
    }

    public synchronized void VA() {
        while (cor != 1) {
            try {
                wait();
            } // fim do try
            catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println("\t\t Amarelo");
        System.out.println("Vermelho");
        cor = -1;
        notify();
    }

    public synchronized void VV2() {
        while (cor != -1) {
            try {
                wait();
            } // fim do try
            catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println("\t\t Vermelho");
        System.out.println("Verde");
        cor = 2;
        notify();
    }
    
        public synchronized void AV() {
        while (cor != 2) {
            try {
                wait();
            } // fim do try
            catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println("\t\t Vermelho");
        System.out.println("Amarelo");
        cor = 0;
        notify();
    }
}
