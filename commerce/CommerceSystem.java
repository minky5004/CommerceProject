package commerce;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    Scanner stdin = new Scanner(System.in);
    private List<Category> categories;

    //생성자
    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
    }

    // 입력과 반복문 로직을 실행하는 start함수
    public void start() {
        while (true) {
            // 메인 메뉴
            System.out.println("[ 실시간 커머스 플랫폼]");
            for(int i = 0; i < categories.size(); i++) {
                System.out.println((i + 1) + ". " + categories.get(i).getCategoryName());
            }
            System.out.println("0. 종료           | 프로그램 종료");

            int mainSelect = stdin.nextInt();

            if (mainSelect == 0) {
                System.out.println("프로그램 종료");
                break;

            }
        }
    }
}
