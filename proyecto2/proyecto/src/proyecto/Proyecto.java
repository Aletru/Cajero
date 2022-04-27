/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author a2456
 */
public class Proyecto {
     static float setSaldo;
    public static int saldo=5000;
    public static float retiro=0;
    public static float deposito=0;
    
    Scanner sc= new Scanner(System.in);
    
    public void setSaldo(int saldo){
         this.saldo=saldo;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setRetiro(float retiro){
         retiro=sc.nextFloat();
    }
    public float getRetiro(){
        return retiro;
    }
    
     public void setDeposito(float deposito){
        deposito=sc.nextFloat();
        
    }
    public float getDeposito(){
        return deposito;
    }
    
    public static Proyecto id1=new Proyecto();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        id1.setSaldo(5000);
        inicio i = new inicio();
        i.setVisible(true);
    }
    
}
