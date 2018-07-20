package io.alfredux.coverage;

import org.junit.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddOperation() {
        Assert.assertEquals(calculator.add(1,1),2);
    }

}
