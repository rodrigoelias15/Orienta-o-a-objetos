/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.ArrayList;

/**
 *
 * @author ice
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato cat = new Gato();        
        Cachorro dog = new Cachorro();
        Galinha chicken = new Galinha();
        ArrayList <Animal> animais = new ArrayList();        
        animais.add(cat);
        animais.add(dog);
        animais.add(chicken);
        animais.add(new Gato());
        
        for(int i=0; i < animais.size(); i++){
            animais.get(i).setNome("Zezinho");
            System.out.println(animais.get(i).toString());
            animais.get(i).emitirSom();
        }        
        cat.aspirarChao();  
        Animal gato = new Gato();
        ((Gato)gato).aspirarChao(); //soh gato puxa metodos de "robo"
        
        System.out.println(cat.equals(dog));
        
    }
    
}
