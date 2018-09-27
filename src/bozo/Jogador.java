/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozo;
import bozo.Dado;
/**
 *
 * @author ice
 */
public class Jogador{
    
    String nome;
    int idade;   
    int pontos = 0;
    static int [] d = new int[6];
    Dado d2 = new Dado(); //variavel auxiliar para chamar metodos da classe Dado    

    public Jogador() {
    }

    public Jogador(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }    
    
    public void jogada(){
        for(int i=0; i<6; i++)
            d[i] = d2.dado1[d2.rolar(i)]; //vetor 'd' recebe valor aleatorio de 1 a 6                
        Tabuleiro aux = new Tabuleiro();
        aux.estrategiaJogo();
        this.pontos = aux.pontuacao;
    }   
    
    public int getPontos(){
        return pontos;
    }   
    
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }         
}
