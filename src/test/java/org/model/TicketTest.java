package org.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TicketTest {
    Ticket ticket;

    @BeforeEach
    void setUp() {
        ticket = new Ticket(12, 12);
    }

    @Test
    void testCostruttore() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-5, -5));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(0, 0));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(100, 0));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(0, 50));
    }

    @Test
    void calcolaPrezzoBase() {
        assertEquals(21, ticket.calcolaPrezzoBase(100));
        assertThrows(IllegalArgumentException.class, () -> ticket.calcolaPrezzoBase(0));
    }

    @Test
    void calcolaPrezzoJunior() {
        assertEquals(16.80, ticket.calcolaPrezzoJunior(100, 17));
        assertThrows(IllegalArgumentException.class, () -> ticket.calcolaPrezzoJunior(100, 20));
        assertThrows(IllegalArgumentException.class, () -> ticket.calcolaPrezzoJunior(0, 16));
    }

    @Test
    void calcolaPrezzoSenior() {
        assertEquals(12.60, ticket.calcolaPrezzoSenior(100, 70));
        assertThrows(IllegalArgumentException.class, () -> ticket.calcolaPrezzoSenior(100, 50));
        assertThrows(IllegalArgumentException.class, () -> ticket.calcolaPrezzoSenior(0, 70));
    }
}