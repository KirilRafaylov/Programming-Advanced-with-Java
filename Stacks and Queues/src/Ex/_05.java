package Ex;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine ();

        ArrayDeque<Character> openBracketStack = new ArrayDeque<> ();
        boolean areBalanced = false;

        // стек с отворени скоби
        for (char bracket : input.toCharArray ()) {
            // отворена скоба -> стек
            if (bracket =='(' || bracket == '[' || bracket == '{' ) {
                openBracketStack.push (bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                // затворена скоба -> опашка
                if (openBracketStack.isEmpty ()) {
                    areBalanced = false;
                    break;
                }
                char lastOpenBracket = openBracketStack.pop ();

                if (lastOpenBracket == '(' && bracket == ')') {
                    areBalanced = true;
                } else if (lastOpenBracket == '[' && bracket == ']') {
                    areBalanced = true;
                } else if (lastOpenBracket == '{' && bracket == '}') {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }

            }
        }
        if (areBalanced ) {
            System.out.println ("YES");
        } else {
            System.out.println ("NO");
        }
    }
}
