package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemainFor999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainFor1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainFor1500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }
}