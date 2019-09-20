
public class PlayingCardsASCII {

	//prints title
	public static void deckTitle()
	{
		System.out.println("Welcome! Here's your deck");
	}
	
	
	//prints card by passing by using the "cardType" parameter
	public static void cardDiamond(String cardType){ 
		
		if(cardType == "10") {
			System.out.println(".------.");
			System.out.println("|" + cardType + ".-. |");
			System.out.println("| :/\\: |");
			System.out.println("| :\\/: |");
			System.out.println("| '-'" + cardType + "|");
			System.out.println("\"------\"");
				
		}
		
		else {
		//generic card template 
		System.out.println(".------.");
		System.out.println("|" + cardType + ".--. |");
		System.out.println("| :/\\: |");
		System.out.println("| :\\/: |");
		System.out.println("| '--'" + cardType + "|");
		System.out.println("\"------\"");
		
		}
		
	}
	
	
	public static void cardSpade(String cardType) {
		
		System.out.println(".------.");
		System.out.println("|" + cardType + ".--. |");
		System.out.println("| :/\\: | ");
		System.out.println("| (__) |");
		System.out.println("| '--'" + cardType + "|");
		System.out.println("\"------\"");
		
	}
	
	public static void cardClover(String cardType) {
		
		System.out.println(".------.");
		System.out.println("|" + cardType + ".--. |");
		System.out.println("| :(): |");
		System.out.println("| ()() |");
		System.out.println("| '--'" + cardType + "|");
		System.out.println("\"------\"");
		
	}
	
	
	
	
	
	public static void main (String[] args) {
		
		//call deckTitle method to print title
		deckTitle();
		
		//call cardDiamond method and pass cardType argument to print card to console
		cardDiamond("A");
		cardSpade("2");
		cardDiamond("3");
		cardSpade("4");
		cardClover("5");
		cardDiamond("6");
		cardSpade("7");
		cardDiamond("8");
		cardSpade("9");
		cardDiamond("10");
		cardClover("J");
		cardClover("Q");
		cardSpade("K");
		
		
		
		
	}
	
}
