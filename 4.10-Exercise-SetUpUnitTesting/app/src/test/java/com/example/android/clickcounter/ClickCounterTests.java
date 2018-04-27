package com.example.android.clickcounter;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


/**
 * Created by feder on 27/04/2018.
 */

public class ClickCounterTests {

    private ClickCounter clickCounter;

    @Before
    public void Initialize(){
        clickCounter = new ClickCounter();
    }

    @Test
    public void CheckIfInitialCountIsZero(){
        Assert.assertEquals(0, clickCounter.getCount());
    }

    @Test
    public void CheckIfIncrementIncreaseTheCounter(){
        clickCounter.increment();
        Assert.assertEquals(1, clickCounter.getCount());
    }
}
