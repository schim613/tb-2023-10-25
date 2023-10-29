package com.ll;

// System.out 모니터
// System.in  키보드

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class App {
    Scanner scanner = new Scanner(System.in);
    List<Quotation> quotations = new ArrayList<>();

    void run() {
        System.out.println("== 명언 앱 ==");
        int lastQuotationtId = 0;

        while (true) {
            System.out.print("명령) ");

            String cmd = scanner.nextLine();
            if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String content = scanner.nextLine();

                System.out.print("작가 : ");
                String authorName = scanner.nextLine();

                lastQuotationtId++;
                int id = lastQuotationtId;

                Quotation quotation = new Quotation(lastQuotationtId, content, authorName);
                quotations.add(quotation);

                System.out.printf("%d번 명언이 등록되었습니다\n", lastQuotationtId);
                System.out.printf("명언 : %s, 작가 : %s\n", content, authorName);
            }
            else if (cmd.equals("종료")) {
                break;
            }
            else if (cmd.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------");

                if (quotations.isEmpty())
                    System.out.println("등록된 명언이 없습니다.");

                for (int i = quotations.size() - 1; i >= 0; i--) {
                    Quotation quotation = quotations.get(i);
                    System.out.printf("%d / %s / %s\n", quotation.id, quotation.content, quotation.authorName);
                }

//                for (Quotation quotation : quotations) {
//                    System.out.printf("%d / %s / %s\n", quotation.id, quotation.content, quotation.authorName);
//                }
            }
        }
    }
}