public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;

    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(){
        this.width = width;
    }
    public void setLength(){
        this.length = length;
    }
    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }
    @Override
    public String toString(){
        return "A Rectangle with width = " + getWidth() + " length " + getLength() + " Area: " + getArea() + " Perimeter: " + getPerimeter() + " which is a subclass of " +super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 5.8, "orange", false);
        System.out.println(rectangle);
    }
}
