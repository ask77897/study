package project01;

import java.util.Scanner;

public class class04 {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
//		if (a == 5 && b == 5){
//			System.out.println("a는 5다. b도 5다.");
//		}
//		else {
//			System.out.println("a는 5가 아니다.");
//		}
//		if (a == 5) {
//			System.out.print("a는 5다.");
//			if(b == 5) {
//				System.out.println("b도 5다.");
//			}
//			else {
//				System.out.println("b는 5가 아니다.");
//			}
//		} else if(a == 6) {
//			System.out.print("a는 6이다.");
//			if(b == 6) {
//				System.out.println("b도 6이다.");
//			}
//			else {
//				System.out.println("b는 6이 아니다.");
//			}
//		}
//		
//		//숫자 홀수인지 짝수인지, 양수인지 음수인지, 
		Scanner scan = new Scanner(System.in);
//		a = scan.nextInt();
//		if(a > 0) {
//			System.out.print("a는 양수입니다.");
//			if(a%2 == 0) {
//				System.out.println("그리고 짝수입니다.");
//			}else {
//				System.out.println("그리고 홀수입니다.");
//			}
//		}else if(a < 0) {
//			System.out.print("a는 음수입니다.");
//			if(a%2 == 0) {
//				System.out.println("그리고 짝수입니다.");
//			}else {
//				System.out.println("그리고 홀수입니다.");
//			}
//		}else {
//			System.out.println("a는 0이다.");
//		}

		
		a = scan.nextInt();
		
		switch(a) {
			case 1:
				System.out.println("a는 1입니다.");
				break;
			case 2:
				System.out.println("a는 2입니다.");
				break;
			case 3:
				System.out.println("a는 3입니다.");
				break;
			default:
				System.out.println("a는 1,2,3이 아닙니다.");
		}
		if (a == 1) {
			System.out.println("a는 1입니다.");
		}else if (a == 2) {
			System.out.println("a는 2입니다.");
		}else if (a == 3) {
			System.out.println("a는 3입니다.");
		}else {
			System.out.println("a는 1,2,3이 아닙니다.");
		}
	
		String str = (a%2 == 0) ? "짝수" : "홀수";
		System.out.println(str);
		
		
		
		
	}

}


// 조건문
//  if-else -> if문 
//  if(조건식){
//    코드 -> 조건식이 참일때, 실행된다.
//}
//  else {
//   코드 -> 이전에 있던 조건식이 거짓일때, 실행된다.
//}
//if(조건1){
//   조건1이 참일때, 실행
//}
//else if(조건2){
//        조건1이 거짓, 조건2가 참일때, 실행
//}
//else if(조건3){
//        조건1,2가 거짓, 조건3이 참일때, 실행
//}
//else if(조건4){
//        조건1,2,3이 거짓, 조건4가 참일때, 실행
//else{
//    조건1,2,3,4가 전부 거짓일때, 실행
//}

//switch(변수){
//	case 1 : 코드
//	case 2 : 코드
//	case 3 : 코드
//	case 4 : 코드
//	default : 코드
//}

// 삼항연산자
// 변수 = (조건) ? 값1 : 값2;
// 



