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
@AllArgsConstructor
@NoArgsConstructor
public class CheckingAccount extends BankAccount{
    private Double overdraftAllowed;
    public CheckingAccount(Integer accountNumber, Double overdraftAllowed) {
        super(accountNumber, 0.0);
        this.overdraftAllowed = overdraftAllowed;
    }
    @Override
    public void withdraw(Double amount) {
        if (amount <= this.balance + overdraftAllowed) {
            this.balance -= amount;
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }
    
}
