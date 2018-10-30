/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;
import java.util.Scanner;

/**
 *
 * @author Дом
 */
public class Recursion {
    static int sum = 0;
    /**
     * Дано натуральное число N. Вычислите сумму его цифр.
     */
    public static int rec (int n) {
        if (n==0) return sum;
        sum = sum + n%10;
        return rec(n/10);
        
    }
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter a natural number:\n");
        n = in.nextInt();
        System.out.println ("Total sum of digits: " + rec(n));
    }
    
}
