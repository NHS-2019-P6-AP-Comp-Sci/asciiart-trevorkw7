
public class Playing_Cards_ASCII_Art {

	//prints title
	public static void deckTitle()
	{
		System.out.println("Welcome! Here's your deck");
	}
	
	
	//prints card by passing by using the "cardType" parameter
	public static void cardCreator(String cardType){ 
		
		//generic card template 
		System.out.println(".------.");
		System.out.println("|" + cardType + ".--. |");
		System.out.println("| :/\\: |");
		System.out.println("| :\\/: |");
		System.out.println("| '--'" + cardType + "|");
		System.out.println("\"------\"");
		
		
	}
	
	
	public static void main (String[] args) {
		
		//call deckTitle method to print title
		deckTitle();
		
		//call cardCreator method and pass cardType argument to print card to console
		cardCreator("A");
		cardCreator("2");
		cardCreator("3");
		cardCreator("4");
		cardCreator("5");
		cardCreator("6");
		cardCreator("7");
		cardCreator("8");
		cardCreator("9");
		cardCreator("10");
		cardCreator("J");
		cardCreator("Q");
		cardCreator("K");
		
	}
	
}
