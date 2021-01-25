package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void zeroAmount() {
        int actual = cashbackHackService.remain(0);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void boundaryAmount() {
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void lessThenBoundaryAmount(){
        int actual = cashbackHackService.remain(700);
        int expected = 300;
        assertEquals(actual, expected);
    }

    @Test
    public void moreThenBoundaryAmount(){
        int actual = cashbackHackService.remain(10800);
        int expected = 200;
        assertEquals(actual, expected);
    }
}