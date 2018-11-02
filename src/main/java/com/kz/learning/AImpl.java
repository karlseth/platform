package com.kz.learning;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class AImpl extends JPanel {


    public void hello() {
        System.out.println("hello in AImpl method !!");
    }



    public void paint(Graphics g){
//        Graphics2D g2 = (Graphics)g;      //Graphics2D比Graphics更常用
//
//        g2.drawline(x1,y1,x2.y2);     //用g2画一条直线


        g.drawLine(1,2,3,5);

        retry :
        for (int i = 0; i < 100; i++) {
            continue retry;
        }
    }


    public static void main(String[] args) {
        int j=1;
        for (int i = 0; i < 16; i++) {
            j *=2;
        }
        System.out.println(j);
    }

}
