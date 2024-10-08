package Pages;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.options.WaitForSelectorState;

import static org.junit.Assert.assertEquals;

public class PlayWright_Scenarios {
        protected static Playwright playwright = Playwright.create();
        protected static BrowserType chrome = playwright.chromium();
        //protected static BrowserType fire = playwright.firefox();
        protected static Browser browser = chrome.launch(new BrowserType.LaunchOptions().setHeadless(false));
        //protected static Browser browser = fire.launch(new BrowserType.LaunchOptions().setHeadless(true));
        protected static Page page = browser.newPage();

        public static void launchApp() {

            page.navigate("https://playwright.dev/");
            page.setViewportSize(1280, 900);
        }
    public static void SelectElementFromDropDown(){
        // Hover over the element
           Locator ele = page.locator("//a[@href = '#']");
           ele.hover();
        // Wait for the dropdown option to be visible
            Locator dropdown = page.locator("//a[@href = '/java/']");
            dropdown.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
            dropdown.click();
        }
        public static void SearchElement() {
            // Click on the search button
//            page.waitForTimeout(2000);
//             page.locator("//*[@class='DocSearch DocSearch-Button' and @type='button']").click();
//             page.locator("//*[@class='DocSearch DocSearch-Button' and @type='button']").click();
//             page.waitForTimeout(4000);
            page.waitForTimeout(2000);
            page.locator("//*[@class='DocSearch DocSearch-Button' and @type='button']").click();
            page.waitForTimeout(2000);
        }
        public static void InputString() {
                // Enter "Locators" in the search input
                page.locator("//input[@id ='docsearch-input']").fill("Locators");
                page.waitForTimeout(2000);
                // Wait for the search results and click the first result
                page.locator("//div[@class='DocSearch-Hit-icon']").first().click();
                page.waitForTimeout(4000);
        }

        public static void QuitBrowser() {
            // Optionally, wait for the new page to load
            page.waitForLoadState(LoadState.DOMCONTENTLOADED);
            page.close();

        }
    }

