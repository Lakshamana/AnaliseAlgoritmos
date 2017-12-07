package analisealgoritmos;

import analisealgoritmos.questoes.MarcadorTempo;
import analisealgoritmos.questoes.Q1;

public class Main {

    
    public static void main(String[] args) {
        Q1 q1 = new Q1(new MarcadorTempo());
        q1.run();
    }
    
}
