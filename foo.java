public class foo {
    public static void main(String[] args) {
        try {
            System.out.println("hello world");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
