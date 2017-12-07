package analisealgoritmos.ordenador;

public abstract class Ordenador {
    
    public void ordenar(Ordenador alg, int[] v){
        alg.ordenar(v);
    }
    
    //A classe que implementar Params deve usar este método.
    public void ordenar(Ordenador alg, int[] v, int a, int b){
        alg.ordenar(alg, v, a, b);
    }
    
    public abstract void ordenar(int[] v);
}
