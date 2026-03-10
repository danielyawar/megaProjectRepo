import java.util.ArrayList;
import java.util.Scanner;
public class fakeDND{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("You awaken and start in a dark center room, with doors on each side. Choose which you wish to enter:\n -North \n -East\n -South \n -West");
        String userInput = myObj.nextLine();
        boolean gameWon= false;
        int roomCounter=0;
        ArrayList<String> myInventory = new ArrayList<>();
        while(gameWon!=true||userInput.equals("quit")){
            switch(userInput){
                case "North":
                    System.out.println("You enter a room full of spikes on the ground and an amulet at your feet, do you pick it up?");
                    userInput = myObj.nextLine();
                    if(userInput.equals("y")){
                        myInventory.add("Cursed Amulet");
                        System.out.println("Current Inventory:"+ myInventory.toString());
                        roomCounter++;
                    }
                case "East":

                case "South":

                case "West":

            
            if(roomCounter==4){
                gameWon=true;
                System.out.println("You win!");
                break;
            }
            System.out.println("You are back at the center, where do you go now?");
            userInput = myObj.nextLine();  
            }
        }
    }
}