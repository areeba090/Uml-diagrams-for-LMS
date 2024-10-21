public class Bill {
    private int amount;

    public Bill(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void payBill(int amountPaid) {
        if (amountPaid >= amount) {
            amount = 0;
            System.out.println("Bill Paid in Full.");
        } else {
            amount -= amountPaid;
            System.out.println("Remaining Balance: " + amount);
        }
    }
}