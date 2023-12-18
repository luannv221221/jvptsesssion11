package bt.run;

import bt.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("============MENU==============");
            System.out.println("1. Nhập vào sản phẩm");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Sủa sản phẩm");
            System.out.println("4. Xóa sản phẩm ");
            System.out.println("Lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    do {
                        Product product = new Product();
                        product.inputData();
                        list.add(product);
                        System.out.println("Nhap nua ko 1. co 2. ko");
                        int choice1 = Integer.parseInt(scanner.nextLine());
                        if(choice1 == 2){
                            break;
                        }
                    } while (true);
                    break;
                case 2:
                    Program.getAll(list);
                    break;
                case 4:
                    // hiển thị danh sách trước sau đó mới xóa
                    Program.getAll(list);
                    System.out.println("Nhap vao ma muon xoa");
                    int code = Integer.parseInt(scanner.nextLine());
                    for (Product product : list) {
                        if(product.getProductCode() == code){
                            list.remove(product);
                            break;
                        }
                    }
                    break;
            }
        }while (true);
    }

    // phương thức hiển thị danh sách
    public static void getAll(List<Product> list){
        for (Product product : list) {
            product.displayData();
        }
    }
}
