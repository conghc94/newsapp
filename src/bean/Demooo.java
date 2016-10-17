/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Scanner;

/**
 *
 * @author cong
 */
public class Demooo {
     
    
    public static void main(String[] args) {
        float S=15;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i =0; i<=n;i++){
            S = S +(float)(-1)*i/n;
        }
    }
}
