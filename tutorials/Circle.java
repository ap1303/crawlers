public class Circle extends Shape {
    private int radius;
    private String name;
    private static int numCircles;

    public Circle(int radius) {
        this.radius = radius;
        numCircles++;
    }

    // setter
    public void setRadius(int r) {
        if (r > 0) {
            this.radius = r;
        }
    }

    // getter
    public int getRadius() {
        return radius;
    }

    /**
     * Return the name of the Circle.
     *
     * @return the name of the Circle
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the Circle to name.
     *
     * @param name The new name for the Circle
     */
    public void setName(String name) {
        this.name = name;
    }

    public static int getNumCircles() {
        return numCircles;
    }

    public String toString() {
        return "Name: " + name + " Radius: " + radius;
    }

    @Override
    public double getArea() {
        return getRadius() * 3.14;
    }

    @Override
    public String identifySelf() {
        return "I am a Circle";
    }
}
