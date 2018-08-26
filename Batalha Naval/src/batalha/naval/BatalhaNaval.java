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
public class BatalhaNaval {
    public static void main(String[] args) {
        // TODO code application logic here       
        Tabuleiro tab;
        tab = new Tabuleiro();
        Jogador gamer;
        gamer = new Jogador();
        int cont = 0;
        for(int i=0; i<4; i++){   //Jogador tem direito a 4 palpites
            if(gamer.palpite())
                cont++;
        }
        if(cont == 3)
            System.out.println("Navio abatido, jogador venceu!");
        if(cont > 0 && cont < 3)
            System.out.println("Navio atacado parcialmente, jogador perdeu!");
        if(cont==0)
            System.out.println("Errou todos os tiros, jogador perdeu!");
    }
}
