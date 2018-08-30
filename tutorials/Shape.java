public abstract class Shape implements IPricer {
    @Override
    public double getPrice() {
        return 0;
    }
    public abstract double getArea();
    public abstract String identifySelf();
}
