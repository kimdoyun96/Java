package array;
//$ java ArrayEx3 abcd 가나다 123 12345

public class ArrayEx3 {

	public static void main(String[] args) {
		System.out.println("args의 길이: " + args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]: " + args[i]);
			System.out.println("args[" + i + "]의 길이 : " + args[i].length() + "\n");
		}

		for (String x : args) {
			System.out.println(x);
			System.out.println(x.length() + "\n");
		}
	}
}
