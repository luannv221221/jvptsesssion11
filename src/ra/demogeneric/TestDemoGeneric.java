package ra.demogeneric;

public class TestDemoGeneric {
    public static void main(String[] args) {
        DemoGeneric<String,String> demoGeneric = new DemoGeneric<>();
        demoGeneric.setKey("ho ten");
        demoGeneric.setValue("Nguyen Van A");
        demoGeneric.display();

        DemoGeneric<Integer,String> demoGeneric1 = new DemoGeneric<>();
        demoGeneric1.setKey(1);
        demoGeneric1.setValue("Nguyen Van C");
        demoGeneric1.display();

    }
}
