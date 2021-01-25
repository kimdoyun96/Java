package array;

// 2차원 배열
public class ArrayEx6 {

	public static void main(String[] args) throws InterruptedException {
		int[][] num = new int[][] {{10, 40, 70, 100},
								   {20, 50, 80, 110}, 
								   {30, 60, 90, 120}};
								   
		for (int i = 0; i < num.length; i++) { // 행 순회
			for (int j = 0; j < num[i].length; j++) {
				Thread.sleep(100);
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
