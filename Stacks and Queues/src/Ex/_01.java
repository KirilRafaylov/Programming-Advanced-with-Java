package Ex;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine ();
        String[] inputNumbers =input.split (" ");
        ArrayDeque<String> stack = new ArrayDeque<> ();

        for (String text : inputNumbers) {
            stack.push (text);
        }
        while (!stack.isEmpty ()) {
            System.out.print(stack.pop () + " ");
        }
    }
}
