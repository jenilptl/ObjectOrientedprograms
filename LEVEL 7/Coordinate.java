
class Mypoint{
    private double x;
    private double y;

    public Mypoint(){
        this.x=0;
        this.y=0;
    }
    public Mypoint(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getx(){
        return x;
    }

    public double gety(){
        return y;
    }

    public void distance(Mypoint p){
        double d = Math.sqrt(Math.pow(this.x-p.x,2) + Math.pow(this.y-p.y,2));
        System.out.println("distance for x-y geometry is" +d);

    }

    public void distance(double x,double y){
        double d = Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y,2));
        System.out.println("distance for x-y geometry is" +d);

    }

}
class Threepoint extends Mypoint{
    private double z;

    public Threepoint(double z){
        super();
        this.z=z;
    }

    public Threepoint(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }
    public double getZ() {
        return z;
    }

    public void distance(Threepoint p) {
        double dx = getx() - p.getx();
        double dy = gety() - p.gety();
        double dz = this.z- p.z;
        double dis = Math.sqrt(dx * dx + dy * dy + dz * dz);
        System.out.println("three point coordinate system  distnce of p1 to p2"+ dis);

    }
}
public class Coordinate{
    public static void main(String[] args) {

        Threepoint p1 = new Threepoint(0, 0, 0);
        Threepoint p = new Threepoint(10, 30, 25.5);

        p1.distance(p);
    }

}
