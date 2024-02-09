class Shape {
    
    public double calculateSquareArea(double side) {
        return side * side;
    }

    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println("Area of square: " + shape.calculateSquareArea(5.0));

        System.out.println("Area of rectangle: " + shape.calculateRectangleArea(4.0, 6.0));

        System.out.println("Area of circle: " + shape.calculateCircleArea(3.0));
    }
}
