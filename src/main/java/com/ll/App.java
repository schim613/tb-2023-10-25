package com.ll;

// System.out 모니터
// System.in  키보드

import java.util.Scanner;

class App {
    void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                System.out.println("== 종료되었습니다. ==");
                break;
            }

            System.out.printf("입력받은 값 : %s\n", cmd);
        }
    }
}