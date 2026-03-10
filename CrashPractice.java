import java.util.ArrayList;
import java.util.Scanner;
public class CrashPractice{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Apple");
        cars.add("Banana");
        cars.add("Orange");
        System.out.println("Pick an index (0-2):");
        int userName = Integer.parseInt(myObj.nextLine());
        try{
            System.out.println(cars.get(userName));
        }catch(IndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
        finally{
            System.out.println("All done!");
        }
    }
}