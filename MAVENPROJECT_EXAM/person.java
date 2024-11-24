/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.myproject.mavenproject1;

/**
 *
 * @author nickd
 */
public class person {
    //είναι πεδία δηλώσεων μεταβλήτων
    private String name; 
    private String surname;
    private int age;
    
   //κατασκευαστής 

    public person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    //μετατρέπω το αντικείμενο σε string

    @Override
    public String toString() {
        return "person{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }
    
    
}
