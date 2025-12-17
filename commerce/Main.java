package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        List<Product> commerceProducts = new ArrayList<>();

        Product prod1 = new Product("Galaxy  S25", 1200000,"최신 안드로이드 스마트폰", 10);
        Product prod2 = new Product("iPhone   16", 135000,"Apple의 최신 스마트폰", 20);
        Product prod3 = new Product("MacBook Pro", 2400000,"M3 칩셋이 탑재된 노트북", 30);
        Product prod4 = new Product("AirPods Pro", 350000,"노이즈 캔슬링 무선 이어폰", 40);

        commerceProducts.add(prod1);
        commerceProducts.add(prod2);
        commerceProducts.add(prod3);
        commerceProducts.add(prod4);

        while(true){
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품]");

            for (int i=0;i<commerceProducts.size();i++){
                Product nowProduct = commerceProducts.get(i);
                System.out.println((i+1) + ". " + nowProduct.name + "      |  " + nowProduct.price + "원        |" + nowProduct.explanation);
            }
            System.out.println("0. 종료             | 프로그램 종료");
            int num = stdin.nextInt();

            if (num==0){
                System.out.println("커머스 플랫폼을 종료합니다");
                break;
            }


        }

    }
}