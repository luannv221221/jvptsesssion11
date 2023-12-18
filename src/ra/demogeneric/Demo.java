package ra.demogeneric;

public class Demo {
    public static void main(String[] args) {
        Cal<String> cal = new Cal<>();
        cal.display("Xin chào");
        Cal<Number> cal1 = new Cal<>();
        cal1.display(1);
    }
}
