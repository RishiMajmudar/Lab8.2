package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.EmptyStackException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public class MyStackTest {

        public void testPush() {
            MyStack<Integer> stack = new MyStack<>();
            stack.push(1);
            assertEquals(Integer.valueOf(1), stack.pop());
            assertTrue(stack.isEmpty());
        }

        public void testPushMultiple() {
            MyStack<Integer> stack = new MyStack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            assertEquals(Integer.valueOf(3), stack.pop());
            assertEquals(Integer.valueOf(2), stack.pop());
            assertEquals(Integer.valueOf(1), stack.pop());
            assertTrue(stack.isEmpty());
        }

        public void testPopEmptyStack() {
            MyStack<Integer> stack = new MyStack<>();
            stack.pop();
        }
    }

}
