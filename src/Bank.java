import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchList = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(Branch branch){
        if (branch.getName() == null || branch.getBranchAddr() == null) {
            System.out.println("Branch name and/or address cannot be null");
            return false;
        }
        branchList.add(branch);
        return true;
    }

    public static void main(String[] args) {
        Bank bank = new Bank("HDFC Bank");
        Branch branch = new Branch("Kasturba Road","Bangalore");
        bank.addBranch(branch);

        Customer customer = new Customer("Debarun",5000.00);
        System.out.println("After customer object was initialized !!");
        System.out.println("Name:  "+ customer.getName()+" Initial Amount: "+customer.getInitAmount());
        if (branch.addCustomer(customer)){
            System.out.println("Customer "+customer.getName()+" was added successfully");
        }
        customer.addTransaction(-1000.0);
        customer.addTransaction(1500.0);
        branch.getCustomerList();

        Customer customer2 = new Customer("Troyee",-4000.00);
        if (branch.addCustomer(customer2)){
            System.out.println("Customer "+customer2.getName()+" was added successfully");
        }
        customer2.addTransaction(-1000.0);
        customer2.addTransaction(3500.0);
        branch.getCustomerList();

    }
}
