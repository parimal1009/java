public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "Center: " + center.toString() + ", Radius: " + radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }
}

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "Center: " + center.toString() + ", Radius: " + radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }
}
public class InterfaceMovable {
    public static void main(String[] args) {
 
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println("Original Circle: " + circle.toString());

        circle.moveUp();
        System.out.println("Circle after moving up: " + circle.toString());

        circle.moveLeft();
        System.out.println("Circle after moving left: " + circle.toString());

        MovablePoint point = new MovablePoint(3, 4, 2, 2);
        System.out.println("Original Point: " + point.toString());

        point.moveDown();
        System.out.println("Point after moving down: " + point.toString());

        point.moveRight();
        System.out.println("Point after moving right: " + point.toString());
    }
}

