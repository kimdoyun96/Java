package array;

//가변 배열 : 행 또는 열이 가변적인 배열 
public class ArrayEx7 {

	public static void main(String[] args) {
		int[][] num = new int[3][4];
		num[0] = new int[] { 10, 20 };
		num[1] = new int[] { 30, 40, 50, 60 };
		num[2] = new int[] { 70, 80, 90 };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
