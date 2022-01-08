package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        dollar = CConverter.toDoller(1000000);
        System.out.println("백만원은 " + dollar + "달러입니다.");
        
        won = CConverter.toKWR(100);
        System.out.println("백달러는 " + won + "입니다.");
        
    }

}