public class ShapeDemo {
    public static void main(String[] args) throws InstantiationException {
        Rectangle r1 = new Square(1, 1);
        System.out.println(r1.identifySelf());
    }
}
