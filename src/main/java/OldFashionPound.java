import dataobjects.Pound;

public class OldFashionPound {

  public static void main(String[] args) {
    System.out.println("Hello world");

    Pound myFirstPound = new Pound(5, 17, 8);
    Pound secondPound = new Pound(3, 4, 10);
    System.out.println( myFirstPound.getTotalValue());
    System.out.println( secondPound.getTotalValue());


    Pound mySumResult = makeSum(myFirstPound, secondPound);
    System.out.println(mySumResult);
    Pound myDiffResult = makeDiff(myFirstPound, secondPound);
    System.out.println(myDiffResult);

    Pound myMultiplyResult = multiply(myFirstPound, 2);
    System.out.println(myMultiplyResult);

    Pound myDivisionResult = divide(myFirstPound, 3);
    System.out.println(myDivisionResult);

  }

  public static Pound makeSum(Pound firstPound, Pound secondPound) {

    int myTotal = firstPound.getTotalValue() + secondPound.getTotalValue();
    System.out.println(myTotal);
    return new Pound(myTotal);

  }



  public static Pound makeDiff(Pound firstPound, Pound secondPound) {

    int myTotal = firstPound.getTotalValue() - secondPound.getTotalValue();
    System.out.println(myTotal);
    return new Pound(myTotal);

  }

  public static Pound multiply(Pound firstPound, int value) {

    int myTotal = firstPound.getTotalValue() * value;
    System.out.println(myTotal);
    return new Pound(myTotal);

  }

  public static Pound divide(Pound firstPound, int value) {

    int myTotal = firstPound.getTotalValue() / value;
    System.out.println(myTotal);
    return new Pound(myTotal);

  }

}