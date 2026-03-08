public class text {

    public text() {
        System.out.println("constructor with empty parameter");
    }

    public text(int a) {
        System.out.println("constructor with a " + a);
    }

    public text(float a, int c) {
        System.out.println("constructor with a " + a + " " + c);
    }

    public text(int c, int a) {
        System.out.println("Constructor with a " + a + " " + c);
    }

    public static void main(String[] args) {
        new text();
        new text(2f, 7);
        new text(4, 8);
        new text(3);
    }
}
