public class Triangle extends Shape{

    private double side1,side2,side3;

    public Triangle(){
        side1=2.0;
        side2=2.0;
        side3=2.0;
    }
public Triangle(double s1,double s2, double s3, String c, boolean f){
        side1=s1;
        side2=s2;
        side3=s3;
        setColor(c);
        setFilled(f);
œ

}
public double getArgs(){
        double s= (side1+side2+side3)/2;
        return 
}

}