package project01;

import java.util.Scanner;

public class class01 {
	public static void main(String[] args) { //프론트엔드
		Scanner scan = new Scanner(System.in);
		int num = 123;
		double f = 123.1548;
		char c = 'a';
		String str;
		String str1 = "\"hello\"";
		boolean b = true;
		
//		System.out.print(num + "\n");
//		System.out.print(f + "\n");
//		System.out.print(c + "\n");
//		System.out.print(str + "\n");
//		System.out.print(b + "\n");
//		System.out.print("\n");
//		System.out.println();
		str = scan.next();
		if (str == str1) {
			System.out.println(str);
		}else {
			System.out.println("..");
		}

	}

}

// 컴퓨터는 바보다.
// 1, 0 -> 하지만 연산속도가 엄청 빠르다. 
// 컴퓨팅 사고 -> 컴퓨터처럼 
// 논리적 사고 -> 컴퓨팅, 수학
// 아스키 코드(ASKII CODE) -> a : 97 ->, A...Z -> 76 ~ 

// 기계어 <- 어셈블리어 <- 고급언어(C, JAVA) <- 언어
// 컴파일러(통역사) -> 컴파일

// 변수 (변하는 수)
// 정수 - 양의 정수, 0, 음의 정수 - -123, 456, ...
// int(4 byte), long(8 byte), short(2 byte), byte, ...
// short int, long int, long long int, long long long int
// 실수 - 유리수, 무리수 - 123.0215, -1234.56132
// double(8 byte), float(4 byte), ...
// short double, long double, long long double, ...
// 문자 - 'a', 'b', 'c', ... (1byte)
// char
// \n(줄바꿈), \t(탭), \a, \v
// 문자열 - "Hello" 따옴표 차이
// String
// Boolean - True or False
// void - 비어있다. (null은 비슷하지만 변수는 아님)





















