/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval;

/**
 *
 * @author RODRIGO
 */
public class Jogador {
    String nome;
    int idade;
    
    boolean palpite(){
        Tabuleiro tab = new Tabuleiro();
        int x = (int)(Math.random()*tab.tam);
        int vet = tab.vet[x];
        if(vet == 1)
            return true;
        else
            return false;        
    }
    
}
