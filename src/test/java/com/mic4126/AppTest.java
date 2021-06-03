package com.mic4126;



/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest 
{
    // Test can run with `mvn -Dtest=AppTest clean test`
    // but cannot start by the test runner extension.
    @Override
    void specificBehavior() {
        System.out.println("Specific Behavior done");
    }
    

}
