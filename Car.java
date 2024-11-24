/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mathima2;
/**
 *
 * @author nickd
 */
public class Car {
    
    
   //fields
    
    private String plateNumber;
    private int hp;
    private int speed;
    private  int passengers;
    
    //methods
    
    //constructor method
    
    public Car(String plateNumber,int hp,int passengers){
        
        
        this.plateNumber=plateNumber;
        this.hp=hp;
        this.passengers=passengers;
        speed=0;
    }
    
    
    
    public void  speedUp(){
            
    speed+=10;
    
    }
    
    public void  slowDown(){
        speed -=10;
      
        
    }
    
    public void addPassenger(){
        
        if(passengers<4)
            passengers++;
    }
    public void printStatus(){
        
        
        System.out.println("plateNumber"+plateNumber+"hp:"+hp+"speed:"+speed+"passengers:"+passengers);
    }
     
    
    
    
    
    
    
    
    
    
    
}
