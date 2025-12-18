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

WebUI.openBrowser('https://staging.tis.web.brinesia.app/')

WebUI.setText(findTestObject('BusinessRM/inputEmail'), 'cob.jakarta1.admin')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('BusinessRM/inputOTP'), '123456')

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.dismissAlert()

WebUI.click(findTestObject('BusinessRM/BurgerMenu'))

WebUI.click(findTestObject('BusinessRM/AksepCOB'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.click(findTestObject('BusinessRM/Submission'))

WebUI.click(findTestObject('BusinessRM/FirstSubList'))

WebUI.scrollToElement(findTestObject('BusinessRM/BtnUpdate'), 0)

WebUI.click(findTestObject('Underwriting/input_Editor toolbars_buttonUpdate'))

WebUI.scrollToElement(findTestObject('BusinessRM/MessageUpdate'), 0)

WebUI.delay(10)

WebUI.setText(findTestObject('Underwriting/textarea_message'), 'Done Update')

WebUI.sendKeys(findTestObject('Underwriting/textarea_message'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Underwriting/input_Catatan_buttonSubmit'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

