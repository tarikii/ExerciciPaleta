import java.util.List;
import java.util.concurrent.*;

public class ExecutorPalet {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        int numMaons = 10, ti, te;
        int numPaletes = 5;

        //instanciem els paletes
        Paleta[] palets = new Paleta[numPaletes];

        //comencem a contar el temps
        ti = (int) System.currentTimeMillis();
        //Donem nom als paletes i els posem a fer fer la paret
        for (int i=0;i<numPaletes;i++) {
            P[i] = new Paleta("Paleta-"+i);
            P[i].posaMaons(numMaons);
        }

        List<Future<Integer>> paletsTotals;

        long temp1 = System.currentTimeMillis(); //agafem els milisegons de la data
        paletsTotals = executor.invokeAll(executor.invokeAny((palets));
        executor.shutdown();


        //Han acabat i agafem el temps final
        te = (int) System.currentTimeMillis();

        System.out.println("Han trigat: " + (te - ti)/1000 + " segons");
    }
}