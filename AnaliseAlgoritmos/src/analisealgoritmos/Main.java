package analisealgoritmos;

import analisealgoritmos.ordenador.GeradorVetores;
import analisealgoritmos.questoes.MarcadorTempo;
import analisealgoritmos.questoes.Q1;
import java.util.Arrays;


public class Main {

    
    public static void main(String[] args) {
        Q1 q1 = new Q1(new MarcadorTempo());
        q1.run();
        GeradorVetores g = new GeradorVetores();
        //System.out.println("Vetor: " + Arrays.toString(g.generate(4, 50)));
    }
    
}
