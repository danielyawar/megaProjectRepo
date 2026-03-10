import java.util.ArrayList;
public class flashcardAbilities {
    ArrayList<String> titles = new ArrayList<>();
    ArrayList<String> definitions = new ArrayList<>();

    public void addFlashcard() {
        //This method will add a flashcard to the allFlashcards ArrayList
        System.out.println("Enter the title of the flashcard:");
        String userInput= flashcardProgram.IN.nextLine();
        titles.add(userInput);
        System.out.println("Enter the definition of the flashcard:");
        userInput= flashcardProgram.IN.nextLine();
        definitions.add(userInput);
    }

    public String listFlashcards() {
        //This method will return a String of all flashcards in the allFlashcards ArrayList
        return titles.toString();
    }

    public void removeFlashcard() {
        //This method will list out the flashcards and ask which should be removed
        System.out.println("Enter the title of the flashcard to remove:");
        String userInput= flashcardProgram.IN.nextLine();
        int index = titles.indexOf(userInput);
        if (index >= 0) {
            titles.remove(index);
            definitions.remove(index);
            System.out.println("Your flashcard has been removed!");
        } else {
            System.out.println("No flashcard with that title found.");
        }
    }

    public void quizMe() {
        //This method will choose a random flashcard title and ask the user to define it
        if (titles.isEmpty()) {
            System.out.println("No flashcards to quiz. Add some first.");
            return;
        }
        int randomIndex = (int) (Math.random() * titles.size());
        System.out.println("Define: " + titles.get(randomIndex));
        String userInput= flashcardProgram.IN.nextLine();
        if(userInput.equals(definitions.get(randomIndex))) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct definition is: " + definitions.get(randomIndex));
        }

    }
}