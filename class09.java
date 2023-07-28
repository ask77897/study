package project02;

import java.util.Scanner;

public class class09 {

	public static void main(String[] args) {
		String[] str = new String[5];
		
		Scanner scan = new Scanner(System.in);
//		for(int i=0; i<5; i++) {
//			str[i]=scan.next();
//		}
//		
//		for(int i=0; i<5; i++) {
//			System.out.println(str[i]);
//		}
//
//		
		
		//String 배열 5개 짜리 -> 사용자 입력 받은 값이 배열에 들어있는지 없는지 찾아보는 프로그램.
		
		String[] str1={"가", "나", "다", "라", "마"};
		String word;
		word=scan.next();
		for(int j=0;j<5;j++) {
			if(word.equals(str1[j])) {
				System.out.print("있습니다.");
				break;
			}
			if (j==4){
				System.out.println("없습니다.");
			}
			
		}
			
		
		
		
		
		
		
		
		
		
	}

}
