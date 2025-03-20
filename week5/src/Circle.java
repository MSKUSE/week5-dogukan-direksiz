public class Circle {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {

        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            this.radius = 0;
            System.out.println("Radius cannot be negative");
        }else{
            this.radius = radius;
        }

    }

}
