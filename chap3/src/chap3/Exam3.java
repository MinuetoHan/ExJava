package chap3;
/*
 * 화면에서 3자리 정수를 입력받아 100 자리 미만 버리고 출력하기
 *
 * 1. Scanner 객체 생성
 * 2. num = scan.nextInt()
 * 3. 100으로 나누고, 100 곱하기
 * 
 * [결과]
 * 세자리 정수를 입력하세요
 * 321
 * 300
 * 
 * [결과]
 * 세자리 정수를 입력하세요
 * 599
 * 500
 */

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("세자리 정수를 입력하세요:");
		int num = scan.nextInt();	
		System.out.println(num/100*100);
		System.out.println(num-num%100);

	}

}
