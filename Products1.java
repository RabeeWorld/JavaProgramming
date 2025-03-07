class Products1{

 String pcode;
 String pname;
 int price;
 
   
 Products1(String p_code,String p_name,int Price)
 {
    pcode=p_code;
    pname=p_name;
    price=Price;
 
  }  
 
 public static void main(String[] args)
 {
    Products p1=new Products("101","7up",50);
    Products p2=new Products("102","mirinda",30);
    Products p3=new Products("103","pepsi",70);
 
    if(p1.price <=p2.price && p1.price<=p3.price)
    {
      System.out.println("lowest product id :"+p1.pcode);
    }
        if(p2.price <=p1.price && p2.price<=p3.price)
    {
      System.out.println("lowest product id :"+p2.pcode);
    }
        if(p3.price <=p2.price && p3.price<=p1.price)
    {
      System.out.println("lowest product id :"+p3.pcode);
    }
 
 
 
 
 
 }
 

}

