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

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'windi.julianti')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Cabang/Menu/Menu PenerbitanPolis'))

WebUI.click(findTestObject('Cabang/Menu/SubMenuSub'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

// Verify Status Penerbitan Polis
TestObject statusObject = findTestObject('Padang/Cabang/Windi/FirstStatusPolis')

WebUI.comment('--- Pengambilan Status Penerbitan Polis ---')

WebUI.waitForElementPresent(statusObject, 10, FailureHandling.STOP_ON_FAILURE)

String actualStatus = WebUI.getText(statusObject).trim()

println('✅ Status Penerbitan Polis : ' + actualStatus)

String expectedStatus = 'Waiting entry CARE'

WebUI.verifyMatch(actualStatus, expectedStatus, false, FailureHandling.CONTINUE_ON_FAILURE)

if (actualStatus == expectedStatus) {
    println('Status Persetujuan Sesuai: ' + actualStatus)
} else {
    println('❌ Peringatan: Status History TIDAK sesuai. Ditemukan: ' + actualStatus)
}

WebUI.click(findTestObject('Padang/Cabang/Windi/FirstSubDetail'))

WebUI.scrollToElement(findTestObject('Cabang/CI_Number'), 0)

WebUI.setText(findTestObject('Cabang/CI_Number'), '11901112000599' // CI Number Atas OJS
    )

WebUI.setText(findTestObject('Padang/Cabang/Windi/Pemutus Akhir By Data Entry'), 'OJS')

WebUI.sendKeys(findTestObject('Padang/Cabang/Windi/Pemutus Akhir By Data Entry'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Cabang/inputRemarks'), 'After Clarification JTL')

WebUI.click(findTestObject('Padang/Cabang/Windi/BtnSubmit By Data Entry'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.closeBrowser()

