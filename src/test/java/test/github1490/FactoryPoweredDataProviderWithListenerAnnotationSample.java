package test.github1490;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LocalDataProviderListener.class)
public class FactoryPoweredDataProviderWithListenerAnnotationSample {
    private int i;

    @Factory(dataProvider = "dp")
    public FactoryPoweredDataProviderWithListenerAnnotationSample(int i) {
        this.i = i;
    }

    @Test
    public void testMethod() {
        Assert.assertTrue(i > 0);
    }

    @DataProvider(name = "dp")
    public static Object[][] getData() {
        return new Object[][]{
                {1},
                {2}
        };
    }
}
