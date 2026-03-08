public class Text {

    public Text() {
        System.out.println("constructor with empty parameter");
    }

    public Text(int a) {
        System.out.println("constructor with a " + a);
    }

    public Text(float a, int c) {
        System.out.println("constructor with a " + a + " " + c);
    }

    public Text(int c, int a) {
        System.out.println("Constructor with a " + a + " " + c);
    }

    public static void main(String[] args) {
        new Text();
        new Text(2f, 7);
        new Text(4, 8);
        new Text(3);
    }
}
