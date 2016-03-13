### Problem description

Create a simple bank application with the following features:

- Deposit into Account
- Withdraw from the Account
- Print a statement of the Account to the console

## Acceptance criteria

Statement should have transactions in the following format:

>   DATE       | AMOUNT  | BALANCE
>   10/04/2014 | 500.00  | 1400.00
>   02/04/2014 | -100.00 | 900.00
>   01/04/2014 | 1000.00 | 1000.00

## Start with a class like this

package company.tothepoint.bankkata;

public class Account {

    public void deposit(int amount);

    public void withdraw(int amount);

    public void printStatement();
}