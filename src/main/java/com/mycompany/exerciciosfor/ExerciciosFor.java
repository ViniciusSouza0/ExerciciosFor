package com.mycompany.exerciciosfor;
import java.util.Scanner;
public class ExerciciosFor {
public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
       
    int i = 0; 
    int x = teclado.nextInt();
    
        for(i=0; i<=x; i++) {
            if (i%2 !=0) {
                System.out.println(i);
               
            }
        }
        
    }
}