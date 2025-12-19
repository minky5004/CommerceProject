package commerce;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    Scanner stdin = new Scanner(System.in);
    public List<Product> products;

    //생성자
    public CommerceSystem(List<Product> products) {
        this.products = products;
    }

    // 입력과 반복문 로직을 실행하는 start함수
    public void start() {
        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품]");

            for (int i = 0; i < products.size(); i++) {
                Product nowProduct = products.get(i);
                System.out.println((i + 1) + ". " + nowProduct.name + "      |  " + nowProduct.price + "원        |" + nowProduct.explanation);
            }
            System.out.println("0. 종료             | 프로그램 종료");
            int num = stdin.nextInt();

            if (num == 0) {
                System.out.println("커머스 플랫폼을 종료합니다");
                break;
            }
        }
    }
}
