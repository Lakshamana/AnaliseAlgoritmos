/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisealgoritmos.questoes;

import analisealgoritmos.ordenador.GeradorVetores;

/**
 *
 * @author arjuna
 */
public abstract class Questao {
    private MarcadorTempo marcador;
    private GeradorVetores g;
    
    public Questao(){
        marcador = new MarcadorTempo();
        g = new GeradorVetores();
    }
    
    abstract void run();
}
