package com.cyclokitty;

public class Main {

    public static void main(String[] args) {
	    // Your job is to create a simple banking application
        // There should a bank class
        // It should have an arraylist of branches
        // Each branch should have an arraylist of customers
        // The Customer class should have an arraylist of Double (transactions)
        // Customer:
        // name, and the Arraylist of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transactions
        // Add a transaction for an existing custormer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // Of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: transactions
        // Add data validation
        // eg. check if exists or does not exist etc.
        // Think about where you are adding the code to perform certain actions

        Customer laura = new Customer("Laura");
        System.out.println(laura.getName() + " balance: $" + laura.getBalance());

        Branch northToronto = new Branch("North Toronto");
        System.out.println("New Branch: " + northToronto.getBranchNames());
        northToronto.newCustomerThisBranch(laura);

        System.out.println("here are the customer for branch " + northToronto.getBranchNames() +
        ": ");
        for (Customer customer : northToronto.getBranchCustomers()) {
            System.out.println(customer.getName() + ", " + customer.getBalance());
        }

        System.out.println(northToronto.makeDeposit(laura, 100));
        System.out.println(northToronto.makeWithdrawal(laura, 50));
        System.out.println(northToronto.makeDeposit(laura, 10000));
        System.out.println(northToronto.makeWithdrawal(laura,11000));

        System.out.println("here are the customers for branch " + northToronto.getBranchNames() +
                ": ");
        for (Customer customer : northToronto.getBranchCustomers()) {
            System.out.println(customer.getName() + ", " + customer.getBalance());
        }

    }


}
