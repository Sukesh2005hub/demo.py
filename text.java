public class Co {
  public Co (){
     
    System.out.println("constructor with empty parameter");
  }
  public Co
    System.out.println("constructor with a "+a);
  }
  public Co(float a, int c){
     System.out.println("constructor with a "+a +" "+c);
  }
public Co(int c,int a){
  System.out.println("Constructor with a "+a +" "+c);
}
public static void main(String[] args) {
  new Co();
  new Co(2f,7);
  new Co(4,8);
  new Co(3);
