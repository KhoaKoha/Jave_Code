package model;

public class Square extends Shape{
    public void draw(){
        System.out.println("Draw Square edge="+this.getEdge()+"and color="+getColor());
    }

    public void erase(){
        System.out.println("Erase Square");
        System.out.println("Erase Square width="+this.getEdge()+".");
    }

    @Override
    public void area(){System.out.println("Area Square = "+ Math.abs(this.getEdge())); }
}
