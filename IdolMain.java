import java.util.ArrayList;

public class IdolMain {
	public static void main (String[] args) {
		ArrayList<Idol> list = new ArrayList<Idol>();
		Idol idol1 = new Idol();
		idol1.setName("����");
		idol1.setAge(18);
		idol1.setGender("��");
		idol1.setTeam("Ʈ���̽�");
		list.add(idol1);
		
		Idol idol2 = new Idol();
		idol2.setName("����");
		idol2.setAge(23);
		idol2.setGender("��");
		idol2.setTeam("Ʈ���̽�");
		list.add(idol2);
		
		Idol idol3 = new Idol();
		idol3.setName("���");
		idol3.setAge(23);
		idol3.setGender("��");
		idol3.setTeam("Ʈ���̽�");
		list.add(idol3);
		
		Idol idol4 = new Idol();
		idol4.setName("����");
		idol4.setAge(24);
		idol4.setGender("��");
		idol4.setTeam("Ʈ���̽�");
		list.add(idol4);
		
		Idol idol5 = new Idol();
		idol5.setName("�糪");
		idol5.setAge(23);
		idol5.setGender("��");
		idol5.setTeam("Ʈ���̽�");
		list.add(idol5);
		
		Idol idol6 = new Idol();
		idol6.setName("��ȿ");
		idol6.setAge(22);
		idol6.setGender("��");
		idol6.setTeam("Ʈ���̽�");
		list.add(idol6);
		
		Idol idol7 = new Idol();
		idol7.setName("�̳�");
		idol7.setAge(22);
		idol7.setGender("��");
		idol7.setTeam("Ʈ���̽�");
		list.add(idol7);
		
		Idol idol8 = new Idol();
		idol8.setName("����");
		idol8.setAge(21);
		idol8.setGender("��");
		idol8.setTeam("Ʈ���̽�");
		list.add(idol8);
		
		Idol idol9 = new Idol();
		idol9.setName("ä��");
		idol9.setAge(20);
		idol9.setGender("��");
		idol9.setTeam("Ʈ���̽�");
		list.add(idol9);
		
		Idol idol10 = new Idol();
		idol10.setName("G-DRAGON");
		idol10.setAge(31);
		idol10.setGender("��");
		idol10.setTeam("���");
		list.add(idol10);
		
		Idol idol11 = new Idol();
		idol11.setName("�¾�");
		idol11.setAge(31);
		idol11.setGender("��");
		idol11.setTeam("���");
		list.add(idol11);
		
		Idol idol12 = new Idol();
		idol12.setName("T.O.P");
		idol12.setAge(33);
		idol12.setGender("��");
		idol12.setTeam("���");
		list.add(idol12);
		
		Idol idol13 = new Idol();
		idol13.setName("�뼺");
		idol13.setAge(30);
		idol13.setGender("��");
		idol13.setTeam("���");
		list.add(idol13);
		
		Idol idol14 = new Idol();
		idol14.setName("RM");
		idol14.setAge(24);
		idol14.setGender("��");
		idol14.setTeam("��ź�ҳ��");
		list.add(idol14);
		
		Idol idol15 = new Idol();
		idol15.setName("����");
		idol15.setAge(25);
		idol15.setGender("��");
		idol15.setTeam("��ź�ҳ��");
		list.add(idol15);
		
		Idol idol16 = new Idol();
		idol16.setName("��");
		idol16.setAge(26);
		idol16.setGender("��");
		idol16.setTeam("��ź�ҳ��");
		list.add(idol16);
		
		Idol idol17 = new Idol();
		idol17.setName("����ȩ");
		idol17.setAge(30);
		idol17.setGender("��");
		idol17.setTeam("��ź�ҳ��");
		list.add(idol17);
		
		Idol idol18 = new Idol();
		idol18.setName("����");
		idol18.setAge(24);
		idol18.setGender("��");
		idol18.setTeam("��ź�ҳ��");
		list.add(idol18);
		
		Idol idol19 = new Idol();
		idol19.setName("��");
		idol19.setAge(24);
		idol19.setGender("��");
		idol19.setTeam("��ź�ҳ��");
		list.add(idol19);
		
		Idol idol20 = new Idol();
		idol20.setName("����");
		idol20.setAge(22);
		idol20.setGender("��");
		idol20.setTeam("��ź�ҳ��");
		list.add(idol20);
		//1. ��ü ���
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName()+",");
			System.out.println(list.get(i).getAge()+",");
			System.out.println(list.get(i).getGender()+",");
			System.out.println(list.get(i).getTeam()+",");
			System.out.println();
		}
		//2. �̸���ü���� �˻�
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("����")) {
				System.out.println(list.get(i).getName()+",");
				System.out.println(list.get(i).getAge()+",");
				System.out.println(list.get(i).getGender()+",");
				System.out.println(list.get(i).getTeam()+",");
				System.out.println();
			}
		}
		//3. �̸�(��)���� �˻�
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().startsWith("��")) {
				System.out.println(list.get(i).getName()+",");
				System.out.println(list.get(i).getAge()+",");
				System.out.println(list.get(i).getGender()+",");
				System.out.println(list.get(i).getTeam()+",");
				System.out.println();
			}
		}
			//4. ����(����)�� �˻�
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getAge() >19) {
					System.out.println(list.get(i).getName()+",");
					System.out.println(list.get(i).getAge()+",");
					System.out.println(list.get(i).getGender()+",");
					System.out.println(list.get(i).getTeam()+",");
					System.out.println();
			}
		}
			//4. ���� 20��� �˻�
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getAge() / 10 == 2) {
					System.out.println(list.get(i).getName()+",");
					System.out.println(list.get(i).getAge()+",");
					System.out.println(list.get(i).getGender()+",");
					System.out.println(list.get(i).getTeam()+",");
					System.out.println();
				}
			}
			//5. ���̰� 10�� �� 20��(||)
			System.out.println("------5.  ���̰� 10�� �� 20��   ----- ");
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
			//6. ���̰� 15 < 26 (&&)
			/*System.out.println("------6. ���̰� 15 < 26 ------");
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
			//7. ������  "��"
			System.out.println("------7.  ������ ���� ?  ----- ");
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getGender().equals("��")) {
					System.out.println(list.get(i).getName()+",");
					System.out.println(list.get(i).getAge()+",");
					System.out.println(list.get(i).getGender()+",");
					System.out.println(list.get(i).getTeam()+",");
					System.out.println();
				}
			}
			//8. ���� "?"�� .....
			System.out.println("------8.  ���̸���  ? ----- ");
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTeam().equals("Ʈ���̽�")) {
					System.out.println(list.get(i).getName()+",");
					System.out.println(list.get(i).getAge()+",");
					System.out.println(list.get(i).getGender()+",");
					System.out.println(list.get(i).getTeam()+",");
					System.out.println();
				}
			}
			//9. ���� ���? ���� ���?
			/*System.out.println("------9. ���ڰ� ����̰�,  ���ڰ� ����ΰ�? ----- ");
			int genderCount =  0;
				for(Idol idol : list) {
					if(idol.getGender().equals("��")) {
						genderCount++;
					}
				}*/
			int count  = 0;
			int count2 = 0;
			for(int i=0; i<list.size(); i++ ) {
				if(list.get(i).getGender() == "��") {
					count++;
				}
				count2++;
			}
			System.out.println(count+ ","+(count2-count));
			//10. ��ź�ҳ�� �Է� / ��ź�ҳ���� �ο��� ���?
			System.out.println("------ 10. ��ź�ҳ�� �Է� / ��ź�ҳ���� �ο� -------");
			int count1 = 0;
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTeam().equals("��ź�ҳ��")) {
					count1++;
				}
				System.out.println("��ź�� "+count1+"���Դϴ�.!!");
			}
			//11. ���ο��� 5���̻��� ������ ����ϼ���.
			System.out.println("------ 11. ���ο��� 5���̻��� ������ ����ϼ���! ");
			int teamcount = 0;
			int teamcount1 = 0;
			int teamcount2 = 0;
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTeam().equals("Ʈ���̽�")){
					teamcount++;
				}else if(list.get(i).getTeam().equals("���")) {
					teamcount1++;
				}else if(list.get(i).getTeam().equals("��ź�ҳ��")) {
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

		
			
	



				
				

		
		
		

