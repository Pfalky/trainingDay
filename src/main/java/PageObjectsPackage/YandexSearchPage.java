package PageObjectsPackage;

import Common.Annotations.PageTitle;
import Common.Annotations.Title;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.logging.Logger;

import static Common.DriverPage.getDriver;

@PageTitle(name = "Страница поиска")

public class YandexSearchPage extends MainPage {

    WebDriverWait wait = new WebDriverWait(getDriver(), 10);

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  /*  WebDriver driver;*/
  /*
    public WebDriver getDriver() {
        return driver;
    }*/

    public YandexSearchPage() throws IOException {
    }


    protected void initElements() throws IOException {
        PageFactory.initElements(getDriver(), this);
    }


   @Title(value = "Поле для ввода поискового текста")
   @FindBy(xpath = "//input[@class='input__control input__input'][@tabindex='2']")
   private WebElement yandexSearchPage;

}
