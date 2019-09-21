package com.company;

        import java.awt.*;
        import java.awt.event.*;


public class Main{
    public static void main(String[] args){
        int a=1;

        System.out.printf(String.format("%3s","|"));
        for(int i=1;i<13;i++){
            System.out.printf(String.format("%6s",+i));
        }
        System.out.printf("\n");
        System.out.printf("--+----------------------------------------------------------------------------\n");


        for(int i=1;i<13;i++){
            System.out.printf(String.format("%3s",i+"|"));
            for(int j=1;j<13;j++){
                if(i<=j){
                    System.out.printf(String.format("%6s",i*j));

                }else {
                    System.out.printf(String.format("%6s",""));
                }
            }
            System.out.printf("\n");
        }


    }

    }
