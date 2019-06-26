package model;

public class Rectangular extends Shape {
    public void draw(){
        System.out.println("Draw Rectangular width="+this.getWidth()+"and height="+getHeight());
    }

    public void erase(){
        System.out.println("Erase Rectangular");
        System.out.println("Erase Rectangular width="+this.getWidth()+"and height="+getHeight());
    }

    @Override
    public void area(){System.out.println("Draw Rectangular width="+this.getWidth()+"and height="+this.getHeight()); }
}
