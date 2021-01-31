package chapter6;

public class PhoneBill {
    private int ID;
    private int allottedMinutes;
    private int minutesUsed;
    private double baseCost;

    public PhoneBill(){
        ID = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }
    public PhoneBill(int id){
        this.ID = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }
    public PhoneBill(int id, double basecost, int allottedMinutes , int minutesUsed){
        this.ID = id;
        this.baseCost = basecost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }
    public int getID(){
        return ID;
    }
    public void setID(int id){
        this.ID = id;
    }
    public int getAllottedMinutes(){
        return allottedMinutes;
    }
    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }
    public int getMinutesUsed(){
        return minutesUsed;
    }
    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }
    public double getBaseCost(){
        return baseCost;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    public double calculateOverage(){
        if(minutesUsed <= allottedMinutes){
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = minutesUsed - allottedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + ID);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }
}
