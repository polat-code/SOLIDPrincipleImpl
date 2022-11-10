package com.example.solidprincipleimpl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ElectricPowerSwitchTest {

    @Test
    public void testPress() {
        Switchable switchableBulb = new LightBulb();
        Switch powerSwitch = new ElectricPowerSwitch(switchableBulb);
        powerSwitch.press();
        powerSwitch.press();


        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();

    }

}