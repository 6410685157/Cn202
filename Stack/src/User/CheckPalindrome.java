package User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Designer.Stack;

public class CheckPalindrome {

public static boolean CheckPalindrome(String str) {
    
    Stack stack = new Stack(str.length());

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        stack.push(c);
    }
    
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        char popped = (Character) stack.pop();

        if (c != popped) {
            return false;
        }
    }

    return true;
}

public static void main(String[] args) throws IOException{
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader console = new BufferedReader(reader);
    String input = console.readLine();


        if (CheckPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
}
}
