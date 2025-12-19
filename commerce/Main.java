package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 데이터를 넣을 리스트
        List<Product> commerceProducts = new ArrayList<>();

        // 리스트에 들어갈 데이터들
        Product prod1 = new Product("Galaxy  S25", 1200000, "최신 안드로이드 스마트폰", 10);
        Product prod2 = new Product("iPhone   16", 135000, "Apple의 최신 스마트폰", 20);
        Product prod3 = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 30);
        Product prod4 = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 40);

        commerceProducts.add(prod1);
        commerceProducts.add(prod2);
        commerceProducts.add(prod3);
        commerceProducts.add(prod4);

        CommerceSystem comemerceSystem = new CommerceSystem(commerceProducts);

        comemerceSystem.start();

    }

}