import dataobjects.Pound;

public class OldFashionPound {

  public static void main(String[] args) {
    System.out.println("Hello world");

    Pound myFirstPound = new Pound(0, 0, 0);
    System.out.println( myFirstPound.toString());
    myFirstPound.rightFormat();
    System.out.println( myFirstPound.toString());

  }



}