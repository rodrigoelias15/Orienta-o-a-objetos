/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abrirarquivo;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ice
 */
public class A {
       
    public void m1(){
        B aux = new B();
        try {
            aux.m2();
        }        
        catch (FileNotFoundException ex) {     
        }
    }
}
