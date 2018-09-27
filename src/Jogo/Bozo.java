
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import bozo.Dado;
import bozo.Jogador;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Bozo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jogador gamer1 = new Jogador("Ze", 25);
        Jogador gamer2 = new Jogador("Joao", 20);        
        gamer1.jogada();
        gamer2.jogada();        
        if(gamer1.getPontos() > gamer2.getPontos())
            System.out.println("Jogador 1 venceu!");
        else if(gamer1.getPontos() == gamer2.getPontos())
            System.out.println("Jogadores empataram!");
        else
            System.out.println("Jogador 2 venceu!");       
    }    
}
