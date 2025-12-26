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

WebUI.openBrowser('https://staging.business.web.brinesia.app/') // https://staging.tis.web.brinesia.app/

WebUI.setText(findTestObject('BusinessRM/inputEmail'), 'cob.padang.rm')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('BusinessRM/inputOTP'), '123456')

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.dismissAlert()

WebUI.click(findTestObject('BusinessRM/BurgerMenu'))

WebUI.click(findTestObject('Other Cabang/Padang/Bisnis/Menu Aksep COB'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.click(findTestObject('Other Cabang/Padang/Bisnis/Menu PenerbitanPolis'))

// Verify Status Penerbitan Polis
TestObject statusObject1 = findTestObject('Cabang/Bisnis Polis/FirstStatusPolis')

WebUI.comment('--- Pengambilan Status Penerbitan Polis ---')

WebUI.waitForElementPresent(statusObject1, 10, FailureHandling.STOP_ON_FAILURE)

String actualStatus1 = WebUI.getText(statusObject1).trim()

println('✅ Status Penerbitan Polis Before Generate PDF : ' + actualStatus1)

String expectedStatus1 = 'Policy Issued'

WebUI.verifyMatch(actualStatus1, expectedStatus1, false, FailureHandling.CONTINUE_ON_FAILURE)

if (actualStatus1 == expectedStatus1) {
    println('Status Persetujuan Sesuai: ' + actualStatus1)
} else {
    println('❌ Peringatan: Status History TIDAK sesuai. Ditemukan: ' + actualStatus1)
}

WebUI.click(findTestObject('Cabang/Bisnis Polis/FirstSubList'))

WebUI.scrollToElement(findTestObject('Cabang/Bisnis Polis/SecTabel Informasi'), 0)

WebUI.setText(findTestObject('Cabang/Bisnis Polis/input_Alamat Pengiriman'), 'Padang Permai 54321')

WebUI.setText(findTestObject('Cabang/Bisnis Polis/input_Covering'), 'approve')

WebUI.setText(findTestObject('Cabang/Bisnis Polis/input_KetCovering'), 'bisa dilanjut')

WebUI.setText(findTestObject('Cabang/Bisnis Polis/input_Premi'), '20000000')

WebUI.click(findTestObject('Cabang/Bisnis Polis/buttonGenerate'))

WebUI.switchToWindowIndex(0)

WebUI.delay(1)

WebUI.setText(findTestObject('Cabang/Bisnis Polis/input_Nama Pengirim'), 'Anrena')

WebUI.setText(findTestObject('Cabang/Bisnis Polis/input_Tanggal Dikirim'), '06122025')

WebUI.setText(findTestObject('Cabang/Bisnis Polis/input_Keterangan'), 'Send')

WebUI.uploadFile(findTestObject('Cabang/Bisnis Polis/AttachFilePolis'), 'C:/Users/ACER/Downloads/Sample Dokumen/BN57673UNDFL-0202SMG0725..pdf')

//WebUI.uploadFile(findTestObject('Other Cabang/Padang/UW/Tedi/AttachSubject1'), 'C:/Users/TTECH-0251/Downloads/Sample Dokumen/samplepptx-2-1 (3)-1-1 (3).pptx')

WebUI.click(findTestObject('Cabang/Bisnis Polis/BtnSave'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.back()

// Verify Status Penerbitan Polis
TestObject statusObject2 = findTestObject('Cabang/Bisnis Polis/FirstStatusPolis')

WebUI.comment('--- Pengambilan Status Penerbitan Polis ---')

WebUI.waitForElementPresent(statusObject2, 10, FailureHandling.STOP_ON_FAILURE)

String actualStatus2 = WebUI.getText(statusObject2).trim()

println('✅ Status Penerbitan Polis After Input Pengiriman Polis : ' + actualStatus2)

String expectedStatus2 = 'Policy Sent'

WebUI.verifyMatch(actualStatus2, expectedStatus2, false, FailureHandling.CONTINUE_ON_FAILURE)

if (actualStatus2 == expectedStatus2) {
    println('Status Persetujuan Sesuai: ' + actualStatus2)
} else {
    println('❌ Peringatan: Status History TIDAK sesuai. Ditemukan: ' + actualStatus2)
}

WebUI.closeBrowser()

