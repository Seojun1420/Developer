public class Deck {
	public Card[] card;
	// dock안 card들 초기화 메서드
	
	public void shuffle() {
		//this.card 섞음 //카드 섞어 보기
		for(int i=0; i<500000; i++) {
			Card temp = this.card[0];
			int r = (int)(Math.random()*this.card.length); // 0~51
			this.card[0] = this.card[r];
			this.card[r] = temp;
		}
	}
	public void init() {
		// 1. 카드 52장을 만들어야 한다.
		this.card = new Card[52];
		for(int i=0; i<this.card.length; i++) {
			this.card[i] = new Card();
			this.card[i].num = (i%13)+1;
			switch(i/13) {
			case 0:
				this.card[i].kind = "spade"; 
				
				break;
			case 1:
				this.card[i].kind = "clover"; 
				break;
			case 2:
				this.card[i].kind = "heart"; 
				break;
			case 3:
				this.card[i].kind = "diamond"; 
				break;
			default:
				break;
			}
	}
	}
}
