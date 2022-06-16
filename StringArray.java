import java.util.*;
import java.util.Scanner;

public class StringArray {

    public static void main(String args[]) {
        System.out.print("How many students will be inputed in the system: ");
        Scanner sc = new Scanner(System.in);
        int grade = 15;
        ArrayList<String> list = new ArrayList<String>();// Creating arraylist
        int N = sc.nextInt();
        String holder;
        holder = sc.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.println("Input the " + (i + 1) + " Name: ");
            holder = sc.nextLine();
            list.add(holder);
        }
        // Printing the arraylist object
        System.out.println(list + "+" + grade);
        sc.close();
    }
}
