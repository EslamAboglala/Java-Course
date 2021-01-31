package chapter6;

public class PhoneBillCalculator {
    public static void main(String args[]){
        PhoneBill bill = new PhoneBill(12345);
        bill.setMinutesUsed(1000);
        bill.printItemizedBill();
    }
}
