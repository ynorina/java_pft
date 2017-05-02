package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jnorina on 2/05/2017.
 */
@Test
public class PointsTests {
    public void TestDistance(){
        Point point1 = new Point(15,78);
        Point point2 = new Point(9, 70);
        Assert.assertEquals(point1.distance(point2),10.0);
    }
    public void TestDistance2(){
        Point point1 = new Point(56,49);
        Point point2 = new Point(44, 33);
        Assert.assertEquals(point1.distance(point2),20.0);
        }
    public void TestDistance3() {
        Point point1 = new Point(219, 992);
        Point point2 = new Point(201, 1016);
        Assert.assertEquals(point1.distance(point2),30.0);
    }
}
