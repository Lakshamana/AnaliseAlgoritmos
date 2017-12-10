package analisealgoritmos.questoes;

import analisealgoritmos.ordenador.Ordenador;

public class MarcadorTempo{
    private long elapsed = 0;
    private int[] v;

    public void marcar(Ordenador ord){
        long start = System.currentTimeMillis();
        ord.ordenar(v);
        elapsed = System.currentTimeMillis() - start;
    }

    public void setV(int[] v) {
        this.v = v;
    }

    public int[] getV() {
        return v;
    }
    
    public long getElapsed() {
        return elapsed;
    }
}
