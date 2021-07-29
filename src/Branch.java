import java.util.ArrayList;

public class Branch {
    private String name;
    private String branchAddr;
    private ArrayList<Customer> customerList = new ArrayList<>();

    public Branch(String name, String branchAddr) {
        this.name = name;
        this.branchAddr = branchAddr;
    }

    public String getName() {
        return name;
    }

    public String getBranchAddr() {
        return branchAddr;
    }

    public boolean addCustomer(Customer customer){
        if (customer.getName() == null || customer.getInitAmount() <=0.0){
            System.out.println("Cannot add a customer with no name OR with zero/negative transaction amount");
            return false;
        } else {
            customerList.add(customer);
            System.out.println("Added customer " + customer.getName() + " successfully");
            return true;
        }
    }

    public void getCustomerList() {

        for (int i=0;i<customerList.size();i++){
            System.out.println("Name: "+customerList.get(i).getName());
            double balanceAmount = 0.0;
            Customer myCustomer = customerList.get(i);
            for (int j=0;j<(myCustomer.getTransactionAmount()).size();j++){
                balanceAmount += myCustomer.getTransactionAmount().get(j);
            }
            System.out.println("Balance Amount: "+balanceAmount);
        }

    }
}
