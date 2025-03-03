import java.util.Scanner; 


public class Strings {
 
  public static void main(String[] args)
  {  
   
    Scanner sc=new Scanner(System.in);
   
        
    String Mymessage ="Hello world";
    String Mymessageone ="rabee";
    System.out.println(Mymessage.length()); 
    System.out.println(Mymessage.toUpperCase());
    System.out.println(Mymessage.toLowerCase());
    System.out.println(Mymessage.concat(Mymessageone));
    
    
    System.out.println("Two Numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Greatest number:"+Math.max(a,b));
    System.out.println("Smallest number:"+Math.min(a,b));
    System.out.println("SQRT:"+Math.sqrt(a));
    System.out.println("absolute:"+Math.abs(a));
    System.out.println(Math.random()*1000);
    
      
    

  
  }



}  
 
