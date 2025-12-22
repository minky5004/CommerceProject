package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    Scanner stdin = new Scanner(System.in);
    private List<Category> categories;
    private List<productCart> cartedProducts = new ArrayList<>();

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
                        Product product = products.get(i);
                        System.out.println((i + 1) + ". " + product.getName() + " | " + product.getPrice() + "원 | " + product.getStock());
                    }
                    System.out.println("0. 뒤로");

                    int subSelect = stdin.nextInt();

                    if (subSelect == 0) break;

                    if (subSelect > 0 && subSelect <= products.size()) {
                        Product product = products.get(subSelect - 1);
                        System.out.println("\n선택한 상품: " + product.getName() + " | " + product.getPrice() + "원 | " + product.getExplanation() + " | 재고: " + product.getStock() + "개\n");
                        System.out.println("장바구니에 담으시겠습니까? (1. 예 / 2. 아니오)");

                        int cartSelect = stdin.nextInt();

                        if  (cartSelect == 1) {
                            System.out.println("추가되었습니다");
                            cartedProducts.add(new productCart(product,1));

                        }else if (cartSelect == 2) {
                            System.out.println("취소되었습니다.");
                            break;
                        }

                        break;
                    } else {
                        System.out.println("없는 상품 번호입니다.");
                    }
                }
            } else {
                System.out.println("없는 카테고리 번호입니다.");
            }
        }
    }
}
