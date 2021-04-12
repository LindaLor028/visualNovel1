package src;

import java.util.Scanner;
import java.awt.Canvas;
import javax.swing.JFrame;


import java.awt.Color;

public class Test 
{
    public static void main(String[] args) {
        // System.out.println("PLEASE TYPE yes");
        // Scanner scans = new Scanner(System.in);
        // String nexttext = scans.next();
        // if (nexttext.equals("yes")) {
        //     System.out.println("WORKING");
        // }
        // else{
        //     System.out.println("WRONG INPUT");
        // }

        JFrame window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.pink);
        window.setLayout(null);
        window.setVisible(true);
    }

}