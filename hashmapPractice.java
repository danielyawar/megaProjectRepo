import java.util.HashMap;
public class hashmapPractice{
    public static void main(String args[]){
        String name = "Dr. Suess";
        System.out.println(name.toLowerCase()); 
        System.out.println(name.toUpperCase()); 
        System.out.println(name);
        name = name.toLowerCase(); 
        System.out.println(name);

        boolean same1 = name.equals("dr. suess"); 
        System.out.println(same1);
        boolean same2 = (name== new String("dr. suess"));
        System.out.println(same2);

        System.out.println(name.length());

        name.replace('s','x');
        System.out.println(name);

        name = name.substring(2, 7);
        System.out.println(name);

        name += 1 + 3 + "author";
        System.out.println(name);
    }
}