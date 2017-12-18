package analisealgoritmos.questoes;

import analisealgoritmos.ordenador.QuickSort;

public class Q1 extends Questao {

    QuickSort qs = new QuickSort();
    public Q1(MarcadorTempo t) {
        super(t);
    }

    @Override
    public void run(){
        for(int i = 0; i < 3; i++)
            impl(qs, i + 1, 10);
    }
}
