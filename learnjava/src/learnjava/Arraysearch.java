package learnjava;

import java.util.Scanner;

public class Arraysearch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] n = new int[5];

        System.out.println("Enter 5 values:");
        for(int i = 0; i < n.length; i++) {
            n[i] = s.nextInt();
        }

        System.out.println("Enter value to search:");
        int key = s.nextInt();

        boolean isFound = false;

        for(int i = 0; i < n.length; i++) {
            if(key == n[i]) {
                isFound = true;
                break;
            }
        }

        if(isFound == true)
            System.out.println(key + " is found.");
        else
            System.out.println(key + " is not found.");
    }
}
