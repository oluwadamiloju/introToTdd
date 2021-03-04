package bankingApplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThat_account_canBeDepositedInto(){
        //given
        Account tonIaccount = new Account();

        //when
        tonIaccount.depositMoney(2500.00);

        //assert
        double balance = tonIaccount.getAccountBalance();
        assertEquals(2500.00,balance);
    }

    @Test
    @DisplayName("Money can be deposited twice Test")
    void account_canReceiveDoubleDepositTest(){
        //given
        Account sarahAccount = new Account();
        sarahAccount.depositMoney(2500);

        //when
        sarahAccount.depositMoney(3500);

        //assert
        assertEquals(6000, sarahAccount.getAccountBalance());

    }

    @Test
    void account_cannotReceiveNegativeDepositTest(){
        //given
        Account nnennaAccount = new Account();

        //when
        nnennaAccount.depositMoney(-5896743);

        //assert
        assertEquals(0,nnennaAccount.getAccountBalance());
    }

    @Test
    void money_canBeWithdrawnFromAccountWithValidPinTest(){
        //given
        Account babasolaAccount = new Account();
        babasolaAccount.depositMoney(7000);
        babasolaAccount.setPin(1234);

        //when
        babasolaAccount.withdrawMoney(2000, 1234);

        //assert
        assertTrue(babasolaAccount.getAccountBalance()==5000);
    }

    @Test
    void money_cannotBeWithdrawnWithWrongPinTest(){
        //given
        Account graceAccount = new Account();
        graceAccount.depositMoney(7000);
        graceAccount.setPin(1234);

        //when
        graceAccount.withdrawMoney(2000, 2143);

        //assert
        assertTrue(graceAccount.getAccountBalance()==7000);
    }
}