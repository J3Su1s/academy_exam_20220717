package dataobjects;

public class Pound {

    private int poundValue;
    private int shillingValue;
    private int penceValue;



    public Pound(int poundValue, int shillingValue, int penceValue) {
        this.poundValue = poundValue;
        this.shillingValue = shillingValue;
        this.penceValue = penceValue;
    }


    public Pound(int myTotalValue){
        poundValue = myTotalValue/240;
        myTotalValue = myTotalValue%240;
        shillingValue = myTotalValue/12;
        penceValue = myTotalValue%12;

    }

    public int getPoundValue() {
        return poundValue;
    }

    public int getShillingValue() {
        return shillingValue;
    }

    public int getPenceValue() {
        return penceValue;
    }

    public int getTotalValue() {
        return poundValue * 240 + shillingValue * 12 + penceValue;
    }

    public void rightFormat() {};


    @Override
    public String toString() {
        return "Pound{" +
                "poundValue=" + poundValue +
                ", shillingValue=" + shillingValue +
                ", penceValue=" + penceValue +
                '}';
    }

}