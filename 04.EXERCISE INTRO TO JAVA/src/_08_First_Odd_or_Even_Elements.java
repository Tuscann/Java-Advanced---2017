import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class _08_First_Odd_or_Even_Elements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] area = scanner.nextLine().split("\\s+");
        String[] comand = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(comand[1]);
        Integer counter = 1;

        if (comand[2].equals("odd")) {
            for (int i = 0; i < area.length; i++) {
                if (n >= counter && Integer.parseInt(area[i]) % 2 != 0) {
                    System.out.printf("%d ", Integer.parseInt(area[i]));
                    counter++;
                }

            }
        }
        else if (comand[2].equals("even")) {
            for (int i = 0; i < area.length; i++) {
                if (n >= counter && Integer.parseInt(area[i]) % 2 == 0) {
                    System.out.printf("%d ", Integer.parseInt(area[i]));
                    counter++;
                }

            }
        }
    }
}