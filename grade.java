/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grading;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class Grading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        if(80<=number && number<=100){
            System.out.print("You have got GPA -A+ \n" );
        }
        else if(number>=75 && number<=79){
            System.out.print("You have got GPA -A \n");
        }
        else if(number>=70 && number<=74){
            System.out.print("You have got GPA -A- \n");
        }
        else if(number>=65 && number<=69){
            System.out.print("You have got GPA -B+ \n");
        }
        else if(number>=60 && number<=64){
            System.out.print("You have got GPA -B \n");
        }
        else if(number>=55 && number<=59){
            System.out.print("You have got GPA -B-\n");
        }
        else if(number>=50 && number<=54){
            System.out.print("You have got GPA -C+\n");
        }
        else if(number>=45 && number<=49){
            System.out.print("You have got GPA -C\n");
        }
        else if(number>=40 && number<=44){
            System.out.print("You have got GPA -D\n");
        }
        else{
            System.out.print("Sorry !!!...You have got big ZERO \n");
        }
    }
    
}
