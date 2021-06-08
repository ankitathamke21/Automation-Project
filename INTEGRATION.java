package IndiaGov;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class INTEGRATION
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Desktop\\Selenium Jar\\chromedriver_win32\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
		 //w.manage().window().maximize();
		 
		 w.get("https://www.india.gov.in/");
		 
		//TOPICS
		 Actions a1=new Actions(w);
		 a1.moveToElement(w.findElement(By.xpath("//span[contains(text(),'Topics')]"))).perform();
		 w.findElement(By.xpath("//header/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/ul[1]/li[7]/a[1]")).click();
		 System.out.println("Environment & Forest page is displayed");
		 
		    
		 //SCHEMES-1
		 w.findElement(By.xpath("//a[@id='quicktabs-tab-relevant_links_in-3']")).click();
		 w.findElement(By.xpath("//a[contains(text(),'Centrally Sponsored Schemes by UP Forest')]")).click();
		 System.out.println("Centrally Sponsored Schemes by UP Forest page is displayed");
		 Thread.sleep(1000);
		 JavascriptExecutor js=(JavascriptExecutor)w;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(1000);
		 js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		 //Thread.sleep(1000);
		 w.navigate().back();
		 
		 //SCHEMES-2
		 w.findElement(By.xpath("//a[@id='quicktabs-tab-relevant_links_in-3']")).click();
		 w.findElement(By.xpath("//a[contains(text(),'District Sector Scheme by UP Forest')]")).click();
		 System.out.println("District Sector Scheme by UP Forest page is displayed");
		 Thread.sleep(1000);
		 JavascriptExecutor js1=(JavascriptExecutor)w;
		 js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(1000);
		 js1.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		 //Thread.sleep(1000);
		 w.navigate().back();
		 
		 //SCHEMES-3
		 w.findElement(By.xpath("//a[@id='quicktabs-tab-relevant_links_in-3']")).click();
		 w.findElement(By.xpath("//a[contains(text(),'State Sector Scheme by UP Forest')]")).click();
		 System.out.println("State Sector Scheme by UP Forest page is displayed");
		 Thread.sleep(1000);
		 JavascriptExecutor js2=(JavascriptExecutor)w;
		 js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(1000);
		 js2.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		 w.navigate().back();
		 
		 //SCHEMES-4
		 w.findElement(By.xpath("//a[@id='quicktabs-tab-relevant_links_in-3']")).click();
		 w.findElement(By.xpath("//a[contains(text(),'Information Education and Communication Scheme')]")).click();
		 System.out.println("Information Education and Communication Scheme page is displayed");
		 Thread.sleep(1000);
		 JavascriptExecutor js3=(JavascriptExecutor)w;
		 js3.executeScript("window.scrollTo(0, 1000)");
		 Thread.sleep(1000);
		 js3.executeScript("window.scrollTo(0, -1000)");
		 Thread.sleep(1000);
		 w.navigate().back();
		 
		 //SCHEMES-5
		 w.findElement(By.xpath("//a[@id='quicktabs-tab-relevant_links_in-3']")).click();
		 w.findElement(By.xpath("//a[contains(text(),'Desert Development Programme by Department of Land')]")).click();
		 System.out.println("Desert Development Programme by Department of Land Resources page is displayed");
		 w.navigate().back();	
		 
		//OPEN DATA-1
		 w.findElement(By.xpath("//a[@id='quicktabs-tab-relevant_links_in-4']")).click();
		 w.findElement(By.xpath("//a[contains(text(),'Natural Landscape:Thane')]")).click();
		 System.out.println("Natural Landscape:Thane :");
		 
		    Set <String> win=w.getWindowHandles();
			Iterator <String> it=win.iterator();
			String pw=it.next();
			String cw=it.next();
			
			w.switchTo().window(cw);
			Thread.sleep(8000);
			
			//NATURAL LANDSCAPE-HOME
			w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/a[1]")).click();
			System.out.println("Open Data Platform:India Smart Cities");
			w.navigate().back();
			
			//NATURAL LANDSCAPE-DATA-CATALOGS
			Actions a2=new Actions(w);
			a2.moveToElement(w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/a[1]"))).perform();
			w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
			System.out.println("Catalogs page is displayed");
			w.navigate().back();
			
			//NATURAL LANDSCAPE-DATA-SEARCH bY CITIES
			Actions a3=new Actions(w);
			a3.moveToElement(w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/a[1]"))).perform();
			w.findElement(By.xpath("//a[contains(text(),'Search by Cities')]")).click();
			System.out.println("Cities page is displayed");
			w.findElement(By.xpath("//div[contains(text(),'Agra')]")).click();
			w.navigate().back();
			w.navigate().back();
		
			//NATURAL LANDSCAPE-DATA-SEARCH bY SECTOR
			Actions a4=new Actions(w);
			a4.moveToElement(w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/a[1]"))).perform();
			w.findElement(By.xpath("//a[contains(text(),'Search by Sector')]")).click();
			System.out.println("Sectors page is displayed");
			w.findElement(By.xpath("//div[contains(text(),'Art and Culture')]")).click();
			w.navigate().back();
			w.navigate().back();
			
			//NATURAL LANDSCAPE-CITIES
			w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]")).click();
			System.out.println("Cities page is displayed");
			w.navigate().back();
			
			//NATURAL LANDSCAPE-CDO
			w.findElement(By.xpath("//a[contains(text(),'CDO')]")).click();
			System.out.println("Chief Data Officers page is displayed");
			w.navigate().back();
			
			//NATURAL LANDSCAPE-DOCUMENTS
			w.findElement(By.xpath("//a[contains(text(),'Documents')]")).click();
			System.out.println("Documents page is displayed");
			//w.findElement(By.xpath("//div[contains(text(),'Help Documents')]")).click();
			//JavascriptExecutor js4=(JavascriptExecutor)w;
			//js4.executeScript("window.scrollTo(0,700)");
			//Thread.sleep(1000);
			//js4.executeScript("window.scrollTo(0, -700)");
			//System.out.println("Help documents are listed");
			w.navigate().back();
			
			//NATURAL LANDSCAPE-FAQ
			w.findElement(By.xpath("//a[contains(text(),'FAQ')]")).click();
			System.out.println("FAQs page is displayed");
			w.findElement(By.xpath("//a[contains(text(),'Q3) We are facing challenges in fetching data from')]")).click();
			w.navigate().back();
			Thread.sleep(1000);
			w.close();
			w.switchTo().window(pw);
			
			
			//OPEN DATA-2
			w.findElement(By.xpath("//a[@id='quicktabs-tab-relevant_links_in-4']")).click();
			w.findElement(By.xpath("//a[contains(text(),'Open Spaces: Thane')]")).click();
			System.out.println("Open Spaces: Thane page is displayed");
			
			Set <String> win1=w.getWindowHandles();
			Iterator <String> it1=win1.iterator();
			String pw1=it1.next();
			String cw1=it1.next();
				
			w.switchTo().window(cw1);
			Thread.sleep(3000);
			
			System.out.println(w.getTitle());
			Thread.sleep(1000);
			w.close();
			w.switchTo().window(pw1);
			
			//OPEN DATA-3
			w.findElement(By.xpath("//a[@id='quicktabs-tab-relevant_links_in-4']")).click();
			w.findElement(By.xpath("//a[contains(text(),'Employment in forestry in Punjab')]")).click();
			System.out.println("Employment in forestry in Punjab:");
			Set <String> win2=w.getWindowHandles();
			Iterator <String> it2=win2.iterator();
			String pw2=it2.next();
			String cw2=it2.next();
				
			w.switchTo().window(cw2);
			Thread.sleep(5000);
			
			//REGISTRATION
//			w.findElement(By.cssSelector("body.html.not-front.not-logged-in.no-sidebars.page-node.page-node-.page-node-6819062.node-type-catalog.domain-data-gov-in.color-standard.ogpl-processed1:nth-child(6) div.page-container div.container.page div.top-wrapper:nth-child(1) div.header.clearfix div.region.region-header:nth-child(3) div.block.block-common-utility:nth-child(2) div.block-content.content > a.user-Register-link.ext")).click();
//			w.findElement(By.xpath("//input[@id='edit-full-name']")).sendKeys("Ankita Thamke");
//			w.findElement(By.xpath("//input[@id='edit-email']")).sendKeys("ankitathamke143.at@gmail.com");
//			Select s1=new Select(w.findElement(By.xpath("//select[@id='edit-gateway-country']")));
//			s1.selectByVisibleText("India");
//			w.findElement(By.xpath("//input[@id='edit-number']")).sendKeys("9819798427");
//			Select s2=new Select(w.findElement(By.xpath("//select[@id='edit-links-fieldset-date']")));
//			s2.selectByVisibleText("21");
//			Select s3=new Select(w.findElement(By.xpath("//select[@id='edit-links-fieldset-month']")));
//			s3.selectByVisibleText("September");
//			Select s4=new Select(w.findElement(By.xpath("//select[@id='edit-links-fieldset-year']")));
//			s4.selectByVisibleText("1997");
//			Select s5=new Select(w.findElement(By.xpath("//select[@id='edit-gender']")));
//			s5.selectByVisibleText("Female");
//			w.findElement(By.xpath("//input[@id='edit-submit']")).click();
						
			//CONTRIbUTOR-PUNJAb PLANNING DEPARTMENT-1
			w.findElement(By.xpath("//a[contains(text(),'Planning Department, Punjab')]")).click();
			System.out.println("Planning Department, Punjab:");
			w.findElement(By.xpath("//a[contains(text(),'Annual Building Construction Cost index for Punjab')]")).click();
			System.out.println("Annual Building Construction Cost index for Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//CONTRIbUTOR-PUNJAb PLANNING DEPARTMENT-2
			w.findElement(By.xpath("//a[contains(text(),'Planning Department, Punjab')]")).click();
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]")).click();
			System.out.println("District-wise Medical Termination of Pregnancies in Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//CONTRIbUTOR-PUNJAb PLANNING DEPARTMENT-3
			w.findElement(By.xpath("//a[contains(text(),'Planning Department, Punjab')]")).click();
			w.findElement(By.xpath("//a[contains(text(),'District-wise progress of Family Welfare Programme')]")).click();
			System.out.println("District-wise progress of Family Welfare Programme in Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//CONTRIbUTOR-PUNJAb PLANNING DEPARTMENT-4
			w.findElement(By.xpath("//a[contains(text(),'Planning Department, Punjab')]")).click();
			w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/h3[1]/a[1]")).click();
			System.out.println("District-wise Population Served per Institution and Bed, Area Covered per Institution and Bed in Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//CONTRIbUTOR-PUNJAb PLANNING DEPARTMENT-5
			w.findElement(By.xpath("//a[contains(text(),'Planning Department, Punjab')]")).click();
			w.findElement(By.xpath("//a[contains(text(),'Per Capita Annual Earning of Workers in Punjab')]")).click();
			System.out.println("Per Capita Annual Earning of Workers in Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//CONTRIbUTOR-DEPARTMENT OF ECONOMIC AND STATISTICAL ORGANIZATION-1
			w.findElement(By.xpath("//a[contains(text(),'Department of Economic and Statistical Organizatio')]")).click();
			System.out.println("Department of Economic and Statistical Organization, Punjab:");
			w.findElement(By.xpath("//a[contains(text(),'Annual Building Construction Cost index for Punjab')]")).click();
			System.out.println("Annual Building Construction Cost index for Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//CONTRIbUTOR-DEPARTMENT OF ECONOMIC AND STATISTICAL ORGANIZATION-2
			w.findElement(By.xpath("//a[contains(text(),'Planning Department, Punjab')]")).click();
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]")).click();
			System.out.println("District-wise Medical Termination of Pregnancies in Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//CONTRIbUTOR-DEPARTMENT OF ECONOMIC AND STATISTICAL ORGANIZATION-3
			w.findElement(By.xpath("//a[contains(text(),'Planning Department, Punjab')]")).click();
			w.findElement(By.xpath("//a[contains(text(),'District-wise progress of Family Welfare Programme')]")).click();
			System.out.println("District-wise progress of Family Welfare Programme in Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//CONTRIbUTOR-DEPARTMENT OF ECONOMIC AND STATISTICAL ORGANIZATION-4
			w.findElement(By.xpath("//a[contains(text(),'Planning Department, Punjab')]")).click();
			w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/h3[1]/a[1]")).click();
			System.out.println("District-wise Population Served per Institution and Bed, Area Covered per Institution and Bed in Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//CONTRIbUTOR-DEPARTMENT OF ECONOMIC AND STATISTICAL ORGANIZATION-5
			w.findElement(By.xpath("//a[contains(text(),'Planning Department, Punjab')]")).click();
			w.findElement(By.xpath("//a[contains(text(),'Per Capita Annual Earning of Workers in Punjab')]")).click();
			System.out.println("Per Capita Annual Earning of Workers in Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//GROUP:FOREST-1
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/span[2]/ul[1]/li[1]/a[1]")).click();
			System.out.println("Forest:");
			w.findElement(By.xpath("//a[contains(text(),'Employment in forestry in Punjab')]")).click();
			System.out.println("Employment in forestry in Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//GROUP:FOREST-2
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/span[2]/ul[1]/li[1]/a[1]")).click();
			w.findElement(By.xpath("//a[contains(text(),'Annual forest planting of major species in Punjab')]")).click();
			System.out.println("Annual forest planting of major species in Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//GROUP:FOREST-3
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/span[2]/ul[1]/li[1]/a[1]")).click();
			w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/h3[1]/a[1]")).click();
			System.out.println("Area protected against fire and cattle grazing in Punjab page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//GROUP:FOREST-4
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/span[2]/ul[1]/li[1]/a[1]")).click();
			w.findElement(By.xpath("//a[contains(text(),'Minor forest produce in Punjab State Forest only')]")).click();
			System.out.println("Minor forest produce in Punjab State Forest only page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//GROUP:FOREST-5
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/span[2]/ul[1]/li[1]/a[1]")).click();
			w.findElement(By.xpath("//a[contains(text(),'Major forest produce in Punjab State Forest only')]")).click();
			System.out.println("Major forest produce in Punjab State Forest only page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//SECTORS-ENVIRONMENT AND FOREST-1
			w.findElement(By.xpath("//a[contains(text(),'Environment and Forest')]")).click();
			System.out.println("Environment and Forest:");
			w.findElement(By.xpath("//a[contains(text(),'State-wise Elephant Deaths Due to Electrocution fr')]")).click();
			System.out.println("State-wise Elephant Deaths Due to Electrocution from 2016-17 to 2018-19 (From: Ministry of Environment, Forest and Climate Change) page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//SECTORS-ENVIRONMENT AND FOREST-2
			w.findElement(By.xpath("//a[contains(text(),'Environment and Forest')]")).click();
			w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/h3[1]/a[1]")).click();
			//System.out.println("");
			w.navigate().back();
			w.navigate().back();

			//SECTORS-ENVIRONMENT AND FOREST-3
			w.findElement(By.xpath("//a[contains(text(),'Environment and Forest')]")).click();
			w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/h3[1]/a[1]")).click();
			System.out.println("State/UT-wise Forest Cover as per ISFR during 2017 and 2019 (From: Ministry of Environment, Forest and Climate Change) page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//SECTORS-ENVIRONMENT AND FOREST-4
			w.findElement(By.xpath("//a[contains(text(),'Environment and Forest')]")).click();
			w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/h3[1]/a[1]")).click();
			System.out.println("State/UT-wise Afforestation Status from 2014-15 to 2018-19 (From: Ministry of Environment, Forest and Climate Change) page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//SECTORS-ENVIRONMENT AND FOREST-5
			w.findElement(By.xpath("//a[contains(text(),'Environment and Forest')]")).click();
			w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/h3[1]/a[1]")).click();
			System.out.println("State/UT-wise Forest area Diverted for Non-Forest from 2014-15 to 2018-19 (From: Ministry of Environment, Forest and Climate Change) page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//SOURCE:OPEN GOVERNMENT DATA PORTAL PUNJAb
			w.findElement(By.xpath("//a[contains(text(),'Open Government Data Portal Punjab')]")).click();
			w.navigate().back();
	
			System.out.println("QUICK LINKS:");
			
			//QUICK LINKS-CATALOG
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//a[contains(text(),'CATALOG')]")).click();
			System.out.println("Catalog page is displayed");
			w.navigate().back();
			
			//QUICK LINKS-SECTORS
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//a[contains(text(),'SECTORS')]")).click();
			System.out.println("Sectors page is displayed");
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/span[1]/a[2]")).click();
			System.out.println("Census and Survey page is displayed");
			w.navigate().back();
			w.navigate().back();
			
			//QUICK LINKS-EVENTS
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//a[contains(text(),'EVENTS')]")).click();
			System.out.println("Events page is displayed");
			w.navigate().back();
			
			//QUICK LINKS-CDO
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//a[contains(text(),'CHIEF DATA OFFICERS')]")).click();
			System.out.println("Chief Data Officers page is displayed");
			Thread.sleep(1000);
			w.navigate().back();
			
			//QUICKS LINK-APPS GALLERY
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//a[contains(text(),'APPs GALLERY')]")).click();
			System.out.println("Apps page is displayed");
			w.navigate().back();
			
			/*//QUICK LINKS-METRICS
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//a[contains(text(),'METRICS')]")).click();
			System.out.println("Central Publication Metrics page is displayed");
			w.findElement(By.xpath("//a[contains(text(),'Department of Health and Family Welfare')]")).click();
			w.navigate().back();
			w.navigate().back();
			
			//QUICK LINKS-ANNOUNCEMENTS
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//a[contains(text(),'ANNOUNCEMENTS')]")).click();
			System.out.println("Announcements page is displayed");
			w.navigate().back();
			
			//QUICK LINKS-COMMUNITIES
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//a[contains(text(),'COMMUNITIES')]")).click();
			System.out.println("COMMUNITIES page is displayed");
			w.navigate().back();
			
			//QUICK LINKS-VISUALIZATION
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//a[contains(text(),'VISUALIZATION')]")).click();
			System.out.println("Visualization page is displayed");
			w.navigate().back();*/
			
			System.out.println("ASSISTIVE LINKS:");
			
			//ASSISTIVE LINKS-AbOUT PORTAL
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			System.out.println("Quick Link and Assisstive Links page is displayed");
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='mega-container']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
			System.out.println("About Open Government Data (OGD) Platform India page is displayed");
			JavascriptExecutor js5=(JavascriptExecutor)w;
			js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			js5.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			w.navigate().back();
		
			//ASSISTIVE LINKS-BLOG
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();
			System.out.println("Blog page is displayed");
			JavascriptExecutor js6=(JavascriptExecutor)w;
			js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			js6.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			w.navigate().back();
			
			//ASSISTIVE LINKS-TELL A FRIEND
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='mega-container']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
			System.out.println("Tell a Friend page is displayed");
			w.navigate().back();
			
			//ASSISTIVE LINKS-ACCESSIbILITY STATEMENT
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='mega-container']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();
			System.out.println("Accessibility Statement page is displayed");
			JavascriptExecutor js7=(JavascriptExecutor)w;
			js7.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			js7.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			w.navigate().back();
		
			//ASSISTIVE LINKS-POLICIES
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='mega-container']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[9]/a[1]")).click();
			System.out.println("Policies page is displayed");
			JavascriptExecutor js8=(JavascriptExecutor)w;
			js8.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			js8.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			w.navigate().back();
			
			//ASSISTIVE LINKS-FAQS
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='mega-container']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
			System.out.println("Frequently Asked Questions page is diaplyed");
			w.findElement(By.xpath("//a[contains(text(),'How datasets are identified?')]")).click();
			JavascriptExecutor js11=(JavascriptExecutor)w;
			js11.executeScript("window.scrollTo(0, 300)");
			Thread.sleep(5000);
			js11.executeScript("window.scrollTo(0, -300)");
			Thread.sleep(2000);			
			w.navigate().back();
			
			//ASSISTIVE LINKS-OPEN DATA SITES
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='mega-container']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
			System.out.println("Open Data Sites page is displayed");
			w.navigate().back();
			
			//ASSISTIVE LINKS-TERMS OF USE
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='mega-container']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
			System.out.println("Terms of Use page is displayed");
			JavascriptExecutor js9=(JavascriptExecutor)w;
			js9.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			js9.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			w.navigate().back();
			
			//ASSISTIVE LINKS-CONNECT WITH US
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='mega-container']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[8]/a[1]")).click();
			System.out.println("Connect With Us page is displayed");
			w.navigate().back();
			
			//ASSISTIVE LINKS-HELP
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='mega-container']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[10]/a[1]")).click();
			System.out.println("Open Government Data Platform Help page is displayed");
			JavascriptExecutor js10=(JavascriptExecutor)w;
			js10.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			js10.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			w.navigate().back();
			
			//ASSISTIVE LINKS-LINK TO US
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.linkText("Link To Us")).click();
			System.out.println("Link To Us page is displayed");
			w.navigate().back();
			
			//ASSISTIVE LINKS-NEWSLETTER
			w.findElement(By.xpath("//a[@id='mega-menu-selector']")).click();
			w.findElement(By.linkText("Newsletters")).click();
			w.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/a[1]/img[1]")).click();
			System.out.println("Newsletter September 2020 page is displayed");
			w.navigate().back();
			Thread.sleep(10000);
			w.close();
			w.switchTo().window(pw2);
			
			//OPEN DATA-4
			 w.findElement(By.xpath("//a[@id='quicktabs-tab-relevant_links_in-4']")).click();
			 w.findElement(By.xpath("//a[contains(text(),'More...')]")).click();
			 System.out.println("Catalogs page is displayed");
			 Set <String> win3=w.getWindowHandles();
			 Iterator <String> it4=win3.iterator();
			 String pw4=it4.next();
			 String cw4=it4.next();
					
			 w.switchTo().window(cw4);
			 Thread.sleep(3000);
			 w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/a[1]")).click();
			 
			 //CONTRIbUTOR-MINISTRY OF ENVIRONMENT,FOREST AND CLIMATE CHANGE-1
			 w.findElement(By.xpath("//a[contains(text(),'Ministry of Environment, Forest and Climate Change')]")).click();
			 System.out.println("Ministry of Environment, Forest and Climate Change:");
			 w.findElement(By.xpath("//a[contains(text(),'Real time Air Quality Index from various locations')]")).click();
			 System.out.println("Real time Air Quality Index from various locations page is displayed");
			 w.navigate().back();
			 w.navigate().back();
			 
			//CONTRIbUTOR-MINISTRY OF ENVIRONMENT,FOREST AND CLIMATE CHANGE-2
			 w.findElement(By.xpath("//a[contains(text(),'Ministry of Environment, Forest and Climate Change')]")).click();
			 w.findElement(By.xpath("//a[contains(text(),'Water Quality in India - 2014')]")).click();
			 System.out.println("Water Quality in India - 2014 page is displayed");
			 w.navigate().back();
			 w.navigate().back();
			 
			//CONTRIbUTOR-MINISTRY OF ENVIRONMENT,FOREST AND CLIMATE CHANGE-3
			 w.findElement(By.xpath("//a[contains(text(),'Ministry of Environment, Forest and Climate Change')]")).click();
			 w.findElement(By.xpath("//a[contains(text(),'Water Quality in India - 2013')]")).click();
			 System.out.println("Water Quality in India - 2013 page is displayed");
			 w.navigate().back();
			 w.navigate().back();
			 
			//CONTRIbUTOR-MINISTRY OF ENVIRONMENT,FOREST AND CLIMATE CHANGE-4
			 w.findElement(By.xpath("//a[contains(text(),'Ministry of Environment, Forest and Climate Change')]")).click();
			 w.findElement(By.xpath("//a[contains(text(),'Historical Daily Ambient Air Quality Data')]")).click();
			 System.out.println("Historical Daily Ambient Air Quality Data page is displayed");
			 w.navigate().back();
			 w.navigate().back();
			 
			//CONTRIbUTOR-MINISTRY OF ENVIRONMENT,FOREST AND CLIMATE CHANGE-5
			 w.findElement(By.xpath("//a[contains(text(),'Ministry of Environment, Forest and Climate Change')]")).click();
			 w.findElement(By.xpath("//a[contains(text(),'Sameer (National Air Quality Index)')]")).click();
			 System.out.println("Sameer (National Air Quality Index) page is displayed");
			 w.navigate().back();
			 w.navigate().back();
			 
			 //GROUPS:WATER QUALITY-1
			 w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/span[2]/ul[1]/li[1]/a[1]")).click();
			 System.out.println("Water Quality:");
			 w.findElement(By.xpath("//a[contains(text(),'Water Quality in India - 2014')]")).click();
			 System.out.println("Water Quality in India - 2014 page is displayed");
			 w.navigate().back();
			 w.navigate().back();
			 
			//GROUPS:WATER QUALITY-2
			 w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/span[2]/ul[1]/li[1]/a[1]")).click();
			 w.findElement(By.xpath("//a[contains(text(),'Water Quality in India - 2013')]")).click();
			 System.out.println("Water Quality in India - 2013 page is displayed");
			 w.navigate().back();
			 w.navigate().back();
			 
			//GROUPS:WATER QUALITY-3
			 w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/span[2]/ul[1]/li[1]/a[1]")).click();
			 System.out.println("Water Quality page is displayed");
			 w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[1]/a[1]")).click();
			 System.out.println("Water Quality in India - 2013 page is displayed");
			 w.navigate().back();
			 w.navigate().back();
			 
			//GROUPS:WATER QUALITY-4
			 w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/span[2]/ul[1]/li[1]/a[1]")).click();
			 w.findElement(By.xpath("//a[contains(text(),'Bio Monitoring Field Protocol')]")).click();
			 System.out.println("Bio Monitoring Field Protocol page is displayed");
			 w.navigate().back();
			 w.navigate().back();
			 
			 //GROUPS:WATER QUALITY-4
			 w.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='page-container']/div[@id='page']/div[@id='columns']/div[@id='content-column']/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/span[2]/ul[1]/li[1]/a[1]")).click();
			 w.findElement(By.xpath("//a[contains(text(),'Ganga Shravan Abhiyaan')]")).click();
			 System.out.println("Ganga Shravan Abhiyaan page is displayed");
			 w.navigate().back();
			 w.navigate().back();
			 
			 w.close();
			 w.switchTo().window(pw4);
			 
	}

}
