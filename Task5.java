package com.GroupTasks;



public class Task5 {
}

class FirefoxDriver implements WebDriver, RemoteWebDriver, TakesScreenshot {
    @Override
    public void open() {
        System.out.println("Firefox opens");
    }
    @Override
    public void close() {
        System.out.println("Firefox closes");
    }
    @Override
    public String getTitle() {
        String title = "google.com";
        return title;
    }
    @Override
    public void navigate() {
        System.out.println("Navigating to Wp.pl...");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Saving screenshot of the webpage...");
    }
}
class ChromeDriver implements WebDriver, RemoteWebDriver, TakesScreenshot {
    @Override
    public void open() {
        System.out.println("Chrome opens");
    }
    @Override
    public void close() {
        System.out.println("Chrome closes");
    }
    @Override
    public String getTitle() {
        String title = "google.com";
        return title;
    }
    @Override
    public void navigate() {
        System.out.println("Navigating to Onet.pl...");
    }
    @Override
    public void getScreenshot() {
        System.out.println("Saving screenshot of the webpage...");
    }
}
class SafariDriver implements WebDriver, RemoteWebDriver, TakesScreenshot {
    @Override
    public void open() {
        System.out.println("Safari opens");
    }
    @Override
    public void close() {
        System.out.println("Safari closes");
    }
    @Override
    public String getTitle() {
        String title = "google.com";
        return title;
    }
    @Override
    public void navigate() {
        System.out.println("Navigating to interia.pl...");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Saving screenshot of the webpage...");
    }
}
interface RemoteWebDriver {
void navigate();
}
interface TakesScreenshot extends RemoteWebDriver {
    void getScreenshot();
}
interface WebDriver extends RemoteWebDriver, TakesScreenshot {
    void open();
    void close();
    String getTitle();
}
class Tester1 {
    public static void main(String[] args) {
        WebDriver browserChrome = new ChromeDriver();
        WebDriver browserFirefox = new FirefoxDriver();
        WebDriver browserSafari = new SafariDriver();

        WebDriver[] browsers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

        for (WebDriver Run : browsers) {
            Run.open();
            Run.getTitle();
            Run.navigate();
            Run.getScreenshot();
            Run.close();
            System.out.println();
        }

    }
    }




