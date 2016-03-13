package feature;

import company.tothepoint.bankkata.Account;
import company.tothepoint.bankkata.Console;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.security.auth.login.AccountException;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PrintStatementFeature {

    @Mock Console console;
    private Account account;

    @Before
    public void initialize() {
        account = new Account();
    }

    @Test public void
    print_statement_containing_all_transactions() {

        account.deposit(1000);
        account.withdraw(100);
        account.deposit(500);

        account.printStatement();

        InOrder inOrder = inOrder(console);
        inOrder.verify(console).println("DATE | AMOUNT | BALANCE");
        inOrder.verify(console).println("10/04/2014 | 500.00 | 1400.00");
        inOrder.verify(console).println("02/04/2014 | -100.00 | 900.00");
        inOrder.verify(console).println("01/04/2014 | 1000.00 | 1000.00");
    }



}
