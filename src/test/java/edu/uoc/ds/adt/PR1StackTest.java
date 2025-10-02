package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1StackTest {

    PR1Stack pr1q;

    private void fillStack() {

        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

        for (int i : primos) {
            pr1q.push(i);
        }
    }

    @Before
    public void setUp() {
        this.pr1q = new PR1Stack();

        assertNotNull(this.pr1q.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void stackTest() {

        assertEquals(this.pr1q.CAPACITY, this.pr1q.getStack().size());
        Assert.assertEquals(47, (int) pr1q.pop());
        Assert.assertEquals(43, (int) pr1q.pop());
        Assert.assertEquals(41, (int) pr1q.pop());
        Assert.assertEquals(37, (int) pr1q.pop());
        Assert.assertEquals(31, (int) pr1q.pop());
        Assert.assertEquals(29, (int) pr1q.pop());
        Assert.assertEquals(23, (int) pr1q.pop());
        Assert.assertEquals(19, (int) pr1q.pop());
        Assert.assertEquals(17, (int) pr1q.pop());
        Assert.assertEquals(13, (int) pr1q.pop());
        Assert.assertEquals(11, (int) pr1q.pop());
        Assert.assertEquals(7, (int) pr1q.pop());
        Assert.assertEquals(5, (int) pr1q.pop());
        Assert.assertEquals(3, (int) pr1q.pop());
        Assert.assertEquals(2, (int) pr1q.pop());
        assertEquals(0, this.pr1q.getStack().size());
    }
}
