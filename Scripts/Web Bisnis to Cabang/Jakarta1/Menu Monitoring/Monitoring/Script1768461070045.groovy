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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testdata.ExcelData as ExcelData

WebUI.openBrowser('https://staging.business.web.brinesia.app/') // https://staging.tis.web.brinesia.app/

WebUI.setText(findTestObject('BusinessRM/inputEmail'), 'cob.jakarta1.admin')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('BusinessRM/inputOTP'), '123456')

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.dismissAlert()

WebUI.click(findTestObject('BusinessRM/BurgerMenu'))

WebUI.click(findTestObject('Other Cabang/Semanggi/Bisnis/Menu Aksep COB'))

WebUI.click(findTestObject('Other Cabang/Semanggi/Bisnis/Menu Monitoring'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

String submissionNumber = 'BN57/2162/UND/FL-0301/JKT1/01/26'

WebUI.setText(findTestObject('Other Cabang/Semanggi/Monitoring/InputSubmission'), 'BN57/2162/UND/FL-0301/JKT1/01/26')

WebUI.click(findTestObject('Other Cabang/Semanggi/Monitoring/BtnSearch'))

WebUI.waitForElementVisible(findTestObject('Other Cabang/Semanggi/Monitoring/table_submission_number'), 5)

// Ambil submission number dari table
String submissionInTable = WebUI.getText(findTestObject('Other Cabang/Semanggi/Monitoring/table_submission_number'))

// Verifikasi
WebUI.verifyMatch(submissionInTable, submissionNumber, false)

KeywordUtil.logInfo('Submission number sesuai: ' + submissionInTable)

String downloadPath = 'C:/Users/ACER/Downloads'

String fileName = 'Monitoring Acceptation COB.xlsx'

String filePath = (downloadPath + '/') + fileName

File file = new File(filePath)

WebUI.click(findTestObject('Other Cabang/Semanggi/Monitoring/BtnExport'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

// Tunggu file selesai ter-download
int timeout = 30

while (!(file.exists()) && (timeout > 0)) {
    WebUI.delay(1)

    timeout--
}

if (!(file.exists())) {
    KeywordUtil.markFailed('File Excel tidak ditemukan: ' + filePath)
}

if (!(file.exists())) {
    KeywordUtil.markFailed('File Excel tidak ter-download')
}

KeywordUtil.logInfo('File berhasil ter-download: ' + fileName)

// Load Excel
ExcelData excelData = ExcelFactory.getExcelDataWithDefaultSheet(filePath, 'Sheet1', false)

// Ambil Submission Number
String submissionNumberExcel = excelData.getValue(3, 3)

KeywordUtil.logInfo('Submission Number di Excel: ' + submissionNumberExcel)

// Verifikasi
if (submissionNumberExcel.equalsIgnoreCase(submissionNumber)) {
    KeywordUtil.markPassed('Submission Number sesuai: ' + submissionNumberExcel)
} else {
    KeywordUtil.markFailed((('Submission Number TIDAK sesuai. Expected: ' + submissionNumber) + ', Actual: ') + submissionNumberExcel)
}

WebUI.closeBrowser()

