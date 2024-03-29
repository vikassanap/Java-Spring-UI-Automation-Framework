package com.project.qa.ui.runners;

import com.project.qa.core.webdriver.WebDriverManager;
import com.project.qa.ui.pageobjects.PageObjectManager;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Vikas S.
 * @since : 05-06-2019, Wed
 **/
public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;
    private Map<String, Object> keyObjectMap;

    public TestContext() {
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager();
        keyObjectMap = new HashMap<String, Object>();
    }

    /**
     * Method to get web driver manager class instance
     *
     * @return web driver manager class instance
     */
    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    /**
     * Method to get page object manager class instance
     *
     * @return page object manager class instance
     */
    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    /**
     * Method to get key, value map
     *
     * @return key, value map
     */
    public Map<String, Object> getKeyObjectMap() {
        return keyObjectMap;
    }
}
