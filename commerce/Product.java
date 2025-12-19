package commerce;

public class Product {

    String name;
    int price;
    String explanation;
    int stock;

    // 생성자를 통해서 각각의 정보를 받아서 객체 생성
    public Product(String name, int price, String explanation, int stock) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
        this.stock = stock;
    }
}
