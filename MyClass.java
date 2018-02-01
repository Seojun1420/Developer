
public class MyClass {
	int x;
	
	public MyClass() {// 생성자 메소드 오버로딩
		System.out.println("+MysClass");
		this.x = 0;
	}
	public MyClass(int x) { // 생성자 메소드
		this.x = x;
	}

}
