import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

//WebUI.openBrowser('https://staging.underwriting.web.brinesia.app/')
System.setProperty('webdriver.chrome.driver', 'C:/Users/ACER/.katalon/packages/KSE-10.3.1/configuration/resources/drivers/chromedriver_win32/chromedriver.exe')

WebDriver driver = new ChromeDriver()

DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl('https://staging.underwriting.web.brinesia.app/')

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'sekar.ayuni')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Underwriting/Menu/Menu COB'))

WebUI.click(findTestObject('Underwriting/Menu/SubMenu Approval'))

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/NextSubList'))

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/lastNextSubNumber'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.scrollToElement(findTestObject('Underwriting/SecAkseptasi'), 0)

WebUI.click(findTestObject('Underwriting/BrinsToUW/Sekar/BtnSubmit'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.closeBrowser()

