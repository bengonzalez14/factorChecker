/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdivchecker;
import java.util.Scanner;
/**
 *
 * @author ben-g
 */
public class GitHubDivChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        
        Scanner Gimme = new Scanner(System.in);
        
        System.out.println("divisibility checker, which number do you want to check? ");
        
        num1 = Gimme.nextInt();
        
        System.out.println("what do you want to divide by");
        
        num2 = Gimme.nextInt();
        
        if (num1 % num2 == 0){
            System.out.print("Yup ");
            System.out.print(num2);
            System.out.print(" is a factor of ");
            System.out.println(num1);
                    }
        
        else {
            System.out.print("Nope ");
            System.out.print(num2);
            System.out.print(" isn't a factor of ");
            System.out.println(num1);
        
        
    }
    }
    }
