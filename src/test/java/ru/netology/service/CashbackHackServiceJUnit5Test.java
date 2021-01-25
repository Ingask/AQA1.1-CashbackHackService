package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


class CashbackHackServiceJUnit5Test {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void zeroAmount() {
        int actual = service.remain(0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void boundaryAmount() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void lessThenBoundaryAmount(){
        int actual = service.remain(700);
        int expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    public void moreThenBoundaryAmount(){
        int actual = service.remain(10800);
        int expected = 200;
        assertEquals(expected, actual);
    }
}