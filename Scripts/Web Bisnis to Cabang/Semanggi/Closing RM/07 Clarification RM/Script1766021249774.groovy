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
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod

WebUI.openBrowser('https://staging.business.web.brinesia.app/') // https://staging.tis.web.brinesia.app/ 

WebUI.setText(findTestObject('BusinessRM/inputEmail'), 'cob.semanggi.admin')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('BusinessRM/inputOTP'), '123456')

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.dismissAlert()

WebUI.click(findTestObject('BusinessRM/BurgerMenu'))

WebUI.click(findTestObject('Other Cabang/Semanggi/Bisnis/Menu Aksep COB'))

WebUI.click(findTestObject('Other Cabang/Padang/Bisnis/Menu PenerbitanPolis'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

// Verify Status Penerbitan Polis
//TestObject statusObject = findTestObject('BusinessRM/FirstStatusPP')
//
//WebUI.comment('--- Pengambilan Status Penerbitan Polis ---')
//
//WebUI.waitForElementPresent(statusObject, 10, FailureHandling.STOP_ON_FAILURE)
//
//String actualStatus = WebUI.getText(statusObject).trim()
//
//println('✅ Status Penerbitan Polis : ' + actualStatus)
//
//String expectedStatus = 'Waiting Clarification by RM'
//
//WebUI.verifyMatch(actualStatus, expectedStatus, false, FailureHandling.CONTINUE_ON_FAILURE)
//
//if (actualStatus == expectedStatus) {
//    println('Status Persetujuan Sesuai: ' + actualStatus)
//} else {
//    println('❌ Peringatan: Status History TIDAK sesuai. Ditemukan: ' + actualStatus)
//}

WebUI.click(findTestObject('BusinessRM/FirstSubPP'))

//WebUI.scrollToElement(findTestObject('BusinessRM/BtnClosing Instruction RM'), 0)
WebUI.scrollToElement(findTestObject('BusinessRM/SecClarification'), 0)

WebUI.setText(findTestObject('BusinessRM/InputClarification'), 'Done Clarification RM')

WebUI.click(findTestObject('BusinessRM/BtnSubmit Clarification'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.closeBrowser()

