class Test{




  int sum(int a,int b){
   
   return a+b;
  
  }
  
  int sum(int a,int b,int c)
  {
     return a+b+c;

  }
  double sum(double a,double b)
  {
     return a+b;
  
  }
  
  
  public static void main(String[] args)
  {
  
  
    Test obj1=new Test(); 
    System.out.println("sum:"+obj1.sum(10,20));
    System.out.println("sum:"+obj1.sum(10,20,30));
    System.out.println("sum:"+obj1.sum(10.5,20.5));
   
  
  }
    

}
  
  
  
  
  
  
  



















