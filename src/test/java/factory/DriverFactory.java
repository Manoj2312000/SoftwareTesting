package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initializeBrowser(String browserName) {
        String runMode = System.getProperty("runMode", "local"); // local or grid

        try {
            if (runMode.equalsIgnoreCase("grid")) {
                // Selenium Grid URL
                URL gridUrl = new URL("http://localhost:4444/wd/hub");

                if (browserName.equalsIgnoreCase("chrome")) {
                    ChromeOptions chromeOptions = new ChromeOptions();
                   // chromeOptions.addArguments("--headless= new");
                    chromeOptions.addArguments("--incognito", "--disable-popup-blocking");
                    driver.set(new RemoteWebDriver(gridUrl, chromeOptions));

                } else if (browserName.equalsIgnoreCase("firefox")) {
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                   // firefoxOptions.addArguments("--headless = new");
                    driver.set(new RemoteWebDriver(gridUrl, firefoxOptions));

                } else if (browserName.equalsIgnoreCase("edge")) {
                    EdgeOptions edgeOptions = new EdgeOptions();
                    driver.set(new RemoteWebDriver(gridUrl, edgeOptions));
                } else {
                    throw new IllegalArgumentException("Unsupported browser: " + browserName);
                }

            } else {
                // Run locally
                if (browserName.equalsIgnoreCase("chrome")) {
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--incognito", "--disable-popup-blocking");
                    driver.set(new ChromeDriver(options));

                } else if (browserName.equalsIgnoreCase("firefox")) {
                    driver.set(new FirefoxDriver());

                } else if (browserName.equalsIgnoreCase("edge")) {
                    driver.set(new EdgeDriver());

                } else {
                    throw new IllegalArgumentException("Unsupported browser: " + browserName);
                }
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid Grid URL", e);
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}


 /*   // ThreadLocal ensures separate WebDriver instance per thread
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initializeBrowser(String browserName) {
        WebDriver webDriver = null;

        if (browserName.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--remote-allow-origins=*");
            webDriver = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            webDriver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            webDriver = new EdgeDriver();
        }

        driver.set(webDriver);
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}



/*
 package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {
		
	
		static WebDriver driver = null;
		
		public static void initializeBrowser(String browserName) {
			
			if (browserName.equals("chrome")) {
				
				driver = new ChromeDriver();
				
			}else if (browserName.equals("firefox")) {
				
				driver = new FirefoxDriver();
				
			}else if(browserName.equals("edge")) {
				
				driver = new EdgeDriver();
				
			}
		}
		
		public static WebDriver getDriver () {
			
			return driver;
		}

}
Without ThreadLocal

*Thread 1 --> uses driver
Thread 2 --> uses same driver  <-- CRASH!
Thread 3 --> also uses same driver  <-- CHAOS!

With ThreadLocal

Thread 1 --> driver-1
Thread 2 --> driver-2
Thread 3 --> driver-3
(All isolated — no conflicts)


 */
