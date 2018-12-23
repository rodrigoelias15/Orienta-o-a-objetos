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
public class Gato extends Animal implements Robo, Plastico{

    public void emitirSom() {
        System.out.println("miau");
    }
    
    public void comer(){
        System.out.println("Gato comendo");
    } 
    
    public void aspirarChao() {
        System.out.println("Gato robo está aspirando o chao!");        
    }

    public void tocarMusica() {
        System.out.println("Gato robo esta tocando musica!");
    }
    
}
