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

Mobile.setText(findTestObject('Brinsmart/Login/InputEmail'), 'cob.lampung.rm', 0)

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

// Script Menampilkan submission tujuan, tapi file yang terdownload di dekstop selesai verifikasi akan terhapus
String adb = 'adb'
String deviceDir = '/sdcard/Download'
String localDir = 'C:/Users/ACER/Downloads'
String targetSubmission = "BN57/2157/UND/FR-0103/TKG/01/26"

String latestFile = ""
File localFile = null

try {

	// 🔍 Cari file excel terbaru di device
	String listCmd = "${adb} shell ls -t ${deviceDir} | grep '^laporan-.*\\.xlsx' | head -n 1"
	KeywordUtil.logInfo("Running: " + listCmd)

	Process p1 = Runtime.getRuntime().exec(listCmd)
	p1.waitFor()

	latestFile = p1.inputStream.text.trim()
	assert latestFile : "File laporan tidak ditemukan di device"

	// ⬇️ Pull file ke local (sementara)
	String pullCmd = "${adb} pull ${deviceDir}/${latestFile} ${localDir}"
	KeywordUtil.logInfo("Running: " + pullCmd)

	Process p2 = Runtime.getRuntime().exec(pullCmd)
	p2.waitFor()

	if (p2.exitValue() != 0) {
		KeywordUtil.logInfo("ADB ERROR: " + p2.errorStream.text)
		assert false : "ADB pull gagal"
	}

	localFile = new File("${localDir}/${latestFile}")
	assert localFile.exists() && localFile.length() > 0 : "File excel kosong / tidak valid"

	// 📖 BACA & VERIFIKASI EXCEL
	FileInputStream fis = new FileInputStream(localFile)
	Workbook workbook = new XSSFWorkbook(fis)
	Sheet sheet = workbook.getSheetAt(0)

	boolean found = false
	int excelRow = -1
	String dataOrder = ""

	for (int i = 1; i <= sheet.getLastRowNum(); i++) {

		Row row = sheet.getRow(i)
		if (row == null) continue

		Cell submissionCell = row.getCell(2)
		if (submissionCell == null) continue

		if (submissionCell.toString().trim().equalsIgnoreCase(targetSubmission)) {

			found = true
			excelRow = i + 1

			Cell noCell = row.getCell(0)
			if (noCell != null) {
				dataOrder = noCell.toString().trim()
			}
			break
		}
	}

	workbook.close()
	fis.close()

	assert found : "Submission Number tujuan TIDAK ditemukan: " + targetSubmission

	KeywordUtil.markPassed(
		"Submission Number [" + targetSubmission + "] ditemukan | " +
		"Row Excel: " + excelRow +
		" | Nomor urut data pada tabel: " + dataOrder
	)

} finally {

	// 🧹 CLEANUP — HAPUS FILE LOCAL (SELALU DIEKSEKUSI)
	if (localFile != null && localFile.exists()) {
		if (localFile.delete()) {
			KeywordUtil.logInfo("File Excel local berhasil dihapus: " + localFile.name)
		} else {
			KeywordUtil.markWarning("Gagal menghapus file Excel local: " + localFile.name)
		}
	}
}

Mobile.pressBack()

Mobile.closeApplication()

