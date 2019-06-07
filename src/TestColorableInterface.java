import colorable.Colorable;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class TestColorableInterface {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Rectangle();
        shapes[2]=new Square();
        for (Shape shape:shapes){
            if (shape instanceof Square){
                System.out.println(((Colorable) shape).howToColor());
            } else {
                System.out.println(shape.getArea());
            }
        }
    }
}
