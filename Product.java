class Product{

int pcode;
String pname;
int price;

void display()
{
  System.out.println("");
  System.out.println(pcode);
  System.out.println(pname);
  System.out.println(price);

}

 public static void main(String[] args)
 {
   Product p1=new Product();
   Product p2=new Product();
   
   p1.pcode=21;
   p1.pname="MacBook";
   p1.price=1490;
 
   p2.pcode=23;
   p2.pname="ThinkPad";
   p2.price=1390;
   
   
   p1.display();
   p2.display();
   if(p1.price > p2.price)
   {
     System.out.println("price of "+p1.pname+"is larger");
   
   }  
 
 }
 
















}
