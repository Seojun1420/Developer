import java.util.ArrayList;

public class IdolMain {
	public static void main (String[] args) {
		ArrayList<Idol> list = new ArrayList<Idol>();
		Idol idol1 = new Idol();
		idol1.setName("쯔위");
		idol1.setAge(18);
		idol1.setGender("여");
		idol1.setTeam("트와이스");
		list.add(idol1);
		
		Idol idol2 = new Idol();
		idol2.setName("정연");
		idol2.setAge(23);
		idol2.setGender("여");
		idol2.setTeam("트와이스");
		list.add(idol2);
		
		Idol idol3 = new Idol();
		idol3.setName("모모");
		idol3.setAge(23);
		idol3.setGender("여");
		idol3.setTeam("트와이스");
		list.add(idol3);
		
		Idol idol4 = new Idol();
		idol4.setName("나연");
		idol4.setAge(24);
		idol4.setGender("여");
		idol4.setTeam("트와이스");
		list.add(idol4);
		
		Idol idol5 = new Idol();
		idol5.setName("사나");
		idol5.setAge(23);
		idol5.setGender("여");
		idol5.setTeam("트와이스");
		list.add(idol5);
		
		Idol idol6 = new Idol();
		idol6.setName("지효");
		idol6.setAge(22);
		idol6.setGender("여");
		idol6.setTeam("트와이스");
		list.add(idol6);
		
		Idol idol7 = new Idol();
		idol7.setName("미나");
		idol7.setAge(22);
		idol7.setGender("여");
		idol7.setTeam("트와이스");
		list.add(idol7);
		
		Idol idol8 = new Idol();
		idol8.setName("다현");
		idol8.setAge(21);
		idol8.setGender("여");
		idol8.setTeam("트와이스");
		list.add(idol8);
		
		Idol idol9 = new Idol();
		idol9.setName("채영");
		idol9.setAge(20);
		idol9.setGender("여");
		idol9.setTeam("트와이스");
		list.add(idol9);
		
		Idol idol10 = new Idol();
		idol10.setName("G-DRAGON");
		idol10.setAge(31);
		idol10.setGender("남");
		idol10.setTeam("빅뱅");
		list.add(idol10);
		
		Idol idol11 = new Idol();
		idol11.setName("태양");
		idol11.setAge(31);
		idol11.setGender("남");
		idol11.setTeam("빅뱅");
		list.add(idol11);
		
		Idol idol12 = new Idol();
		idol12.setName("T.O.P");
		idol12.setAge(33);
		idol12.setGender("남");
		idol12.setTeam("빅뱅");
		list.add(idol12);
		
		Idol idol13 = new Idol();
		idol13.setName("대성");
		idol13.setAge(30);
		idol13.setGender("남");
		idol13.setTeam("빅뱅");
		list.add(idol13);
		
		Idol idol14 = new Idol();
		idol14.setName("RM");
		idol14.setAge(24);
		idol14.setGender("남");
		idol14.setTeam("방탄소년단");
		list.add(idol14);
		
		Idol idol15 = new Idol();
		idol15.setName("슈가");
		idol15.setAge(25);
		idol15.setGender("남");
		idol15.setTeam("방탄소년단");
		list.add(idol15);
		
		Idol idol16 = new Idol();
		idol16.setName("진");
		idol16.setAge(26);
		idol16.setGender("남");
		idol16.setTeam("방탄소년단");
		list.add(idol16);
		
		Idol idol17 = new Idol();
		idol17.setName("제이홉");
		idol17.setAge(30);
		idol17.setGender("남");
		idol17.setTeam("방탄소년단");
		list.add(idol17);
		
		Idol idol18 = new Idol();
		idol18.setName("지민");
		idol18.setAge(24);
		idol18.setGender("남");
		idol18.setTeam("방탄소년단");
		list.add(idol18);
		
		Idol idol19 = new Idol();
		idol19.setName("뷔");
		idol19.setAge(24);
		idol19.setGender("남");
		idol19.setTeam("방탄소년단");
		list.add(idol19);
		
		Idol idol20 = new Idol();
		idol20.setName("정국");
		idol20.setAge(22);
		idol20.setGender("남");
		idol20.setTeam("방탄소년단");
		list.add(idol20);
		//1. 전체 목록
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName()+",");
			System.out.println(list.get(i).getAge()+",");
			System.out.println(list.get(i).getGender()+",");
			System.out.println(list.get(i).getTeam()+",");
			System.out.println();
		}
		//2. 이름전체으로 검색
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("쯔위")) {
				System.out.println(list.get(i).getName()+",");
				System.out.println(list.get(i).getAge()+",");
				System.out.println(list.get(i).getGender()+",");
				System.out.println(list.get(i).getTeam()+",");
				System.out.println();
			}
		}
		//3. 이름(성)으로 검색
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().startsWith("쯔")) {
				System.out.println(list.get(i).getName()+",");
				System.out.println(list.get(i).getAge()+",");
				System.out.println(list.get(i).getGender()+",");
				System.out.println(list.get(i).getTeam()+",");
				System.out.println();
			}
		}
			//4. 나이(성인)로 검색
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getAge() >19) {
					System.out.println(list.get(i).getName()+",");
					System.out.println(list.get(i).getAge()+",");
					System.out.println(list.get(i).getGender()+",");
					System.out.println(list.get(i).getTeam()+",");
					System.out.println();
			}
		}
			//4. 나이 20대로 검색
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getAge() / 10 == 2) {
					System.out.println(list.get(i).getName()+",");
					System.out.println(list.get(i).getAge()+",");
					System.out.println(list.get(i).getGender()+",");
					System.out.println(list.get(i).getTeam()+",");
					System.out.println();
				}
			}
			//5. 나이가 10대 나 20대(||)
			System.out.println("------5.  나이가 10대 나 20대   ----- ");
			/*for(Idol idol : list ) {
				if((idol.getAge()/10 == 1) || (idol.getAge()/10 == 2)) {
					System.out.println(idol.getName()+",");
					System.out.println(idol.getAge()+",");
					System.out.println(idol.getGender()+",");
					System.out.println(idol.getTeam()); //
					System.out.println();
				}
			}*/
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getAge() / 10 == 20 ) {
					System.out.println(list.get(i).getName()+",");
					System.out.println(list.get(i).getAge()+",");
					System.out.println(list.get(i).getGender()+",");
					System.out.println(list.get(i).getTeam()+",");
					System.out.println();
				}
			}
			//6. 나이고 15 < 26 (&&)
			/*System.out.println("------6. 나이가 15 < 26 ------");
			for(Idol idol : list) {
				if((idol.getAge()>15 && idol.getAge()<26)){
					System.out.println(idol.getName()+",");
					System.out.println(idol.getAge()+",");
					System.out.println(idol.getGender()+",");
					System.out.println(idol.getTeam()); 
					System.out.println();
				}
			}*/
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getAge()>15 && list.get(i).getAge()< 26) {
					System.out.println(list.get(i).getName()+",");
					System.out.println(list.get(i).getAge()+",");
					System.out.println(list.get(i).getGender()+",");
					System.out.println(list.get(i).getTeam()+",");
					System.out.println();
				}
			}
			//7. 성별이  "여"
			System.out.println("------7.  성별이 여자 ?  ----- ");
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getGender().equals("여")) {
					System.out.println(list.get(i).getName()+",");
					System.out.println(list.get(i).getAge()+",");
					System.out.println(list.get(i).getGender()+",");
					System.out.println(list.get(i).getTeam()+",");
					System.out.println();
				}
			}
			//8. 팀이 "?"인 .....
			System.out.println("------8.  팀이름이  ? ----- ");
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTeam().equals("트와이스")) {
					System.out.println(list.get(i).getName()+",");
					System.out.println(list.get(i).getAge()+",");
					System.out.println(list.get(i).getGender()+",");
					System.out.println(list.get(i).getTeam()+",");
					System.out.println();
				}
			}
			//9. 여자 몇명? 남자 몇명?
			/*System.out.println("------9. 여자가 몇명이고,  남자가 몇명인가? ----- ");
			int genderCount =  0;
				for(Idol idol : list) {
					if(idol.getGender().equals("여")) {
						genderCount++;
					}
				}*/
			int count  = 0;
			int count2 = 0;
			for(int i=0; i<list.size(); i++ ) {
				if(list.get(i).getGender() == "여") {
					count++;
				}
				count2++;
			}
			System.out.println(count+ ","+(count2-count));
			//10. 방탄소년단 입력 / 방탄소년단의 인원을 출력?
			System.out.println("------ 10. 방탄소년단 입력 / 방탄소년단의 인원 -------");
			int count1 = 0;
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTeam().equals("방탄소년단")) {
					count1++;
				}
				System.out.println("방탄은 "+count1+"명입니다.!!");
			}
			//11. 팀인원이 5명이상인 팀명을 출력하세요.
			System.out.println("------ 11. 팀인원이 5명이상인 팀명을 출력하세요! ");
			int teamcount = 0;
			int teamcount1 = 0;
			int teamcount2 = 0;
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTeam().equals("트와이스")){
					teamcount++;
				}else if(list.get(i).getTeam().equals("빅뱅")) {
					teamcount1++;
				}else if(list.get(i).getTeam().equals("방탄소년단")) {
					teamcount2++;
				}
				System.out.println(teamcount);
				System.out.println(teamcount1);
				System.out.println(teamcount2);
				teamcount=0;
				teamcount1=0;
				teamcount2=0;
				
			}
	}
			
}

		
			
	



				
				

		
		
		

