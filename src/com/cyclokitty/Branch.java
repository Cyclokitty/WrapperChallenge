package com.cyclokitty;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> branchCustomers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.branchCustomers = new ArrayList<Customer>();
    }

    public String getBranchNames() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    public void newCustomerThisBranch(Customer customer) {
        this.branchCustomers.add(customer);
    }

    public String makeDeposit(Customer customer, double amt) {
        if (amt > 0.0) {
            customer.setBalance(amt + customer.getBalance());
            return customer.getName() + " new balance: " + customer.getBalance();
        } else {
            System.out.println("The deposit amt must be greater than 0. Try again.");
        }
        return "Transaction not completed.";
    }

    public String makeWithdrawal(Customer customer, double amt) {
        if ((customer.getBalance() - amt) >= 0) {
            customer.setBalance(customer.getBalance() - amt);
            return customer.getName() + " new balance: " + customer.getBalance();
        }  else {
            System.out.println("Insufficient funds. Try again.");
        }
        return "Transaction not completed.";
    }
}
