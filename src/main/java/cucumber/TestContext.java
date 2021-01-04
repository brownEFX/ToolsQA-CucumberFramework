package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
    //Info in the Steps file (excl fileReaderManager)
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;

    //Constructor Class
    public TestContext(){
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
    }
    //Getter
    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
