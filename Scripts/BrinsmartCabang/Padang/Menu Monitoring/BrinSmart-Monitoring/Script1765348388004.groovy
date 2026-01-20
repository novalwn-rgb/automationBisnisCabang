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
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.FileInputStream as FileInputStream

Mobile.startApplication('C:\\Users\\ACER\\Downloads\\smart-staging (1).apk', false)

Mobile.setText(findTestObject('Brinsmart/Login/InputEmail'), 'cob.padang.rm', 0)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Brinsmart/Login/BtnEnter'), 0)

Mobile.tap(findTestObject('Brinsmart/Login/VerifyOTP'), 0)

Mobile.setText(findTestObject('Brinsmart/Login/otp1'), '1', 0)

Mobile.setText(findTestObject('Brinsmart/Login/otp2'), '2', 0)

Mobile.setText(findTestObject('Brinsmart/Login/otp3'), '3', 0)

Mobile.setText(findTestObject('Brinsmart/Login/otp4'), '4', 0)

Mobile.setText(findTestObject('Brinsmart/Login/otp5'), '5', 0)

Mobile.setText(findTestObject('Brinsmart/Login/otp6'), '6', 0)

Mobile.tap(findTestObject('Brinsmart/Dashboard/BurgerMenu'), 0)

Mobile.tap(findTestObject('Brinsmart/Dashboard/MenuAkseptasi COB'), 0)

Mobile.tap(findTestObject('Brinsmart/Dashboard/Menu Monitoring'), 0)

Mobile.tap(findTestObject('Brinsmart/Dashboard/Btn - Export To Excel'), 0)

Mobile.tap(findTestObject('Brinsmart/Dashboard/android.widget.TextView - Excel'), 0)

// tunggu file benar-benar selesai di-download
Mobile.delay(12)

String adb = 'adb'

String deviceDir = '/sdcard/Download'

String localDir = 'C:/Users/ACER/Downloads'

// cari file terbaru yang namanya laporan-*.xlsx
String listCmd = ((adb + ' shell ls -t ') + deviceDir) + ' | grep \'^laporan-.*\\.xlsx\' | head -n 1'

KeywordUtil.logInfo('Running: ' + listCmd)

Process p1 = Runtime.getRuntime().exec(listCmd)

p1.waitFor()

String latestFile = p1.inputStream.text.trim()

assert latestFile : 'File laporan tidak ditemukan'

KeywordUtil.logInfo('Latest file: ' + latestFile)

String pullCmd = (((((adb + ' pull ') + deviceDir) + '/') + latestFile) + ' ') + localDir

KeywordUtil.logInfo('Running: ' + pullCmd)

Process p2 = Runtime.getRuntime().exec(pullCmd)

p2.waitFor()

if (p2.exitValue() != 0) {
    KeywordUtil.logInfo('ADB ERROR: ' + p2.errorStream.text)

    assert false : 'ADB pull gagal'
}

KeywordUtil.logInfo((('File berhasil di-pull: ' + localDir) + '/') + latestFile)

File f = new File((localDir + '/') + latestFile)

assert f.exists() : 'File tidak ada di local'

assert f.length() > 0 : 'File kosong'

// Script Dibawah Menamilkan Full Row
//String excelPath = (localDir + '/') + latestFile
//
//String expectedSubmission = 'BN57/2147/UND/WS-0101/PDG/01/26'
//
//// buka file excel
//FileInputStream fis = new FileInputStream(excelPath)
//
//Workbook workbook = new XSSFWorkbook(fis)
//
//// ambil sheet pertama (paling aman)
//Sheet sheet = workbook.getSheetAt(0)
//
//boolean found = false
//
//// mulai dari row ke-1 (index 0 = header)
//for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//    Row row = sheet.getRow(i)
//
//    if (row == null) {
//        continue
//    }
//    
//    Cell cell = row.getCell(2 // kolom C = Submission Number
//        )
//
//    if (cell == null) {
//        continue
//    }
//    
//    String submissionExcel = cell.toString().trim()
//
//    KeywordUtil.logInfo((('Row ' + (i + 1)) + ' Submission: ') + submissionExcel)
//
//    if (expectedSubmission.equalsIgnoreCase(submissionExcel)) {
//        KeywordUtil.markPassed('Submission Number ditemukan di row ' + (i + 1))
//
//        found = true
//
//        break
//    }
//}
//
//workbook.close()
//
//fis.close()
//
//assert found : 'Submission Number TIDAK ditemukan di Excel'

// Script Dibawah Menampilkan Submission Tujuan
String excelPath = localDir + "/" + latestFile
String targetSubmission = "BN57/2147/UND/WS-0101/PDG/01/26"

FileInputStream fis = new FileInputStream(excelPath)
Workbook workbook = new XSSFWorkbook(fis)
Sheet sheet = workbook.getSheetAt(0)

boolean found = false

for (int i = 1; i <= sheet.getLastRowNum(); i++) {

	Row row = sheet.getRow(i)
	if (row == null) continue

	Cell cell = row.getCell(2) // kolom Submission Number
	if (cell == null) continue

	if (cell.toString().trim().equalsIgnoreCase(targetSubmission)) {
		found = true
		break
	}
}

workbook.close()
fis.close()

assert found : "Submission Number tujuan TIDAK ditemukan di Excel"

KeywordUtil.markPassed(
	"Submission Number ditemukan: " + targetSubmission
)

Mobile.pressBack()

Mobile.closeApplication()

