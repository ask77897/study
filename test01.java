package project01;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		//1.자판기 만들기
		//	금액을 넣어주세요.: (입력)
		//	메뉴를 선택하세요.: (메뉴1 -> 가격), (메뉴2 -> 가격) ... (입력)
		//	잔액이 부족합니다. or (메뉴)가 나왔습니다. 거스름돈 ??원이 나왔습니다.
//		Scanner scan = new Scanner(System.in);
//		int a;
//		int b = 7000;
//		int c = 8000;
//		int d = 10000;
//		String menu1 = "메뉴1";
//		String menu2 = "메뉴2";
//		String menu3 = "메뉴3";
//		int menu;
//		
//		System.out.print("금액을 넣어주세요.:");
//		a = scan.nextInt();
//		if(!(a<b)) {
//			System.out.println("메뉴를 선택하세요.:"+"메뉴1 ->"+b+"원, "+"메뉴2 ->"+c+"원, "+"메뉴3 ->"+d+"원");
//			menu = scan.nextInt();
//			if(menu == 1) {
//				if (a > b) {
//					System.out.println(menu1+"가 나왔습니다."+"거스름돈"+(a-b)+"원이 나왔습니다.");
//				}else if(a == b) {
//					System.out.println(menu1+"가 나왔습니다.");
//				}else {
//					System.out.println("잔액이 부족합니다.");
//				}
//			}else if(menu == 2) {
//				if (a > c) {
//					System.out.println(menu2+"가 나왔습니다."+"거스름돈"+(a-c)+"원이 나왔습니다.");
//				}else if(a == c) {
//					System.out.println(menu2+"가 나왔습니다.");
//				}else {
//					System.out.println("잔액이 부족합니다.");
//				}
//			}else if(menu == 3) {
//				if (a > d) {
//					System.out.println(menu3+"가 나왔습니다."+"거스름돈"+(a-d)+"원이 나왔습니다.");
//				}else if(a == d) {
//					System.out.println(menu3+"가 나왔습니다.");
//				}else {
//					System.out.println("잔액이 부족합니다.");
//				}
//			}
//		}else {
//			System.out.println("잔액이 부족합니다.");
//		}
		
		
		//2.점수 하나 입력 -> 학점을 A,B,C,D,F (90 80 70 60 50)
//		Scanner score = new Scanner(System.in);
//		int x;
//		System.out.print("점수를 입력하세요.:");
//		x = score.nextInt();
//		if(x>=90) {
//			System.out.println("A학점 입니다.");
//		}else if(x>=80) {
//			System.out.println("B학점 입니다.");
//		}else if(x>=70) {
//			System.out.println("C학점 입니다.");
//		}else if(x>=60) {
//			System.out.println("D학점 입니다.");
//		}else {
//			System.out.println("F학점 입니다.");
//		}
//		
		//3.점수 5개를 입력받는다. 최고점을 출력.
//		Scanner score = new Scanner(System.in);
//		int a,b,c,d,e;
//		System.out.print("점수를 입력하세요.:");
//		a = score.nextInt();
//		b = score.nextInt();
//		c = score.nextInt();
//		d = score.nextInt();
//		e = score.nextInt();
//		
//		if(a > b && a > c && a > d && a > d && a > e) {
//			System.out.println("최고점은 "+a+"입니다.");
//		}else if(b > c && b > d && b > e) {
//			System.out.println("최고점은 "+b+"입니다.");
//		}else if(c > d && c > e) {
//			System.out.println("최고점은 "+c+"입니다.");
//		}else if(d > e) {
//			System.out.println("최고점은 "+d+"입니다.");
//		}else {
//			System.out.println("최고점은 "+e+"입니다.");
//		}
//		
		
		//4. int a = 10,int b = 20, int c = 30 if문을 가지고 -> C가 가장 크다. 라고 출력하기
		//(단, 3가지 방법)
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		
//		if (a<c && a<b) {
//			if(b<c) {
//				System.out.println("c가 가장 크다.");
//			}
//		}
//		
//		if(a+b == c) {
//			System.out.println("c가 가장 크다.");
//		}
//		
//		if(a-b>0 && a-c>0) {
//			System.out.println("c가 가장 크.");
//		}else if(b-a>0 && b-c>0) {
//			System.out.println("c가 가장 다.");
//		}else if(c-a>0 && c-b>0) {
//			System.out.println("c가 가장 크다.");
//		}
						
	}

}
