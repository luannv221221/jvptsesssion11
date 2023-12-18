package bt.model;

import java.util.Scanner;

public class Product {
    private int productCode;
    private String productName;
    private float price;

    public Product() {
    }

    public Product(int productCode, String productName, float price) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma sp");
        productCode = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ten sp");
        productName = scanner.nextLine();
        System.out.println("Nhap vao gia sp");
        price = Float.parseFloat(scanner.nextLine());
    }

    public void displayData(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
