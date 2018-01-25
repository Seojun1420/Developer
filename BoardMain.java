public class BoardMain {
	public static void main(String[] args) {
		Dock dock = new Dock(); 
		System.out.println(dock.card); // null
		dock.init(); // this -> dock
		for(int i=0; i<dock.card.length; i++) {
			System.out.println(dock.card[i].kind+","+dock.card[i].num);
		}
		System.out.println("-------------------------------");
		// dock 섞기
		dock.shuffle();
		// dock섞기 확인 
		for(int i=0; i<dock.card.length; i++) {
			System.out.println(dock.card[i].kind+","+dock.card[i].num);

		
	}
}
}
