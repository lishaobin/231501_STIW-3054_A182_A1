/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author 11474
 */
public class Caculate_ecf {
    public double e1,e2,e3,e4,e5,e6,e7,e8,ef,ecf;
       
        public double get_ecf(){
            Scanner scan =new Scanner(System.in);
            
            System.out.print("\tE1 Project Rating : \t\t");
            e1=scan.nextDouble();
            System.out.print("\tE2 Project Rating : \t\t");
            e2=scan.nextDouble();
            System.out.print("\tE3 Project Rating : \t\t");
            e3=scan.nextDouble();
            System.out.print("\tE4 Project Rating : \t\t");
            e4=scan.nextDouble();
            System.out.print("\tE5 Project Rating : \t\t");
            e5=scan.nextDouble();
            System.out.print("\tE6 Project Rating : \t\t");
            e6=scan.nextDouble();
            System.out.print("\tE7 Project Rating : \t\t");
            e7=scan.nextDouble();
            System.out.print("\tE8 Project Rating : \t\t");
            e8=scan.nextDouble();
            ef=e1*1+e2*0.5+e3+e4*0.5+e6*2-e7-e8;
            ecf=0.03*ef+1.4;
            System.out.print("\tTotal EFactor     : \t\t"+ef+"\n\n");
            return ecf;
            
}
}
