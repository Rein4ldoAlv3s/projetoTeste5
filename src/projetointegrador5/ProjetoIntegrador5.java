/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
package projetointegrador5;

/**
 *
 * @author reinaldo
 */
public class ProjetoIntegrador5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Olá, Mundo -Reinaldo");
        
        System.out.println("Enter a number:");
        int num = read.nextInt();
        
        if(num>0 && num<3){
            System.out.println("You won!!");
        }else{
            System.out.println("You lost!!");
        }  
    }
}
