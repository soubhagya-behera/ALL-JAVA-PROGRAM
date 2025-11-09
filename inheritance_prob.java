class circle{
    public int radius;
    circle(){
        System.out.println(" i am a non param of circle");
    }
    circle(int r){
        System.out.println("i am a circle parameterised constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI* this.radius*this.radius;
    }
}
class Cylinder extends circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("i am a Cylinder parameterised constructor");
        this.height=h;
    }
public double Volume() {
    return Math.PI * this.radius * this.radius * this.height;
}
}
public class inheritance_prob {
    public static void main(String[] args) {
        //Problem1
        //circle obj=new circle(12);
        Cylinder objc=new Cylinder(14,4);
    }
}
