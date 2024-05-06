/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.session4.exercice1;

import java.util.ArrayList;

/**
 *
 * @author bobmarley
 */
public class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public Double getTotalBalance() {
        Double totalBalance = 0.0;
        for (Customer customer : customers) {
            totalBalance += customer.getTotalAccountBalance();
        }
        return totalBalance;
    }
}
