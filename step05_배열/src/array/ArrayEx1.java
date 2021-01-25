package array;

public class ArrayEx1 {
	
	public static void main(String[] args) {
		int[] num = new int[5]; 	// 변수 선언
		
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		for (int i = num.length-1; i >= 0; i--)
			System.out.println(num[i]);
	}
}
