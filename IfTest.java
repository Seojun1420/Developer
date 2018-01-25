import java.util.Scanner; //Scanner라고 적으도 자바.유틸.스캐너로 인식한다.
public class IfTest {

	public static void main(String[] args) {
		String sn = null;
		Scanner s = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요:");
		sn = s.nextLine();
		String str = sn.substring(6,7);//1~8
		int x = Integer.parseInt(str);
		if(x%2 == 0) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}

	}

}
