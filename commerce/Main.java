package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 전자제품 물품 리스트
        List<Product> electroincsProducts = new ArrayList<>();

        // 전자제품 카테고리 물품들
        Product prod1 = new Product("Galaxy  S25", 1200000, "최신 안드로이드 스마트폰", 0);
        Product prod2 = new Product("iPhone   16", 135000, "Apple의 최신 스마트폰", 20);
        Product prod3 = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 30);
        Product prod4 = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 40);

        electroincsProducts.add(prod1);
        electroincsProducts.add(prod2);
        electroincsProducts.add(prod3);
        electroincsProducts.add(prod4);

        // 전자제품 카테고리 완
        Category Electronics = new Category("전자제품", electroincsProducts);

        // 의류 물품 리스트
        List<Product> clothesProducts = new ArrayList<>();

        // 의류 카테고리 완
        Category Clothes = new Category("의류", clothesProducts);

        // 식품 물품 리스트
        List<Product> foodProducts = new ArrayList<>();

        // 식품 카테고리 완
        Category Food = new Category("음식", foodProducts);

        // 전체 제품 카테고리를 넣을 리스트
        List<Category> allCategories = new ArrayList<>();

        // 전체 카테고리 정리 완
        allCategories.add(Electronics);
        allCategories.add(Clothes);
        allCategories.add(Food);

        CommerceSystem commerceSystem = new CommerceSystem(allCategories);

        commerceSystem.start();



    }

}