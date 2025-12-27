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
import java.util.Arrays as Arrays
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('https://staging.business.web.brinesia.app/') // https://staging.tis.web.brinesia.app/ 

WebUI.setText(findTestObject('BusinessRM/inputEmail'), 'cob.lampung.admin')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('BusinessRM/inputOTP'), '123456')

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.dismissAlert()

WebUI.click(findTestObject('BusinessRM/BurgerMenu'))

WebUI.click(findTestObject('Other Cabang/Lampung/Bisnis/Menu Aksep COB'))

WebUI.click(findTestObject('Other Cabang/Lampung/Bisnis/Menu Submission'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.click(findTestObject('Underwriting/Approve TMO/Decision By RM/FirstSubDetail By RM Bisnis'))

WebUI.scrollToElement(findTestObject('BusinessRM/clsoing RM/buttonUpdate'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('BusinessRM/clsoing RM/closing'))

WebUI.scrollToElement(findTestObject('BusinessRM/SecMessage'), 0)

WebUI.setText(findTestObject('BusinessRM/clsoing RM/textarea_Catatan'), 'Lanjut Disposisi')

WebUI.click(findTestObject('BusinessRM/clsoing RM/buttonSubmit'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.closeBrowser()

