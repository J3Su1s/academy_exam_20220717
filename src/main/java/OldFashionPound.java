import dataobjects.Pound;

public class OldFashionPound {

  public static void main(String[] args) {


    Pound myFirstPound = new Pound(5, 17, 8);
    Pound secondPound = new Pound(3, 4, 10);
    Pound myThirdPound = new Pound(5, 18, 8);

    Pound mySumResult = makeSum(myFirstPound, secondPound);
    System.out.println("Sum = " + mySumResult);

    Pound myDiffResult = makeDiff(myFirstPound, secondPound);
    System.out.println("Diff1 = " + myDiffResult);
    Pound mySecondDiffResult = makeDiff(myFirstPound, myThirdPound);
    System.out.println("Diff2 = " + mySecondDiffResult);

    Pound myMultiplyResult = multiply(myFirstPound, 2);
    System.out.println("Mult = " + myMultiplyResult);

    Pound myDivisionResult = divide(myFirstPound, 3);
    System.out.println("Div = " + myDivisionResult);

  }

  public static Pound makeSum(Pound firstPound, Pound secondPound) {

    int myTotal = firstPound.getTotalValue() + secondPound.getTotalValue();
    return new Pound(myTotal);

  }

  public static Pound makeDiff(Pound firstPound, Pound secondPound) {

    int myTotal = firstPound.getTotalValue() - secondPound.getTotalValue();
    return new Pound(myTotal);

  }

  public static Pound multiply(Pound firstPound, int value) {

    int myTotal = firstPound.getTotalValue() * value;
    return new Pound(myTotal);

  }

  public static Pound divide(Pound firstPound, int value) {

    int myTotal = firstPound.getTotalValue() / value;
    return new Pound(myTotal);

  }

}