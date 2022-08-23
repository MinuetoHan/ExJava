package chap3;
 /*
 * 초를 입력받아 몇시간몇분몇초인지 출력하기
 * 1. Scanner 생성
 * 2. second = scan.nextInt()
 * 3. h = second/3600
 * 4. m = (second%3600)/60
 * 5. s = second%60
 * 
 * 초를 입력하세요
 * 3662
 * 1시간1분2초
 */
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		// 1. Scanner 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("초를 입력하세요:");

		int second = scan.nextInt();		
		int	h = second/3600 ;
		int m = (second%3600)/60;
		int s = second%60;
		System.out.println(h+"시간 "+m+"분 "+s+"초");
		
	}

}
