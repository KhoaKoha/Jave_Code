package model;

public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw Circle: radius="+this.getRadius()+"and color="+getColor());
    }

    public void draw(String colorDiffirent){
        System.out.println("Draw Circle: radius="+this.getRadius()+"and color="+colorDiffirent);
    }

    @Override
    public void earse(){
        System.out.println("Erase Circle");
        System.out.println("Erase Circle radius="+this.getRadius()+"done.");
    }

    @Override
    public void area(){System.out.println("Area Circle = "+ Math.abs(this.getRadius())*Math.PI); }
}
