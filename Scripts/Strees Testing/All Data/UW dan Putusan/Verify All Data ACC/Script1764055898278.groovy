import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import org.openqa.selenium.WebElement as WebElement
import java.util.List as List
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod

// ALL DATA DISETUJUI
WebUI.openBrowser('https://staging.business.web.brinesia.app/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('BusinessRM/inputEmail'), 'cob.semanggi.admin')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('BusinessRM/inputOTP'), '123456')

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.dismissAlert()

WebUI.click(findTestObject('BusinessRM/BurgerMenu'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.click(findTestObject('Putusan/AksepCOB'))

WebUI.click(findTestObject('Putusan/submission'))

WebUI.click(findTestObject('Underwriting/Subjectivity/testbisnis2'))

String subjectivityStatus1 = WebUI.getText(findTestObject('Putusan/DokPutusan Bisnis1'))

String subjectivityStatus2 = WebUI.getText(findTestObject('Putusan/DokPutusan Bisnis2'))

String subjectivityStatus3 = WebUI.getText(findTestObject('Putusan/DokPutusan Bisnis3'))

String subjectivityStatus4 = WebUI.getText(findTestObject('Putusan/DokPutusan Bisnis4'))

List<String> isDocumentPresent = Arrays.asList(subjectivityStatus1.trim(), subjectivityStatus2.trim(), subjectivityStatus3.trim()
, subjectivityStatus4.trim())

List<String> DocumentNotPresent = Arrays.asList('Tidak Ada')

boolean isAnyDocument = true

for (String status : isDocumentPresent) {
	if (DocumentNotPresent.contains(status)) {
		isAnyDisabled = true

		break
	}
}

if (isAnyDocument) {

	println('✅ Dokumen Putusan DITEMUKAN. Persetujuan berhasil diverifikasi.')

	for (int i = 0; i < isDocumentPresent.size(); i++) {
		WebUI.comment((('Dokumen yang ditampilkan: ' + (i + 1)) + ': ') + isDocumentPresent.get(i))
	}
	
	WebUI.click(findTestObject('Underwriting/Subjectivity/Bisnis/BtnClosing Instruction RM Disable'))
	
} else {
	println('❌ Dokumen Putusan TIDAK DITEMUKAN. (Asumsi: Belum disetujui atau gagal tampil).')
}
