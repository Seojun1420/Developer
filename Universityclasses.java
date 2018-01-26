import java.util.ArrayList;
import java.util.Scanner;
public class Universityclasses {
	private static String code;

	public static void main(String[] args) {
		
		ArrayList<UniversityclassesVO> a = new ArrayList<UniversityclassesVO>();
		
		UniversityclassesVO[] education = new UniversityclassesVO[2];
		education[0] = new UniversityclassesVO();
		education[1] = new UniversityclassesVO();
		
		education[0].setUniversityclassesVO("LM2002030602_13v1", "이동통신서비스", "이동통신서비스 설계하기", 141440, 18);
		education[1].setUniversityclassesVO("LM2002030605_13v1", "이동통신서비스", "이동통신서비스 운용하기", 141440, 24);
		
		a.add(education[0]);
		a.add(education[1]);
	
		
		for(int i=0; i<a.size(); i++) {
			UniversityclassesVO out= a.get(i);
			System.out.println(out.edu_NCSCode+","+ out.edu_Name);
			}
		/*private void (String getEdu_NCSCode, String edu_NCSName, String edu_Content, int edu_Time, int edu_Term) {
			
			
		}*/
		Scanner in = new Scanner(System.in);
		System.out.println("보고 싶은 NCS과목 코드는 요? ->>");
		code = in.next();
		
		for ( int i=0; i<a.size() ;i++) {
			UniversityclassesVO out = a.get(i);
			System.out.println(out.edu_NCSCode+ "," +out.edu_Name+ ","+out.edu_Content+ "," +out.edu_Term+ "," +out.edu_Time );
			
			
		}
	}

	
}
