package com.example;

import org.testng.Assert;
import org.testng.annotations.*;

public class HelloWorldTest {

    private String message;

    @BeforeClass
    public void setUp() {
        message = "Hello, World!";
        System.out.println("Test Setup: Initializing test data");
    }

    @AfterClass
    public void tearDown() {
        message = null;
        System.out.println("Test Teardown: Cleaning up test data");
    }

    @Test(description = "Test case 1: Verify message is not null")
    public void testMessageNotNull() {
        Assert.assertNotNull(message, "Message should not be null");
        System.out.println("Test 1 PASSED: Message is not null");
    }

    @Test(description = "Test case 2: Verify message content")
    public void testMessageContent() {
        Assert.assertEquals(message, "Hello, World!", "Message content should match expected string");
        System.out.println("Test 2 PASSED: Message content matches");
    }

    @Test(description = "Test case 3: Verify message length")
    public void testMessageLength() {
        Assert.assertTrue(message.length() > 0, "Message length should be greater than 0");
        Assert.assertEquals(message.length(), 13, "Message length should be 13 characters");
        System.out.println("Test 3 PASSED: Message length is correct");
    }

    @Test(description = "Test case 4: Verify message contains specific substring")
    public void testMessageContainsSubstring() {
        Assert.assertTrue(message.contains("World"), "Message should contain 'World'");
        Assert.assertTrue(message.contains("Hello"), "Message should contain 'Hello'");
        System.out.println("Test 4 PASSED: Message contains expected substrings");
    }
}
