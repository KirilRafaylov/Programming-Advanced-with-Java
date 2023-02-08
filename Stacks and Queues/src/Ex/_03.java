package Ex;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<> ();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String command = scanner.nextLine ();
            if (command.equals ("2")) {
                stack.pop ();
            } else if (command.equals ("3")) {
              if (stack.size () > 0) {
                  System.out.println (Collections.max (stack));
              }
            } else {
                int x = Integer.parseInt(command.split ("\\s+")[1]);
                stack.push (x);
            }
            }
        }

    }

