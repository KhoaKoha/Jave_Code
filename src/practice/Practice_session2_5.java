package practice;

import model.Rectangular;
import model.Shape;
import model.Square;
import model.Circle;

public class Practice_session2_5 {
    public static void main(String args[]) {
        System.out.println("With : ");
        Rectangular rectangular = new Rectangular();
        rectangular.setWidth(10);
        rectangular.setHeight(25);
        rectangular.setColor("White");
        RunWithShape(rectangular);

        Square square = new Square();
        square.setEdge(96);
        square.setColor("BLUE");
        RunWithShape(square);

        Circle circle = new Circle();
        square.setRadius(10);
        if(circle.getRadius() > Shape.MAX_WIDTH){
            circle.setRadius(Shape.MAX_WIDTH);
        }
        circle.setColor("BLACK");
            RunWithShape(circle);
    }

    public static void RunWithShape(Shape shape){
        System.out.println(shape);
        shape.draw();
        if (shape instanceof Circle){
            Circle circle = (Circle) shape;
            circle.draw("YELLOW");
        }
        shape.area();
        shape.earse();
        System.out.println();
    }
}
