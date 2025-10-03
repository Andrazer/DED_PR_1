package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import edu.uoc.ds.adt.PR1Aux;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1QueueTest {
    PR1Queue pr1q;

    private void fillQueue() {

        int i = 2;

        while (pr1q.getQueue().size() < pr1q.CAPACITY) {

            if (PR1Aux.isPrimo(i)) {
                pr1q.add(i);
            }

            i++;
        }
    }

    @Before
    public void setUp() {
        this.pr1q = new PR1Queue();

        assertNotNull(this.pr1q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void queueTest() {
        assertEquals(this.pr1q.CAPACITY, this.pr1q.getQueue().size());
        Assert.assertEquals(2, (int) pr1q.poll());
        Assert.assertEquals(3, (int) pr1q.poll());
        Assert.assertEquals(5, (int) pr1q.poll());
        Assert.assertEquals(7, (int) pr1q.poll());
        Assert.assertEquals(11, (int) pr1q.poll());
        Assert.assertEquals(13, (int) pr1q.poll());
        Assert.assertEquals(17, (int) pr1q.poll());
        Assert.assertEquals(19, (int) pr1q.poll());
        Assert.assertEquals(23, (int) pr1q.poll());
        Assert.assertEquals(29, (int) pr1q.poll());
        Assert.assertEquals(31, (int) pr1q.poll());
        Assert.assertEquals(37, (int) pr1q.poll());
        Assert.assertEquals(41, (int) pr1q.poll());
        Assert.assertEquals(43, (int) pr1q.poll());
        Assert.assertEquals(47, (int) pr1q.poll());
        assertEquals(0, this.pr1q.getQueue().size());
    }

}
