    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozo;

import bozo.Dado;
import java.util.Scanner;
import sun.util.locale.provider.AuxLocaleProviderAdapter;

/**
 *
 * @author ice
 */
public class Tabuleiro{       
    
  int pontuacao = 0;
  
    /**
     * Define pontuacao do jogador
     */
  public void estrategiaJogo(){      
      int i = 0, cont;   
      Scanner ler = new Scanner(System.in);
      
     
      //----------------------------------------
      i=0;
      while(i < 5){
        if(Jogador.d[i] == Jogador.d[i+1]){ 
            //se faces forem iguais, continua iteracao!
        }
        else //se nao, sai do 'while' e procura nova estrategia
            break;        
        if(i == 4){    //Todas as faces dos dados são iguais
            if(Jogador.d[i] == 1){  
                System.out.print("Cinco faces iguais a " + 1 + ", deseja usar AS? ");                
                String est = ler.nextLine();                
                if(est.equals("sim")||est.equals("SIM")||est.equals("Sim")){
                    this.pontuacao = 5;
                    return;
                }else{            
                this.pontuacao = 50;                   
                return;            
            }
            }
            if(Jogador.d[i] == 2){  
                System.out.print("Cinco faces iguais a " + 2 + ", deseja usar DUQUE? ");                
                String est = ler.nextLine();                
                if(est.equals("sim")||est.equals("SIM")||est.equals("Sim")){
                    this.pontuacao = 10;
                    return;
                }else{            
                this.pontuacao = 50;                  
                return;          
            }
            }
            if(Jogador.d[i] == 3){  
                System.out.print("Cinco faces iguais a " + 3 + ", deseja usar TERNO? ");                
                String est = ler.nextLine();                
                if(est.equals("sim")||est.equals("SIM")||est.equals("Sim")){
                    this.pontuacao = 15;
                    return;
                }else{            
                this.pontuacao = 50;                 
                return;            
            }
            }
            if(Jogador.d[i] == 4){  
                System.out.print("Cinco faces iguais a " + 4 + ", deseja usar QUADRA? ");                
                String est = ler.nextLine();                
                if(est.equals("sim")||est.equals("SIM")||est.equals("Sim")){
                    this.pontuacao = 20;
                    return;
                }else{            
                this.pontuacao = 50;                 
                return;           
                }
            }
            if(Jogador.d[i] == 5){  
                System.out.print("Cinco faces iguais a " + 5 + ", deseja usar QUINA? ");                
                String est = ler.nextLine();                
                if(est.equals("sim")||est.equals("SIM")||est.equals("Sim")){
                    this.pontuacao = 25;
                    return;
                }
            }else{            
                this.pontuacao = 50;                 
                return;          
            }
            if(Jogador.d[i] == 6){  
                System.out.print("Cinco faces iguais a " + 6 + ", deseja usar SENA? ");                
                String est = ler.nextLine();                
                if(est.equals("sim")||est.equals("SIM")||est.equals("Sim")){
                    this.pontuacao = 30;
                    return;
                }
            }else{            
                this.pontuacao = 50;                
                return;          
            }
          }i++;
        }      
      i = 0;
      cont = 0;
      while(i < 5){         //Se tiver 4 faces iguais
          if(Jogador.d[i] == Jogador.d[i+1])
            cont++;
          if(cont == 3 && i == 4){
              this.pontuacao = 40;              
              return;
          }i++;       
      }            
      i = 0;
      while(i < 5){
        if(Jogador.d[i] != Jogador.d[i+1]){ 
            //se faces forem diferentes, continua iteracao!
        }
        else //se nao, sai do 'while' e procura nova estrategia
            return;     
        if(i == 4){
              this.pontuacao = 30;              
              return;
        } i++;
      }
      for(i=0; i<5; i++)
          this.pontuacao += Jogador.d[i]; 
      
  }    
}      

