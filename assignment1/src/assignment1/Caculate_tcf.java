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
public class Caculate_tcf {
      Scanner scan =new Scanner(System.in);
        double t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,tf,tfc;
        public double get_Tfc(){
         System.out.print("\tT1 Project Rating  : \t\t");
         t1=scan.nextDouble();   
         System.out.print("\tT2 Project Rating  : \t\t");
         t2=scan.nextDouble();  
         System.out.print("\tT3 Project Rating  : \t\t");
         t3=scan.nextDouble(); 
         System.out.print("\tT4 Project Rating  : \t\t");
         t4=scan.nextDouble(); 
         System.out.print("\tT5 Project Rating  : \t\t");
         t5=scan.nextDouble(); 
         System.out.print("\tT6 Project Rating  : \t\t");
         t6=scan.nextDouble(); 
         System.out.print("\tT7 Project Rating  : \t\t");
         t7=scan.nextDouble(); 
         System.out.print("\tT8 Project Rating  : \t\t");
         t8=scan.nextDouble(); 
         System.out.print("\tT9 Project Rating  : \t\t");
         t9=scan.nextDouble(); 
         System.out.print("\tT10 Project Rating : \t\t");
         t10=scan.nextDouble(); 
         System.out.print("\tT11 Project Rating : \t\t");
         t11=scan.nextDouble(); 
         System.out.print("\tT12 Project Rating : \t\t");
         t12=scan.nextDouble(); 
         System.out.print("\tT13 Project Rating : \t\t");
         t13=scan.nextDouble(); 
         tf=t1*2+t2+t3+t4+t5+t6*0.5+t7*0.5+t8*2+t9+t11+t12+t13;
         tfc=0.01*tf+0.6;
          System.out.print("\tTechnical Complexity Factor  : \t\t"+tfc+"\n\n");
            return tfc;
}
}
