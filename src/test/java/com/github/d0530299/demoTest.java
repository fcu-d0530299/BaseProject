package com.github.d0530299;

import org.junit.Test;
import org.junit.Assert;


import static org.junit.Assert.*;

public class demoTest {
    @Test
    public void getType() throws Exception {
        demo triange = new demo(5,10,5);
        String result = triange.getType();

        Assert.assertEquals("不是三角形",result);
    }

}
