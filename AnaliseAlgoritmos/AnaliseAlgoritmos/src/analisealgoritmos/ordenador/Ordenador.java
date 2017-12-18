package analisealgoritmos.ordenador;

public abstract class Ordenador {
    
    public void ordenar(Ordenador alg, int[] v){
        alg.ordenar(v);
    }
    
    public abstract void ordenar(int[] v);
}
