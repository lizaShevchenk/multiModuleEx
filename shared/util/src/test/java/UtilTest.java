import org.example.UtilHello;
import org.junit.Assert;
import org.junit.Test;

public class UtilTest {

    @Test
    public void utilTest1() {
        new UtilHello().utilHelloMethod("Util module test 1");
    }

    @Test
    public void test2() {
        Assert.assertTrue("Util dump", true);
    }
}
