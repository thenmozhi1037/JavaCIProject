package com.lnt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testCalculateTotal() {
        assertEquals(300.0, App.calculateTotal(100.0, 3));
    }
}