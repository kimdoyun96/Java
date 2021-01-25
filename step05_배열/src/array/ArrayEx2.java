package array;
// 1차원 배열
public class ArrayEx2 {

	public static void main(String[] args) {
		String[] car = {"쏘나타", "니로", "포르테", "모닝", "스파크"};
		car[3] = "스포티지";
		
		// 향상된 for문을 이용하여 출력
		for (String st : car)
			System.out.println(st);
	}

}
