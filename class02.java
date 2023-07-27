package project01;

public class class02 {

	public static void main(String[] args) {
		System.out.println(5+2);
		System.out.println(5-2);
		System.out.println(5*2);
		System.out.println(5/2);
		System.out.println(5.0/2);
		System.out.println(5%2);
		
		System.out.println(5<7); //true
		System.out.println(5>7); //false
		System.out.println(5>=2); //true
		System.out.println(5<=2); //false
		System.out.println(5==2); //false
		System.out.println(5!=2); //true
		
//		System.out.println(!(5 == 5)); 
		
		int a = 1;
		int b = 2;
		
		System.out.println(a > b);
		System.out.println(a * b);
		System.out.println(!(a == b));

		//b가 1보다 크고 10보다 작은가?
		
		//System.out.println(1 < b < 10);
		System.out.println(1 < b && b < 10);
		
		//a,b 둘 중 하나라도 음수인지?
		System.out.println(0>a || 0>b);
		
		int num_123 = 123;
		
		num_123 = num_123 + 100;
		num_123 += 100;
		System.out.println(num_123); //323
				
		System.out.println(num_123++); //323
		System.out.println(++num_123); //325
		System.out.println(num_123); //325
		System.out.println(--num_123); //324
		System.out.println(num_123--); //324
		System.out.println(num_123); //323
		
	}

}



//연산자
// 산술연산자 - +, -, *, /, % 
// 비교연산자 - <, >, <=, >=, ==, !=
// 부정연산자 - !
// 논리연산자 - &&(and), ||(or)
// 대입연산자 - a = b -> 우항의 '값'을 좌항에 대입한다.
//  자료형 변수명 = 값
//  식별자 - 클래스 123  숫자가 제일 앞에 올 수 없다. 특수문자 - 언더바(_) 사용
//  int, double, out, system, print, ... 사용불가
//  변수 -  보통 전부 소문자, 클래스, 함수 - 첫 글자만 대문자
//  snake - helloWorld 스네이크 표기법/ camel - Print, Print_Out 카멜 표기법
// 증강연산자 - 값을 증가시키고 감소시키고
//  +=, -=, *=, /=, %=
//  ++, --
//  전위증가, 전위감소 -> ++num, --num -> 코드를 실행하기 전에 증감
//  후위증가, 후위감소 -> num++, num-- -> 코드를 실행한 후에 증감
// 비트연산자 - &, |

//주석 -> 컴퓨터는 못 읽고 사람만 읽을 수 있다. 메모기능
// -> 오른쪽 전부
// /* */ 범위 안 주석 처리 ctrl + / 주석 단축키