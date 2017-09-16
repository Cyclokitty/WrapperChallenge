package com.cyclokitty;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private ArrayList<Customer> customers;

    public Bank(ArrayList<Branch> branches, ArrayList<Customer> customers) {
        this.branches = new ArrayList<Branch>();
        this.customers = new ArrayList<Customer>();
    }
}
