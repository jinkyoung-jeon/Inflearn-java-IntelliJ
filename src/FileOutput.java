package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/output01.txt");
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("종료하려면 입력 없이 엔터.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                System.out.println("파일 입력을 종료합니다.");
                break;
            }

            try {
//            writer.write("치킨은 살 안 쪄요. \n");
//            writer.write("살은 내가 쪄요.");
                writer.write(input);
//                writer.close();
            } catch (IOException e) {
                System.out.println("파일에 데이터를 쓰는 데에 실패했습니다.");
                System.exit(2);
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일 닫기에 실패했습니다.");
        }
    }
}
