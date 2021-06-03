package com.mic4126;

import org.testng.annotations.Test;

public abstract class BaseTest{

    abstract void specificBehavior();
    

    @Test
    public void test_one(){
        specificBehavior();
    }

}