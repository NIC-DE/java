/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.circle_project_oss1.circle_project_oss1;

/**
 *
 * @author nickd
 */
public class Circle_project_oss1 {
    public static void main(String[] args) {
        System.out.println("Example running!");

        Circle a = new Circle();
        a.x = 2.0;
        a.y = 2.0;
        a.r = 3.0;

        Circle b = new Circle();
        b.x = 5.0;
        b.y = 2.0;
        b.r = 2.0;

        System.out.println("1os kiklos");
        System.out.println("Perimetros: " + a.circumference());
        System.out.println("Epifania: " + a.area() + "\n");

        System.out.println("2os kiklos");
        System.out.println("Perimetros: " + b.circumference());
        System.out.println("Epifania: " + b.area() + "\n");
    }
}

class Circle {
    public double x, y, r;

    public double circumference() {
        return 2 * 3.1416 * r;
    }

    public double area() {
        return 3.1416 * r * r;
    }
}
