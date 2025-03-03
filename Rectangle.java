class Rectangle {
 double length;
 double breadth;
 
 double area()
 {
    return length*breadth;
 }
 
 public static void main(String[] args){
 
 
 
 Rectangle r1=new Rectangle();
 Rectangle r2=new Rectangle();
 
 r1.length=2;
 r1.breadth=3;
 
 r2.length=4;
 r2.breadth=5;
 
 System.out.println("area of rectangle 1:"+r1.area());
 System.out.println("area of rectangle 2:"+r2.area());
 
 



}




}
