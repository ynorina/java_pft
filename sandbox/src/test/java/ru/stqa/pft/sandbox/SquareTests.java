package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jnorina on 30/04/2017.
 */
@Test
public class SquareTests {
    public void TestArea () {
        Square s = new Square (5);
        Assert.assertEquals(s.area(),25.0);
    }



}
