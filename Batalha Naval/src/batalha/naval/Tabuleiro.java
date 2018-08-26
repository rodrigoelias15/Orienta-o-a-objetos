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

public class Tabuleiro {       
    
    int tam = 10;        //tamanho do vetor (tabuleiro)
    int [] vet = new int [tam];
    
    public Tabuleiro(){                
        for(int i=0; i<this.tam; i++)
            vet[i] = 0;
        posicaoNavio(this.tam, vet);   
    }         
       
    void posicaoNavio(int tam, int []tab){  
        int tam2 = tam-3;
        if(tam >= 3){  //tamanho do tabuleiro precisa ter mais que 3 posicoes pq navio ocupa 3 posicoes
            int x = (int)(Math.random()*tam2);            
            tab[x] = 1;
            tab[x+1] = 1;
            tab[x+2] = 1;
        }else
            System.out.println("Tamanho incompativel!");
    }    
}  