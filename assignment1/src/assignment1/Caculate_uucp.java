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
public class Caculate_uucp {
    Scanner scan =new Scanner(System.in);
    int asq,aaq,acq,tap,usq,uaq,ucq,tuc,uucp;
    public int get_uucp(){
        
        
        System.out.print("\tActor simple qunty :\t\t ");
        asq=scan.nextInt();
        System.out.print("\tActor average qunty :\t\t ");
        aaq=scan.nextInt();
        System.out.print("\tActor complex qunty :\t\t ");
        acq=scan.nextInt();
        tap=asq*1+aaq*2+acq*3;
        System.out.print("\tTotal Actor Points  : \t\t "+tap+"\t\n\n");
        System.out.print("\tUse Case simple qunty :\t\t ");
        usq=scan.nextInt();
        System.out.print("\tUse Case average qunty :\t ");
        uaq=scan.nextInt();
        System.out.print("\tUse Case complex qunty :\t ");
        ucq=scan.nextInt();
        tuc=usq*5+uaq*10+ucq*15;
        System.out.print("\tTotal Use Cases points  :\t "+tuc+"\t\t\n\n");
        uucp=tap+tuc;
        System.out.print("\tUnadjusted Use Case Points :\t "+uucp+"\t\t\n\n");
        
        return uucp;
        
        
        
        
        
        
    }
    
}
