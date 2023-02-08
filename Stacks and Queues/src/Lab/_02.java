package Lab;

import java.util.*;

public class _02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayDeque<String> stack = new ArrayDeque<> ();

        String expression = scanner.nextLine ();
        String[] expressionsParts = expression.split(" ");

        List<String> partsList = Arrays.asList (expressionsParts);
        Collections.reverse (partsList);

        for (String part : partsList) {
            stack.push (part);
        }

        while (stack.size () > 1) {
            int first = Integer.parseInt(stack.pop());
            String oper = stack.pop();
            int second = Integer.parseInt(stack.pop());

            int result = 0;
            switch (oper) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                default:
                    System.out.println ("Unknown operation " + oper);
                    return;
            }
            stack.push("" + result);
        }
        System.out.println (stack.peek ());
    }
}
