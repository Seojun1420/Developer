public class Dock {
	public Card[] card;
	// dock안 card들 초기화 메서드
	public void init() {
		// 1. 카드 52장을 만들어야 한다.
		this.card = new Card[52];
		for(int i=0; i<this.card.length; i++) {
			this.card[i] = new Card();
		}
	}
}
