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

//Step 3 Cabang
//WebUI.openBrowser('https://staging.cabang.web.brinesia.app/')
WebUI.openBrowser('https://staging.crm.web.brinesia.app/signin')

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'ikhsan.widantara')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Cabang/Menu/Menu PenerbitanPolis'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.click(findTestObject('Cabang/Ria Approval Polis/Approval By Ria'))

// Verify Status Penerbitan Polis
TestObject statusObject = findTestObject('Cabang/Ikhsan/StatusPolis Checking_Inforce')

WebUI.comment('--- Pengambilan Status Penerbitan Polis ---')

WebUI.waitForElementPresent(statusObject, 10, FailureHandling.STOP_ON_FAILURE)

String actualStatus = WebUI.getText(statusObject).trim()

println('✅ Status Penerbitan Polis : ' + actualStatus)

String expectedStatus = 'Waiting checking / Inforce policy'

WebUI.verifyMatch(actualStatus, expectedStatus, false, FailureHandling.CONTINUE_ON_FAILURE)

if (actualStatus == expectedStatus) {
    println('Status Persetujuan Sesuai: ' + actualStatus)
} else {
    println('❌ Peringatan: Status History TIDAK sesuai. Ditemukan: ' + actualStatus)
}

WebUI.click(findTestObject('Cabang/Ikhsan/SubDetail Checking_Inforce'))

WebUI.scrollToElement(findTestObject('Cabang/Ria Approval Polis/inputRemark By Ria Approval Polis'), 0)

WebUI.setText(findTestObject('Cabang/Pemutus Akhir By Septian'), 'OS')

WebUI.sendKeys(findTestObject('Cabang/Pemutus Akhir By Septian'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Cabang/Ria Approval Polis/inputRemark By Ria Approval Polis'), 'Done Testing 1')

WebUI.click(findTestObject('Cabang/Ria Approval Polis/Send to Signer By Ria Approval Polis'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

