interface Shape{
    void draw();
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("this is a square");
    }
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("this is a circle");
    }
}
class ShapeFactory{
    public static Shape createShape(String shape){
        if("Square".equalsIgnoreCase(shape)){
            return new Square();
        }else if("Circle".equalsIgnoreCase(shape)){
            return new Circle();
        }else {
            throw new IllegalArgumentException("invalid shape type");
        }
    }
}

class MainEx{
    public static void main(String[] args) {
        Shape square= ShapeFactory.createShape("Square");
        square.draw();
    }
}