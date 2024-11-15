import org.example.UtilHello;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void test1() {
        new UtilHello().utilHelloMethod("App module test 1");
    }

    @Test
    public void test2() {
        Assert.assertTrue("App dump", true);
    }
}
