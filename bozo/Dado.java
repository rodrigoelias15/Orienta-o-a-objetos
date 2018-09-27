/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozo;



/**
 *
 * @author ice
 */
public class Dado{     
    
    int numFaces = 6;    
    int [] dado1 = {1,2,3,4,5,6};    
    int i = 0;  
         
    protected int rolar(int i){
        i = (int)(Math.random()*numFaces);            
        return i;
    }        
}
