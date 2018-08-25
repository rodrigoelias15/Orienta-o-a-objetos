/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval;

import java.util.Scanner;
import java.util.function.Function;

/**
 *
 * @author RODRIGO
 */

public class Tabuleiro {       
    
    int tam;        
    
    public Tabuleiro(int tam){
        this.tam = tam;   
        criaVetor();
    }         
    
    void criaVetor(){
        int [] vet = new int [this.tam];
        for(int i=0; i<this.tam; i++)
            vet[i] = 0;
        posicaoNavio(this.tam, vet);
        for(int i=0; i<this.tam; i++)
            System.out.print(vet[i]+" ");
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