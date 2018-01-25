public class BoardMain {
	public static void main(String[] args) {
		Dock dock = new Dock(); 
		System.out.println(dock.card); // null
		dock.init(); // this -> dock
		for(int i=0; i<dock.card.length; i++) {
			System.out.println(dock.card[i].kind+","+dock.card[i].num);

			//0   12 s
			//13  25 c
			//26  38 h
			//39  51 d
		}
	}
}
