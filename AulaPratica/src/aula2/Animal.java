/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author ice
 */
public abstract class Animal {
    
    String cor;
    String nome;
    String raca;
    int idade;
       
    public abstract void emitirSom();
    
    public abstract void comer();
    
    @Override
    public String toString(){
        return this.nome;
    }
    
    public boolean equals(Animal a){
        return this.nome.equals(a.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
