package analisealgoritmos.questoes;

import analisealgoritmos.ordenador.GeradorVetores;

public abstract class Questao {
    private MarcadorTempo marcador;
    private GeradorVetores g;
    
    public Questao(MarcadorTempo t){
        marcador = new MarcadorTempo();
        g = new GeradorVetores();
        this.marcador = t;
    }
    
    abstract void run();

    public MarcadorTempo getMarcador() {
        return marcador;
    }

    public GeradorVetores getG() {
        return g;
    }
}
