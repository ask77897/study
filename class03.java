package project01;

import java.util.Scanner;

public class class03 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
//		 int a; // 변수 선언
//		 double d = 123.123; // 변수 선언과 초기화
		 // a = 12; // 변수 초기화
		 // a = a + 100; // 초기화 이전에 쓰레기 값이 들어가있다.
		 
//		 a = scan.nextInt();
//		 System.out.println("a:"+a);
//		 
//		 d = scan.nextDouble();
//		 System.out.println("d:"+d);
//		 
//		 String str;
//		 str = scan.next();
//		 System.out.println("str:"+str);
//		 
//		 scan.nextLine();
//		 str = scan.nextLine();
//		 System.out.println("str:"+str);

		//실습01
		//실수 두개를 입력받고, 2개의 합을 출력.
		 double x;
		 double y;
		 
		 x = scan.nextDouble(); 
		 y = scan.nextDouble();
		 System.out.println("x:"+x+", "+"y:"+y+", "+"sum:"+(x+y));
		 	 		 
		//실습02 
		//철수, 영희가 엄마가 둘 다 시험에서 100점을 맞으면 -> 사용자 2개의 값을 입력 받고
		 int score_1;
		 int score_2;
		 
		 score_1 = scan.nextInt();
		 score_2 = scan.nextInt();
		 System.out.print("철수:"+score_1+"점"+", "+"영희:"+score_2+"점"+", "+"성공:"+(score_1>=100 && score_2>=100));
		 
		 
		 
		 
	}

}




// 출력 - System.out
// 입력 - System.in


