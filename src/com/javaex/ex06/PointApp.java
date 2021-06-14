package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3); // x=2, y=3
		Point p2 = new Point(2, 3); // x=2, y=3
		Point p3 = new Point(5, 3); // x=5, y=3
		Point p4 = p1; // p4는 p1의 주소를 가리킴
		
		System.out.println(p1 == p2); // 다름, 주소가 다르기 때문
		System.out.println(p2 == p3); // 다름, 주소가 다르기 때문
		System.out.println(p3 == p4); // 다름, 주소가 다르기 때문
		System.out.println(p4 == p1); // 같음, p4가 p1을 가리키고 있기 때문
		System.out.println(p1.equals(p2)); // 다름, p1 p2에 들어있는 실질적인 값(가리키는 주소값)이 다르기 때문
		System.out.println(p4.equals(p1)); // 같음, p4 p1에 들어있는 실질적인 값(가리키는 주소값)이 같기 때문
	}
	//equals는 모든 클래스의 최상위 클래스인 오브젝트 클래스의 메소드이기 때문

}


