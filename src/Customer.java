import java.util.ArrayList;

public class Customer {
    private String name;
    private double initAmount;
    private ArrayList<Double> transactionAmount = new ArrayList<>();

    public ArrayList<Double> getTransactionAmount() {
        return transactionAmount;
    }

    public String getName() {
        return name;
    }

    public double getInitAmount() {
        return initAmount;
    }

    public Customer(String name, double initAmount) {
        if (name == null) {
            System.out.println("Customer name cannot be null");
        } else {
            this.name = name;
            System.out.println("Name was set to "+name);
        }
        if (initAmount<=0.0){
            System.out.println("Initial transaction amount cannot be negative or zero. It needs to be a deposit");
        } else {
            this.initAmount = initAmount;
            this.addTransaction(initAmount);
            System.out.println("Initial transaction of " + initAmount + " was added");
            System.out.println("---------------------------------------------------");
        }
    }

    public boolean addTransaction(double transAmount){
        if (Double.valueOf(transAmount) == null) {
            System.out.println("Transaction Amount cannot be null");
            return false;
        }
        transactionAmount.add(transAmount);
 //       System.out.println(transAmount+" was added to the customer");
        return true;
    }
}
