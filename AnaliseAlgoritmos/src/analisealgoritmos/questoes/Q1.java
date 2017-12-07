package analisealgoritmos.questoes;

import analisealgoritmos.ordenador.BubbleSort;
import analisealgoritmos.ordenador.ShellSort;
import java.util.Arrays;

public class Q1 extends Questao{
    
    BubbleSort bs = new BubbleSort();
    ShellSort sh = new ShellSort();
    public Q1(MarcadorTempo t){
        super(t);
    }
    
    //Fase de testes
    @Override
    public void run() {
        int [] v = getG().generate(4, 5000);
        getMarcador().setV(v);
        
        System.out.println("Vetor a ordenar: " + Arrays
                .toString(getMarcador().getV())); 
        getMarcador().marcar(bs);   
        System.out.println("Vetor ordenado: " + Arrays
                .toString(getMarcador().getV()));
        
        System.out.println("Tempo total de execução: " + getMarcador().getElapsed() + "ms");
    }
    
}
