package com.javaex.ex05;

import java.util.Scanner;


public class CalcApp {

    public static void main(String[] args) {
    	
    	boolean flag = true;
    	Scanner sc = new Scanner(System.in);
    	
    	while(flag) {
    		System.out.print(">> ");
    		String numLine = sc.nextLine();
    		
    		if(numLine.equals("/q")) {
    			System.out.println("종료합니다.");
    			flag = false;
    		} else {
    			String[] numArray = numLine.split(" ");
        		
        		int a = Integer.parseInt(numArray[0]);
        		int b = Integer.parseInt(numArray[2]);
        		
        		switch(numArray[1]) {
        		case "+" :
        			Add add = new Add();
        			add.setValue(a, b);
        			System.out.println(">> " + add.calculate());
        			break;
        			
        		case "-" :
        			Sub sub = new Sub();
        			sub.setValue(a, b);
        			System.out.println(">> " + sub.calculate());
        			break;
        			
        		case "/" :
        			Div div = new Div();
        			div.setValue(a, b);
        			System.out.println(">> " + div.calculate());
        			break;
        			
        		case "*" :
        			Mul mul = new Mul();
        			mul.setValue(a, b);
        			System.out.println(">> " + mul.calculate());
        			break;
        			
        		default :
        			System.out.println("알 수 없는 연산입니다.");
        			break;
        		}
    		}
    		
    	}
    	
		sc.close();

    }
}
