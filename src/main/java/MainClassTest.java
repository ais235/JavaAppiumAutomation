import org.junit.Test;
import org.junit.Assert;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        //System.out.println(this.getLocalNumber());
        Assert.assertTrue("getLocalNumber != 14", this.getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber()
    {
        //System.out.println(this.getClassNumber());
        Assert.assertTrue("getClassNumber <= 45", this.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString()
    {
        //System.out.println(this.getClassString());
        Assert.assertTrue("Строка не содержит 'hello' или 'Hello'", this.getClassString().contains("hello") || this.getClassString().contains("Hello"));
    }
}
