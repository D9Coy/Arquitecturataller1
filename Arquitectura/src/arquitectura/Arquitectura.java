/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitectura;

import java.util.Scanner;

/**
 *
 * @author utp
 */
public class Arquitectura {
    Scanner sc = new Scanner(System.in);
 
    public int mult(int a, int b){
        //System.out.println("Digite numero a");
        //int a,b;
        //a = sc.nextInt();
        //System.out.println("Digite numero b");
        //b = sc.nextInt();
        int i = 0;
        int res = 0;
        while( i != a){
            res = b + res;
            i++;
        }
        return res;
    }
    
    public int potencia(int a, int b){
        int i = 0;
        int res = 1;

        while( i != b){
            res = mult(a,res);
            i++;
        }
        
        return res;       
    }
    
    public int pol(int x,int k[],int n){
        int y=0;
        for(int i=0; i<=n; i++){
            y= y + mult(potencia(x,n-i),k[i]);
        }
        return y;
    }
    
    public int fact(int n){
        int res =0;
        int aux=1;
        for(int i = 0;i<n;i++){
            res = mult(aux,i+1);
            aux = res;
        }
        return res;
    }
    
    public int div(int a, int b){
        int res =0;
        while(a<b){
            a=a-b;
            res++;         
        }
        return res;
    }
    

    public static void main(String[] args) {
        Arquitectura a;
        a = new Arquitectura();
        int k[]= {4,2,1,10,20};
        //System.out.println(a.suma(3,3));
        //System.out.println(a.potencia(2, 3));
        //                       x k n
        System.out.println(a.pol(3,k,4));
        //System.out.println(a.fact(10));
    }
    
}
