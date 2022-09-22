package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ProgrammingLanguages\\JAVA\\SeleniumLab\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.youtube.com");
		driver.manage().window().maximize();
		WebElement search_tab=driver.findElement(By.name("search_query"));
		search_tab.sendKeys("Love O2O");
		WebElement search_button=driver.findElement(By.id("search-icon-legacy"));
		search_button.click();
		Thread.sleep(3000);
		WebElement list_button=driver.findElement(By.id("view-more"));
		list_button.click();
		Thread.sleep(3000);
		WebElement video_button=driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-playlist-video-list-renderer/div[3]/ytd-playlist-video-renderer[1]/div[2]/div[1]/ytd-thumbnail/a/yt-img-shadow/img"));
		video_button.click();
		Thread.sleep(5000);
		WebElement play_b=driver.findElement(By.id("ytd-player"));
		play_b.click();
		//driver.close();
	}

}
