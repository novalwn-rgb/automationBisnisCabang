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

//

import com.kms.katalon.core.testobject.SelectorMethod

//Step 3
WebUI.openBrowser('https://staging.underwriting.web.brinesia.app/')

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'miranti.cecilia')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Underwriting/Menu/Menu Aksep COB'))

WebUI.click(findTestObject('Underwriting/Menu/SubMenu Approval'))

WebUI.click(findTestObject('Underwriting/Approve JTL/Dashboard/LastNextSub'))

//test coba
// 1. Definisikan data unik (Nama Tertanggung)
// 1. Tentukan Submission Number (data unik yang dicari)
String targetSubmissionNumber = "BN57/1886/UND/WS-0114/SMG/11/25" // Ganti dengan variabel hasil submission

// 2. Dapatkan Test Object placeholder
TestObject dynamicRowObject = findTestObject('Underwriting/Approve JTL/Dashboard/LastSubDetail1')

// Step 3 (REVISI): Buat Test Object baru (modifiedObject) menggunakan parameter dinamis.
TestObject modifiedRowObject = findTestObject(
    'Underwriting/Approve JTL/Dashboard/LastSubDetail', // ID/Path Object Repository Anda
    [('submissionNumber'): targetSubmissionNumber]          // Map dari placeholder XPath dan nilainya
)

// Step 4 (REVISI): Klik baris target (menggunakan Test Object yang sudah dimodifikasi)
WebUI.click(modifiedRowObject)
//end test coba

//println("Berhasil mengklik data Tertanggung: " + targetTertanggungName)
//end test coba

//WebUI.click(findTestObject('Underwriting/Approve JTL/Dashboard/LastSubDetail1'))

WebUI.scrollToElement(findTestObject('Underwriting/Approve JTL/SecFasterDecision1'), 0)

WebUI.setText(findTestObject('Underwriting/Approve JTL/input_Disposisi'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.setText(findTestObject('Underwriting/Approve JTL/input_putusan'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

//WebUI.click(findTestObject('Underwriting/Approve JTL/Dokumen Putusan/AddDokPutusan'))

//WebUI.setText(findTestObject('Underwriting/Approve JTL/Dokumen Putusan/namaDokPutusan'), 'Dokumen Sample')

//WebUI.uploadFile(findTestObject('Underwriting/Approve JTL/Dokumen Putusan/AttDokPutusan'), 'C:/Users/ACER/Downloads/Sample Dokumen/sample2.jpg')

//WebUI.click(findTestObject('Underwriting/Approve JTL/Dokumen Putusan/SendDokPutusan'))

WebUI.click(findTestObject('Underwriting/Approve JTL/Btn Closing Instruction1'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

