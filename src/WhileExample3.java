package src;

import java.util.Scanner;

public class WhileExample3 {
    public static void main(String[] args) {
        String passward = "abc123";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("비밀번호를 입력해주세요.");
            String input = scanner.nextLine();

            System.out.println("비밀번호가 일치하지 않습니다.");

            if (input.equals(passward)) {
                System.out.println("비밀번호가 일치합니다.");
                break;
            }

//            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }
}
