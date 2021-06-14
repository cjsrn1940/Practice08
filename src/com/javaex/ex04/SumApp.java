package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		try {
			String[] numArray = numLine.split(" ");
			int num[] = new int[numArray.length]; 
			
			for(int i=0; i<numArray.length; i++) {
				num[i] = Integer.parseInt(numArray[i]);
				sum += num[i];
			}
			
		} catch (NumberFormatException e) {
			System.out.println("숫자, 공백이 아닌 값이 포함되어 있습니다.");
		}
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
