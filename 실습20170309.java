package JAVA_�ǽ�����;

import java.util.Scanner;

public class �ǽ�20170309 {
	void run() {
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���.");

		int number = s.nextInt();
		s.close();

		if(number==1){
			System.out.print("ParkShinHyun");
		}else{
			System.out.print("defalut");
		}
		
		}
	public static void main(String[] args){
		�ǽ�20170309 t = new �ǽ�20170309();
	t.run();
	}
}
