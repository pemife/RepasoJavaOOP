package repaso;

public class Calculos {

    private int valor=0;
    private static int numInstancia = 0;

    public Calculos() {
        Calculos.numInstancia++;
    }

    public static void totalInstancias() {
        System.out.printf("Total Instancias %d\n", Calculos.numInstancia);
    }
    public long calcPotencia(int base, int potencia ) {
        return Calculos.potencia(base, potencia);
    }

    public static final double PI = 3.1416;



    public static long potencia(int base, int potencia) {
        long result = 1;
        for (int i = 0; i < potencia ; i++) {
            result = result * base ;
        }
        return result;
    }
}
