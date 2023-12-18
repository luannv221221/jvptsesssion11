package ra.demogeneric;

public class DemoGeneric<K,V> {
    private K key;
    private V value;

    public DemoGeneric() {
    }

    public DemoGeneric(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }


    public void display(){
        System.out.println(key + ":" +value);
    }
}
