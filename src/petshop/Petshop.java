/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.util.Scanner;

/**
 *
 * @author info206
 */
public class Petshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int FATOR1 ,RESULTADO = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o numero");
        FATOR1  = teclado.nextInt();
        
        
        for(int fat=FATOR1;FATOR1>1;FATOR1--){
            RESULTADO= RESULTADO*FATOR1;
                    System.out.println(" " +RESULTADO);
        }
    }
}
