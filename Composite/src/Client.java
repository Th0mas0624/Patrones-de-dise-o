public class Client {
    public static void main(String[] args) {
        Leaf l1 = new Leaf();
        Leaf l2 = new Leaf();
        Leaf l3 = new Leaf();

        Composite c = new Composite();
        c.add(l1);
        c.add(l2);
        c.add(l3);

        System.out.println(c.operacion());

    }
}
