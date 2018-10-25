package com.youma;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * AA Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十月 23, 2018</pre>
 */
public class AATest {

    @Before
    public void before() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void after() throws Exception {
        System.out.println("测试结束");
    }

    /**
     * Method: and(int a, int b)
     */
    @Test
    public void testAnd() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertEquals(16, new AA().and(10, 6));
        Assert.assertEquals(20, new AA().and(14, 6));
        Assert.assertEquals(0, new AA().and(0, 0));

    }

    /**
     * Method: sub(int a, int b)
     */
    @Test
    public void testSub() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertEquals(4, new AA().sub(10, 6));
    }

    /**
     * Method: mult(int a, int b)
     */
    @Test
    public void testMult() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertEquals(60, new AA().mult(10, 6));
    }

    /**
     * Method: div(int a, int b)
     */
    @Test
    public void testDiv() throws Exception {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertEquals(2, new AA().div(12, 6));
    }


} 
