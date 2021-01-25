package array;
//최대값 최소값

public class ArrayEx4_MAX_MIN {

	public static void main(String[] args) {
		int[] num = new int[8];

		num[0] = Integer.parseInt(args[0]);
		num[1] = Integer.parseInt(args[1]);
		num[2] = Integer.parseInt(args[2]);
		num[3] = Integer.parseInt(args[3]);
		num[4] = Integer.parseInt(args[4]);
		num[5] = Integer.parseInt(args[5]);
		num[6] = Integer.parseInt(args[6]);
		num[7] = Integer.parseInt(args[7]);

		// 최대값 최소값
		int max = num[0];
		int min = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) max = num[i];
			if (num[i] < min) min = num[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
