package commerce;

public class productCart {

    private Product cartedProduct;
    private int stack;

    public productCart(Product cartedProduct, int stack) {
        this.cartedProduct = cartedProduct;
        this.stack = stack;
    }

    public int sumCartedProduct() {
        return cartedProduct.getPrice() * stack;
    }

    public Product getCartedProduct() {
        return cartedProduct;
    }

    public int getStack() {
        return stack;
    }

}
