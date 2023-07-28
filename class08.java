package project02;

import java.util.Scanner;

public class class08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scr;
		int[] arr = new int[5];
		for(int i =0; i<5; i++) {
			arr[i]=0;
		}
		int max=0;
		int min=100;
		
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
				arr[0]++;
			}else if(scr>=80) {
				arr[1]++;
			}else if(scr>=70) {
				arr[2]++;
			}else if(scr>=60) {
				arr[3]++;
			}else {
				arr[4]++;
			}
			
		}
		System.out.println("A:" + arr[0] + ", B:" + arr[1] + ", C:"+ arr[2] +", D:"+arr[3] + ", F:"+arr[4]);
		System.out.println("최하점은 "+min+"점입니다");
		System.out.println("최고점은 "+max+"점입니다");
		
	}

}
