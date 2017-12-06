package analisealgoritmos.questoes;

import analisealgoritmos.ordenador.Algoritmo;
import analisealgoritmos.ordenador.GeradorVetores;

public abstract class Questao {
    private MarcadorTempo marcador;
    private Algoritmo alg;
    private GeradorVetores g;
    
    public Questao(MarcadorTempo t, Algoritmo alg){
        this.marcador = t;
        g = new GeradorVetores();
    }
    
    abstract void run();
}
