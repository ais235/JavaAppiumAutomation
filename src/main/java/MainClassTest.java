import org.junit.Test;
import org.junit.Assert;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        System.out.println("getLocalNumber = " + this.getLocalNumber());
        Assert.assertTrue("getLocalNumber != 14", this.getLocalNumber() == 14);
    }

}
