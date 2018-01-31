import java.util.Scanner;
import java.util.*;

public class Test {
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      while(true) {
        String text = scan.nextLine();
        
        if (Objects.equals(text, "exit")) {
          break;
        }
        System.out.println(text);
      }
      scan.close();

    // Scanner scan = new Scanner(System.in);

    // //For string

    // String text = scan.nextLine();

    // System.out.println(text);

    // //for int

    // int num = scan.nextInt();

    // System.out.println(num);
    }
}