package com.booking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketSystemTest {

    @Test
    public void testRegularNoDiscount() {
        // 3 tickets * $50 = $150
        assertEquals(150.0, TicketSystem.calculateTotalCost("regular", 3));
    }

    @Test
    public void testVipWithDiscount() {
        // 5 tickets * $200 = $1000 -> 10% discount = $900
        assertEquals(900.0, TicketSystem.calculateTotalCost("vip", 5));
    }
}
