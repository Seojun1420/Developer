public class BoardMain {
	public static void main(String[] args) {
		Deck deck = new Deck(); 
		System.out.println(deck.card); // null
		deck.init(); // this -> dock
		for(int i=0; i<deck.card.length; i++) {
			System.out.println(deck.card[i].kind+","+deck.card[i].num);
		}
		System.out.println("-------------------------------");
		// dock 섞기
		deck.shuffle();
		// dock섞기 확인 
		for(int i=0; i<deck.card.length; i++) {
			System.out.println(deck.card[i].kind+","+deck.card[i].num);

		
	}
}
}

