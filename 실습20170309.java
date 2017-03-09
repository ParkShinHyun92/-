package JAVA_실습수업;

import java.util.Scanner;

public class 실습20170309 {
	void run() {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");

		int number = s.nextInt();
		s.close();

		if(number==1){
			System.out.print("ParkShinHyun");
		}else{
			System.out.print("You must type number 1");
		}
		
		}
	public static void main(String[] args){
		실습20170309 t = new 실습20170309();
	t.run();
	}
}
