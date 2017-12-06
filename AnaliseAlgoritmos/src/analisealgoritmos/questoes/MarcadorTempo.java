package analisealgoritmos.questoes;

import analisealgoritmos.ordenador.Algoritmo;
import analisealgoritmos.ordenador.Ordenador;

public class MarcadorTempo{
    private long elapsed;
    private Algoritmo alg;
    private int[] v;
    
    public MarcadorTempo(){
        this.elapsed = 0;
    }
    
    public void marcar(Ordenador ord){
        long start = System.currentTimeMillis();
        ord.ordenar(alg, v);
        
    }
}
