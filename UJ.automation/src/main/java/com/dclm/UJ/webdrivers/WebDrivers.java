	package com.dclm.UJ.webdrivers;
	
	import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
	
	public class WebDrivers {
	    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	
		public static WebDriver setDriver(BrowserType browserType,String URL) {
			
			Driver drivers= new Driver();
			
	
			//WebDriver driver = null;
			switch (browserType) {
			case CHROME:
				driver.set(drivers.ChromeDriver(URL));
				//driver = drivers.ChromeDriver(URL);
				break;
			case FIREFOX:
				driver.set( drivers.FirefoxDriver(URL));
				break;
			case EDGE:
				driver.set(drivers.EdgeDriver(URL));
				break;
	
			default:
				System.out.println("Unsupported browser type: " + browserType);
	
			}
	
			return driver.get();
	
		}
		
		public void quitDriver() {
			if (driver.get() != null) {
				try {
					//driver.get().close();;
					driver.get().quit();; // fails in current geckodriver! TODO: Fixme
				} catch (NoSuchMethodError nsme) { // in case quit fails
				} catch (NoSuchSessionException nsse) { // in case close fails
				} catch (SessionNotCreatedException snce) {
				} // in case close fails
				driver = null;
			}

		}
		
	
		
	
	}
