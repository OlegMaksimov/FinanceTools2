package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class DepositTest {

    Deposit deposit;

    @BeforeEach
    void setUp() {
        deposit = new Deposit();
        deposit.setName("deposit1");
        deposit.setR(0.08);
        deposit.setPrice(100.00);
        deposit.setSaveCountYear(1);
    }

    @Test
    void getFutureValue() {
        Double futureValue = deposit.getFutureValue();
        assertEquals(108.00,futureValue);
    }

    @Test
    void getNPV() {
        Double futureValue = deposit.getFutureValue();
        Double NPV = deposit.getNPV(futureValue);
        assertEquals(8.00,NPV);
    }

}