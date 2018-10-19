/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

/**
 *
 * @author User
 */
public class Duelo extends Confere{

    public Duelo(String nome1, int nivel1, String nome2, int nivel2){
        if(ehPsiquico(nome1)){
            Psiquico p1 = new TipoPokemon();
            p1.psiquico(nivel1);
        }
        
        if(ehFogo(nome2)){
            Fogo p2 = new TipoPokemon();
            p2.fogo(nivel2);
        }
    }
    
}
