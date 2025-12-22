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
            System.out.println("0. 종료           | 프로그램 종료\n");

            int mainSelect = stdin.nextInt();

            if (mainSelect == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            else if (mainSelect > 0 && mainSelect <= categories.size()) {
                Category category = categories.get(mainSelect - 1);

                while (true) {
                    System.out.println("\n[ " + category.getCategoryName() + " 카테고리 ]");
                    List<Product> products = category.getProducts();

                    for (int i = 0; i < products.size(); i++) {
                        Product p = products.get(i);
                        System.out.println((i + 1) + ". " + p.name + " | " + p.price + "원 | " + p.explanation);
                    }
                    System.out.println("0. 뒤로가기");

                    int productSelect = stdin.nextInt();

                    if (productSelect == 0) break; // 뒤로가기 (메인으로)

                    if (productSelect > 0 && productSelect <= products.size()) {
                        Product p = products.get(productSelect - 1);
                        System.out.println("\n선택한 상품: " + p.name + " | " + p.price + "원 | " + p.explanation + " | 재고: " + p.stock + "개");
                        break;
                    } else {
                        System.out.println("잘못된 상품 번호입니다.");
                    }
                }
            } else {
                System.out.println("잘못된 카테고리 번호입니다.");
            }
        }
    }
}
