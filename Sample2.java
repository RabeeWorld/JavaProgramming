import java.util.Scanner;

public class Sample2 {


public static void main(String[] args)
{
   Scanner scanner=new Scanner(System.in);
   System.out.println("enter 2 numbers:");
   int a=scanner.nextInt();
   int b=scanner.nextInt();
   
   while(true)
   {
     System.out.println(" 1.Addition \n 2.Sub \n 3.Multiplication \n 4.Divison \n 5.Exit \n");
     System.out.println("enter the option:");
     int opt=scanner.nextInt();
   
   switch(opt)
   {
     case 1: System.out.println("Result:"+(a+b));
             break;
     
     case 2: System.out.println("Result:"+(a-b));
             break;
 
     case 3: System.out.println("Result:"+(a*b));
             break;
     
     case 4: System.out.println("Result:"+(a/b));
             break;
             
     case 5: return;
     
     default: System.out.println("invalid");       
             
   }
   
    }  

   

   }
   
}



