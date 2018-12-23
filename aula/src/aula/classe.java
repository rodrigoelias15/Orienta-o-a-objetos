/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.lang.invoke.MethodHandles;

/**
 *
 * @author ice
 */
public class classe {

    public static float divisao(int n, int nn) {
        float x = 0;

        try {
            x = n / nn;
        } catch (ArithmeticException e) {
            System.out.println("Erro! " + e.getMessage());
        }
        return x;
    }

    public static void percorreVetor(int valor) {
        int[] vet = new int[2];
        for (int i = 0; i < 3; i++) {
            try {

                vet[i] += i + 1;
                System.out.println(i);
                System.out.println("Dividindo...");
                int x = vet[i] / valor;
            } catch (ArithmeticException k) {
                System.out.println(k.toString());
            } catch (ArrayIndexOutOfBoundsException k){
             System.out.println(k.toString());
            }
        }
    }
}
