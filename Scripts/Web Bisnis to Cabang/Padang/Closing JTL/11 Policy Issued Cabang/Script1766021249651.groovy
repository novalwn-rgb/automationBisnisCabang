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

//test
WebUI.openBrowser('https://staging.crm.web.brinesia.app/signin')

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'abi.faridudzaman')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

//end
//WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))
WebUI.click(findTestObject('Other Cabang/Padang/Cabang/Abi Police Admin/Menu PenerbitanPolis'))

WebUI.click(findTestObject('Other Cabang/Padang/Cabang/Abi Police Admin/Dropdown StatusPenerbitanPolis'))

WebUI.click(findTestObject('Other Cabang/Padang/Cabang/Abi Police Admin/Pilih StatusPolis')) // Policy issued

//WebUI.setText(findTestObject('Other Cabang/Padang/Cabang/Abi Police Admin/InputStatusPenerbitan'), 'Policy issued')
//
//WebUI.sendKeys(findTestObject('Other Cabang/Padang/Cabang/Abi Police Admin/InputStatusPenerbitan'), Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Other Cabang/Padang/Cabang/Abi Police Admin/ButtonSearch Monitoring'))

// Verify Status Penerbitan Polis
TestObject statusObject = findTestObject('Other Cabang/Padang/Cabang/Abi Police Admin/LastStatusPolis Monitoring')

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

WebUI.click(findTestObject('Other Cabang/Padang/Cabang/Abi Police Admin/LastSubNum Monitoring'))

WebUI.closeBrowser()

