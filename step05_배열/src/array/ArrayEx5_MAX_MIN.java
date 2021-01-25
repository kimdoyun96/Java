package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 크기가 5개인 정수형 배열을 잡고 배열에 데이터를 
 * 입력 받아서 출력하고 최대값 최소값을 구하세요 
 * 
 * ar[0]의 값을 입력 : 25
 * ar[1]의 값을 입력 : -25
 * ar[2]의 값을 입력 : 34
 * ar[3]의 값을 입력 : 2
 * ar[4]의 값을 입력 : 33
 * 
 * 25 -25 34 2 33
 * 
 * 최대값 : 
 * 최소값 : 
 */
public class ArrayEx5_MAX_MIN {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[5];

		// 입력
		for (int i = 0; i < num.length; i++) {
			System.out.print("ar[" + i + "]의 값을 입력 : ");
			try {
				num[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 계산 -- 최대값 최소값
		int max = num[0];
		int min = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > max)
				max = num[i];
			if (num[i] < min)
				min = num[i];
		}

		// 출력
		for (int data : num) {
			System.out.print(data + " ");
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
