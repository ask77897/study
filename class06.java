package project02;

import java.util.Scanner;

public class class06 {

	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//			if(i==5) {
//				break;
//			}
//		}
//		
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<10; j++) {
//				System.out.println("i:"+i+", j:"+j);
//				if(j==5) {
//					break;
//				}
//			}
//		}
//		
//		for(int i=0; i<=100; i++) {
//			if(i%2 == 1) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
//		for(int i = 10; i >= 0; i--) {
//			if(i==0) {
//				System.out.println("발사!!");
//				continue;
//			}
//			System.out.println(i);
//		}
		//구구단 -> scanner 1을 입력하면 홀수단, 2를 입력하면 짝수단
		Scanner sc = new Scanner(System.in);
		
//		int i;
//		i = sc.nextInt();
		
//		if(i%2 == 0) {
//			for(; i<10; i+=2) {
//				for(int j=1; j<10; j++) {
//					System.out.println(i+" X "+ j + " = "+ i*j);
//				}
//			}
//		}
//		else if(i%2 == 1) {
//			for(; i<10; i+=2) {
//				for(int j=1; j<10; j++) {
//					System.out.println(i+" X "+ j + " = "+ i*j);
//				}
//			}
//		}
//		int k;
//		k = sc.nextInt();
//		if(k==1) {
//			for(int i=2; i<10; i++) {
//				for(int j=1; j<10; j++) {
//					System.out.println(i+","+ j);
//					System.out.println(i+" X "+ j + " = "+ i*j);
//				}
//			}
//		}
		
//				if(k==2) {
//					System.out.println(i+","+ j);
//					System.out.println(i+" X "+ j + " = "+ i*j);
//				}
//			System.out.println(i+" X "+ j + " = "+ i*j);
//			}
//		}
		
//		int input = sc.nextInt();
//		
//		if (input==2) {
//			
//			for(int i = 2 ; i<10; i+=2) {
//				System.out.println(i+"단");
//				for(int j = 1; j<10; j++) {
//					System.out.println(i+" X "+ j + " = "+ i*j);
//					
//				}
//			}
//		}else if(input==1) {
//			for(int i = 3 ; i<10; i+=2) {
//				System.out.println(i+"단");
//				for(int j = 1; j<10; j++) {
//					System.out.println(i+" X "+ j + " = "+ i*j);
//					
//				}
//			}
//			
//		}
		
//		for(int i = 2 ; i<10; i++) {
//			if((input==1&&i%2==1) ||(input==2&&i%2==0)) {
//				System.out.println(i+"단");
//				for(int j = 1; j<10; j++) {
//					System.out.println(i+" X "+ j + " = "+ i*j);
//					
//				}
//			}
//			
//		}
		
//		if(input==1) {
//			input+=2;
//		}
//		for(int i = input ; i<10; i+=2) {
//			System.out.println(i+"단");
//			for(int j = 1; j<10; j++) {
//				System.out.println(i+" X "+ j + " = "+ i*j);
//				
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//5개 입력 최고점,점수 학점
		//숫자를 n개 입력받아서 A, B, C, D, F 가 몇 명인지, 최고점, 최하점, 평균
		int scr;
		int max=0;
		int min=100;
		int A=0, B=0, C=0, D=0, E=0;

		for(int n=1;n<=5;n++ ) {
			System.out.print("점수를 입력하세요.:");
			scr = sc.nextInt();
			if(max<scr) {
				max=scr;
			}
			if(min>scr) {
				min=scr;
			}
			
			if(scr>=90) {
				A++;
			}else if(scr>=80) {
				B++;
			}else if(scr>=70) {
				C++;
			}else if(scr>=60) {
				D++;
			}else {
				E++;
			}
			
		}
		System.out.println("A:" + A + ", B:" + B + ", C:"+ C +", D:"+D + ", F:"+E);
		System.out.println("최하점은 "+min+"점입니다");
		System.out.println("최고점은 "+max+"점입니다");
		

		
		
		
	}
		
}






//break, continue
//switch -> break를 쓰면 switch문을 빠져나왔다.
//break -> for문, while문, switch문을 빠져나올수있게해줌.

//continue
//for문, while문 -> 건너뛸수 있게 -> 내 아래 코드 실행하지말고 계속해줘

//10
//9
//8
//7
//6
//,,,
//발사!!


