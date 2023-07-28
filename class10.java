package project02;

public class class10 {

	public static void main(String[] args) {
//		int[][] student = new int[6][4];
//		
//		for(int i = 0; i<6; i++) {
//			for(int j = 0; j<4;j++) {
//				student[i][j] = 20; 
//				
//			}
//		}
//		for(int i=0; i<6; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print(student[i][j]+" ");
//			}
//			System.out.println();
//		}
		//10x10배열 1~100다 넣어주고 사각형으로 출력.
		int[][] num =new int[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				num[i][j]=i*10+j+1;
				
			}
			
		}
		
		
//		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
//		

	}

}


//1차원 배열

//다차원 배열
//자료형[][] 배열명 = new 자료형[크기][크기];
//

