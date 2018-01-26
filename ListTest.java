import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		String[] arr = new String[2];
		arr[0] = "guest";
		arr[1] = "admin";
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		ArrayList<String> list = new ArrayList<String>();
		list.add("guest");
		list.add("admin");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		ArrayList<Integer> intList;
		int x = new Integer(1);
		Integer y = 10;
	}
}
