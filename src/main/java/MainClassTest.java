import org.junit.Test;
import org.junit.Assert;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        Assert.assertTrue("getLocalNumber != 14", this.getLocalNumber() == 14);
    }

}
