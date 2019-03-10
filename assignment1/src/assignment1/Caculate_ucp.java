/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author 11474
 */
public class Caculate_ucp {
   public double get_ucp(){
         Caculate_uucp c1=new Caculate_uucp();
         Caculate_tcf c2=new Caculate_tcf();
         Caculate_ecf c3=new Caculate_ecf();
         
  
         int uucp= c1.get_uucp();
         double tcf=c2.get_Tfc();
         double ecf=c3.get_ecf();
         double ucp=uucp*tcf*ecf;
       return ucp;
   }
}
