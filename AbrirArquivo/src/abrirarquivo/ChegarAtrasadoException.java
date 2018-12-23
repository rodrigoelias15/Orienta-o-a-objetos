/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abrirarquivo;

import java.util.concurrent.CompletableFuture;

/**
 *
 * @author ice
 */
public class ChegarAtrasadoException extends RuntimeException{
      
    public ChegarAtrasadoException(String msg) {
        super(msg);
    }   
    
}
