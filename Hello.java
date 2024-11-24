/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nickd
 */
public class Hello {
    
    public static void main(String[] args){
    System.out.println("Hello Tim");
    
    boolean isAlien =false;
    if (isAlien==false){
    System.out.println("It is not an Alien");
    System.out.println("And i am scared of Aliens");
    }
    int topScore=80;
    if(topScore<100){
        System.out.println("You got the high score!");
    }
    int secondtopscore=95;
    if (topScore>secondtopscore && topScore<100){
        System.out.println("Greater than second top score and less than 100");
    }
    if ((topScore>90) || (secondtopscore<=90)){
        System.out.println("Either or both of the conditions are true");
    }
    }
}
