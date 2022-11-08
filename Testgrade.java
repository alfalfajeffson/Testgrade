/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ks
 */
import java.util.Scanner;
public class Testgrade {
    public static void main(String[]args){
        Scanner ashesi = new Scanner(System.in);
        int testScore;
        
        System.out.println(" Enter your test score ");
        testScore =  ashesi.nextInt();
        
        //TERMS FOR FOR GRADING.
        if(testScore < 60) {
            System.out.println(" Your grade is F ");
        }else if(testScore < 70) {
            System.out.println(" Your grade is D ");
        }else if(testScore < 80) {
            System.out.println(" Your grade is C "); 
        }else if(testScore < 90) {
            System.out.println(" Your grade is B "); 
        }else {
            System.out.println(" Your grade is A ");
        }
    }    
}       