package project02;

public class test02 {

	public static void main(String[] args) {
		//왕거지게임
		//{"노예", "시민", "귀족", "왕"}
		//노예가 만약 왕을 만나면 왕을 죽이고 게임에 승리한다.
		
		
		
		
		//"*", " ", "\n" ->반복문
		//*****
		//****
		//***
		//**
		//*
		
		//역방향 정방향 번갈아 가면서 5x5배열 만들기
		//세로로 1~25
		//반복문 두개 채워넣기 -> 출력
		int[][] arr = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]= i*5+j+1;
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[][]
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[j][i]=i*5+j+1;
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[][]
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		//for(int i=0; i<5; i++){
//			for(int j=0; j<5; j++){
//				system.out.print(배열이름[i][j]+" ")
//			}
//			system.out.println();
		//}

	}

}
