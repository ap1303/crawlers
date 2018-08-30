public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double size){
        this.length = size;
        this.width = size;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String identifySelf() {
        return "I am a Rectangle";
    }
}
