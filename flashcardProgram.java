/*
import java.util.Scanner;
public class flashcardProgram extends flashcardAbilities {
    // Shared Scanner for the whole program — use flashcardProgram.IN everywhere
    public static final Scanner IN = new Scanner(System.in);

    public static void main(String[] args) {
        //This is your main method, in which you will call all the flashcardAbilities methods
        flashcardAbilities app = new flashcardAbilities();
        System.out.println("Welcome to Flashcard Program! Choose one of the following options:\n1. Add Flashcard\n2. List Flashcards\n3. Remove Flashcard\n4. Quiz Me\n5. Quit");
        String userInput= IN.nextLine();

while(!userInput.equals("5")){ 
    switch(userInput){ 
        case "1": 
            app.addFlashcard(); 
            break; 
        case "2": 
            System.out.println(app.listFlashcards()); 
            break; 
        case "3": 
            app.removeFlashcard(); 
            break; 
        case "4": 
            app.quizMe(); 
            break; 
        default: 
            System.out.println("Invalid option, please try again."); 
            } 
        System.out.println("What would you like to do next? \n1. Add Flashcard\n2. List Flashcards\n3. Remove Flashcard\n4. Quiz Me\n5. Quit"); 
        userInput= IN.nextLine(); 
        } 
        System.out.println("Thank you for using Flashcard Program. Goodbye!");
    }
}
*/
