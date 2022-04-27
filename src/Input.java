package src;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
/*        Scanner scanner;
        scanner = new Scanner(System.in);
        //String input = scanner.nextLine();


        String input = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();
        String input4 = scanner.next();

        System.out.println(input);
        System.out.println(input2);
        System.out.println(input3);
        System.out.println(input4);*/


        System.out.println("숫자를 하나 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();
        //System.out.println(intInput + 1);
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println(intValue + 1);
        } catch (Exception e) {
            System.out.println("숫자를 입력해야 합니다.");
        }
    }
}
