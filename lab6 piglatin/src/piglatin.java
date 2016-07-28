
import java.util.Scanner;

public class piglatin {

public static void main(String args[]){

		System.out.println("Welcome to the pig Latin Translator!");

		Scanner sc = new Scanner(System.in);
		
			
			      
			System.out.println("Enter  words.");
			
			String word = sc.nextLine();
	
				// get the input from user
			//System.out.print(word);
			for(int i= 0; i<1; i++){
			int x = word.length();
			if (word.charAt(0)=='a' || word.charAt(0)=='e'|| word.charAt(0)=='i'|| word.charAt(0)=='o'|| word.charAt(0)=='u')
			               {
		      
				word=word+"way";
			               }
				
			          //if a word starts with a consonant, move all of the consonants that appear before the first vowel to the end of the word then add "ay" to end     
			               else {	
				
				char firstletter = word.charAt(0);
		               word = word.substring(1) +  word.charAt(0) + "ay";
	}
			
			System.out.print(word);
			
			
			}	
			
			System.out.println();
			System.out.print("Translate another word? (y/n):");
			String choice = sc.nextLine();
			System.out.println();

} 
}
            
			
				
				