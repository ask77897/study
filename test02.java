package project02;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		//왕거지게임
		//{"노예", "시민", "귀족", "왕"}
		//노예가 만약 왕을 만나면 왕을 죽이고 게임에 승리한다.
		Scanner sc = new Scanner(System.in);
		String[] card = {"노예", "시민", "귀족", "왕"};
		int x = sc.nextInt();
		// int y = sc.nextInt();
		int y = (int) Math.floor(Math.random()*4);
		System.out.println("Player은(는) "+card[x]+"입니다.");
		System.out.println("Computer은(는) "+card[y]+"입니다.");
		switch(x){
			case 0:
			if(y==3){
				System.out.println("Player의 승리");
				break;
			}
			else if(x==y){
				System.out.println("무승부");
				break;
			}
			else{
				System.out.println("Computer의 승리");
			}break;
			case 1:
			if(y==0){
				System.out.println("Player의 승리");
				break;
			}
			else if(x==y){
				System.out.println("무승부");
				break;
			}
			else{
				System.out.println("Computer의 승리");
			}break;
			case 2:
			if(y==0||y==1){
				System.out.println("Player의 승리");
				break;
			}
			else if(x==y){
				System.out.println("무승부");
				break;
			}
			else{
				System.out.println("Computer의 승리");
			}break;
			case 3:
			if(y==1||y==2){
				System.out.println("Player의 승리");
				break;
			}
			else if(x==y){
				System.out.println("무승부");
				break;
			}
			else{
				System.out.println("Computer의 승리");
			}break;
		}

		
		
		
		//"*", " ", "\n" ->반복문
		//*****
		//****
		//***
		//**
		//*
		
		// for(int a=0; a<4; a++){
		// 	if(a==0){
		// 		System.out.println("*****" +"\n"+ "****" +"\n"+ "***" +"\n"+ "**" +"\n"+ "*");
		// 	}
		// 	if(a==1){
		// 		System.out.println("*****" +"\n"+ " "+"****"+"\n"+"  "+"***"+"\n"+"   "+"**"+"\n"+"    "+"*");
		// 	}
		// 	if(a==2){
		// 		System.out.println("*"+"\n"+"**"+"\n"+"***"+"\n"+"****"+"\n"+"*****");
		// 	}
		// 	if(a==3){
		// 		System.out.println("    "+"*"+"\n"+"   "+"**"+"\n"+"  "+"***"+"\n"+" "+"****"+"\n"+"*****");
		// 	}
		// }



		//역방향 정방향 번갈아 가면서 5x5배열 만들기
		//세로로 1~25
		//반복문 두개 채워넣기 -> 출력

		// int[][] arr = new int[5][5];
		
		// for(int i=0; i<5; i++) {
		// 	for(int j=0;j<5;j++) {
		// 		arr[i][j]= i*5+j+1;
		// 	}
		// }
		// for(int i=0; i<5; i++) {
		// 	for(int j=0;j<5;j++) {
		// 		System.out.print(arr[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }
		// System.out.println("-----------------");
		// for(int i=0; i<5; i++) {
		// 	if(i%2!=0){
		// 		for(int j=0; j<5; j++) {
		// 			arr[i][j] = 5*i+(1+j);
		// 		}
		// 	}
		// 	if(i%2==0) {
		// 		for(int j=0; j<5; j++){
		// 			arr[i][j] = 5*(i+1)-j;
		// 		}
		// 	}
		// }
		// for(int i=0; i<5; i++) {
		// 	for(int j=0;j<5;j++) {
		// 		System.out.print(arr[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }
		// System.out.println("-----------------");
		// for(int i=0; i<5; i++) {
		// 	for(int j=0; j<5; j++) {
		// 		arr[j][i]=i*5+j+1;
		// 	}
		// }
		// for(int i=0; i<5; i++) {
		// 	for(int j=0;j<5;j++) {
		// 		System.out.print(arr[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }
		// System.out.println("-----------------");
		// for(int i=0; i<5; i++) {
		// 	if(i%2!=0){
		// 		for(int j=0; j<5; j++) {
		// 			arr[j][i] = 5*i+(1+j);
		// 		}
		// 	}
		// 	if(i%2==0) {
		// 		for(int j=0; j<5; j++){
		// 			arr[j][i] = 5*(i+1)-j;
		// 		}
		// 	}
		// }
		// for(int i=0; i<5; i++) {
		// 	for(int j=0;j<5;j++) {
		// 		System.out.print(arr[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }
		
		
		
		
		
		
		// for(int i=0; i<5; i++){
		// 	for(int j=0; j<5; j++){
		// 		system.out.print(배열이름[i][j]+" ")
		// 	}
		// 	system.out.println();
		// }

	}

}
