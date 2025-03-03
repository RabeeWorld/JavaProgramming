class Animal{

String type;
int legs;
boolean wings;


void display(String Animalname)
{
  System.out.println("Animal:"+Animalname);
  System.out.println(type);
  System.out.println(legs);
  System.out.println(wings);


}

  
  public static void main(String[] args)
  {
  
 Animal tiger=new Animal();
 Animal crow=new Animal();
 
 tiger.type="carnivores";
 tiger.legs=4;
 tiger.wings=false;
 crow.type="omnivores";
 crow.legs=2;
 crow.wings=true;
 
 tiger.display("Tiger");
 crow.display("Crow");


  }

}
