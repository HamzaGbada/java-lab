/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.eniso.session4.exercice1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author bobmarley
 */
@Getter
@Setter
public class SavingsAccount extends BankAccount{
    private Double interestRate;
    public SavingsAccount(Integer accountNumber, Double interestRate) {
        super(accountNumber, 0.0);
        this.interestRate = interestRate;
    }
    public void calculateInterest() {
        this.balance += this.balance * (this.interestRate / 100);
    }

    @Override
    public void withdraw(Double amount) {

        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
