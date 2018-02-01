
public class Test2 {
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		int a = 1;
		int b = 2;
		test2.swap(a, b);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		int[] arrA = new int[1];
		arrA[0] = 1;
		int[] arrB = new int[1];
		arrB[0] = 2;
		test2.swap(arrA, arrB);
		System.out.println("arrA[0]:"+arrA[0]);
		System.out.println("arrB[0]:"+arrB[0]);
	
	}
	
		public void swap(int[] arrA, int[] arrB) { //오버로딩
			int[] temp = arrA[0];
			arrA[0] = arrB[0];
			arrB[0] = temp;
		}
		
		/*int x = 5; //main.x
		test2.fun(x); //5
		System.out.println(x); //5
		
		int[] arr = new int[1];
		arr[0] = 5;
		test2.refFun(arr); // 참조값
		System.out.println(arr[0]); //10
*/		
	}
	public void swap(int a, int b) { // a=1, b=2
		int temp = a;
		a = b;
		b = temp;
	}
	public void fun(int x) { //fun.x
		x = 10;
		
	}
	public void refFun(int[] arr) {
		arr[0] = 10;
	}
}
