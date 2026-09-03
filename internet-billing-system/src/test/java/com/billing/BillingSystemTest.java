package com.billing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillingSystemTest {

    @Test
    public void testBasicPlanWithinLimit() {
        assertEquals(20.0, BillingSystem.calculateBill("basic", 8.0));
    }

    @Test
    public void testBasicPlanExceedingLimit() {
        assertEquals(24.0, BillingSystem.calculateBill("basic", 12.0));
    }
}
