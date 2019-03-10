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
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Caculate_ucp c1=new Caculate_ucp();
         
         
         System.out.println("**********************Caculate Use Case Point********************\n");
         double ucp=c1.get_ucp();
         System.out.println("\tUse Case Point : " +ucp+"\n");
         System.out.println("**********************Caculate Use Case Point********************\n\n");
         
         
         System.out.println("******************Calculating Man-hours from UCP *****************\n");
        
         double man_hour=ucp*28;
         System.out.println("\tMan-hours from UCP : " +man_hour+"\n");
         System.out.println("******************Calculating Man-hours from UCP*****************\n\n");
         
         
         System.out.println("******************Adjusting Man-hours for Risk  *****************\n");
         double adjusted_man_hour=man_hour*1.05;
         System.out.println("\tMan-hours from UCP : " +adjusted_man_hour+"\n");
         System.out.println("******************Adjusting Man-hours for Risk P*****************\n\n");
         
         
       
       
        // TODO code application logic here
    }
   
    
}
