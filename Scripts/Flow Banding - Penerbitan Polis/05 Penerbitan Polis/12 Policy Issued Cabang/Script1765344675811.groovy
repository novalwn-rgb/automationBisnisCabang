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

WebUI.openBrowser('https://staging.crm.web.brinesia.app/signin')

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'heru.sulistiono')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Cabang/Heru/MenuPP'))

WebUI.click(findTestObject('Cabang/Heru/monitoring'))

//WebUI.executeJavaScript('\ndocument\n  .evaluate("/html/body/app-root/app-home/div/nav/ul/li[14]/ul/li[3]/a", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null)\n  .singleNodeValue.click();\n', 
//    null)
WebUI.setText(findTestObject('Cabang/Heru/InputStatusPenerbitan'), 'Policy issued')

WebUI.sendKeys(findTestObject('Cabang/Heru/InputStatusPenerbitan'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Cabang/Heru/ButtonSearch Monitoring'))

WebUI.scrollToElement(findTestObject('Cabang/Heru/LastSubNum Monitoring'), 0)

// Verify Status Penerbitan Polis
TestObject statusObject = findTestObject('Cabang/Heru/LastStatusPolis Monitoring')

WebUI.comment('--- Rilis Penerbitan Polis ---')

WebUI.waitForElementPresent(statusObject, 10, FailureHandling.STOP_ON_FAILURE)

String actualStatus = WebUI.getText(statusObject).trim()

println('✅ Status Penerbitan Polis : ' + actualStatus)

String expectedStatus = 'Policy issued'

WebUI.verifyMatch(actualStatus, expectedStatus, false, FailureHandling.CONTINUE_ON_FAILURE)

if (actualStatus == expectedStatus) {
    println('Status Persetujuan Sesuai: ' + actualStatus)
} else {
    println('❌ Peringatan: Status History TIDAK sesuai. Ditemukan: ' + actualStatus)
}

WebUI.click(findTestObject('Cabang/Heru/LastSubNum Monitoring'))

WebUI.closeBrowser()

