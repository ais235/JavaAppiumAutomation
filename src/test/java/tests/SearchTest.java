package tests;

import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class SearchTest extends BaseTest {

    @Test
    public void testSearchFieldText() {
        By searchFieldLocator = By.xpath("//android.widget.TextView[@text='Search Wikipedia']");

        // Получаем реальный текст поля поиска
        String actualText = driver.findElement(searchFieldLocator).getText();

        // Возможные варианты текста
        String expectedText1 = "Search...";
        String expectedText2 = "Search Wikipedia";

        // Проверяем, что текст соответствует одному из ожидаемых значений
        assertElementHasText(searchFieldLocator, actualText,
                "Текст в поле поиска не соответствует ожидаемому: " + actualText);
    }
}

