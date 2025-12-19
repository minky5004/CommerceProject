package commerce;

import java.util.List;

public class Category {

    // 카테고리의 종류
    private String category;

    // CommerceSystem이 아닌 Category 메소드에서 List<Product>를 관리하기 위해서 새로 선언
    private List<Product> products;

    // 카테고리 객체 생성자
    public Category(String category, List<Product> products) {
        this.category = category;
        this.products = products;
    }

    // 카테고리 이름을 반환하는 메소드
    public String getCategoryName() {
        return category;
    }

    // 프로덕트 반환
    public List<Product> getProducts() {
        return products;
    }
}
