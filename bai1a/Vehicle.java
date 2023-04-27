/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1a;

/**
 *
 * @author Admin
 */
public class Vehicle {
 public String tenchuxe;
 public String loaixe;
 public double dungtich;
 public double trigia;
  
    public Vehicle() {
         this.tenchuxe =  null;
        this.loaixe = null;
        this.dungtich = 0;
        this.trigia = 0;
     }

    public Vehicle(String tenchuxe, String loaixe, double dungtich, double trigia) {
        this.tenchuxe = tenchuxe;
        this.loaixe = loaixe;
        this.dungtich = dungtich;
        this.trigia = trigia;
     }

    public String getTenchuxe() {
        return tenchuxe;
    }

    public void setTenchuxe(String tenchuxe) {
        this.tenchuxe = tenchuxe;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public double getDungtich() {
        return dungtich;
    }

    public void setDungtich(double dungtich) {
        this.dungtich = dungtich;
    }

    public double getTrigia() {
        return trigia;
    }

    public void setTrigia(double trigia) {
         this.trigia = trigia;
    }

    
   
 @Override
    public String toString(){
        return  String.format("%s          %s         %.2f        %.2f         %.2f", tenchuxe,loaixe,dungtich,trigia,thuephainop(trigia));
//                tenchuxe +"\t    "+loaixe    +"\t    "+dungtich     +"\t   "+ trigia  +"\t          "+thuephainop(trigia);
    }
    public double thuephainop(double s){
      
    if(this.dungtich<100){   
         s =this.trigia *0.01;
     }
    else if(this.dungtich<=200){ 
        s =this.trigia*0.03;
     } 
    else if(this.dungtich>200){
       s = this.trigia*0.05;
     }
    return s;
     
   
}
}