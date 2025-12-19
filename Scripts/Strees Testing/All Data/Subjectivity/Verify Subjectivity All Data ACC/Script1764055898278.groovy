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

WebUI.click(findTestObject('Underwriting/Subjectivity/Bisnis/Menu Aksep COB'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.click(findTestObject('Underwriting/Subjectivity/Bisnis/SubMenu Submission'))

WebUI.click(findTestObject('Underwriting/Subjectivity/testbisnis1'))

//				// ----------------------------------------
//				// A. Ambil Status Subjectivity
//				// ----------------------------------------
//	
//					String subjectivityStatus1 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject1'))
//					String subjectivityStatus2 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject2'))
//					String subjectivityStatus3 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject3'))
//					String subjectivityStatus4 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject4'))
//					String subjectivityStatus5 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject5'))
//					String subjectivityStatus6 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject6'))
//					String subjectivityStatus7 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject7'))
//				
//					TestObject closingButton = findTestObject('Subjectivity/Bisnis/BtnClosing Instruction RM')
//				
//				
//					if (subjectivityStatus1.trim() == 'Belum Disetujui') {
//					    
//					    WebUI.verifyElementAttributeValue(closingButton, 'disabled', 'true', 10, FailureHandling.STOP_ON_FAILURE)
//					
//					    println('Status \'Belum Disetujui\' terdeteksi. Tombol Closing Instruction diverifikasi TIDAK DAPAT di-klik (DISABLED).') // KONDISI 2: Disetujui -> Tombol HARUS AKTIF dan DAPAT di-klik
//					    
//				
//					} else if (subjectivityStatus1.trim() == 'Disetujui') {
//					    WebUI.verifyElementPresent(closingButton, 10, FailureHandling.STOP_ON_FAILURE)
//					
//					    try {
//					        WebUI.verifyElementAttributeValue(closingButton, 'disabled', 'false', 3, FailureHandling.CONTINUE_ON_FAILURE)
//					
//					        println('Status \'Disetujui\' terdeteksi. Tombol Closing Instruction diverifikasi DAPAT di-klik.')
//					    }
//					    catch (Exception e) {
//					    } 
//					} else {
//					    WebUI.comment('Status Subjectivity : ' + subjectivityStatus1)
//						WebUI.comment('Status Subjectivity : ' + subjectivityStatus2)
//						WebUI.comment('Status Subjectivity : ' + subjectivityStatus3)
//						WebUI.comment('Status Subjectivity : ' + subjectivityStatus4)
//						WebUI.comment('Status Subjectivity : ' + subjectivityStatus5)
//						WebUI.comment('Status Subjectivity : ' + subjectivityStatus6)
//						WebUI.comment('Status Subjectivity : ' + subjectivityStatus7)
//					
//					    WebUI.verifyElementPresent(closingButton, 1, FailureHandling.STOP_ON_FAILURE)
//					}
// ... Ambil status 1-7 (seperti di script Anda) ...
String subjectivityStatus1 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject1'))

String subjectivityStatus2 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject2'))

String subjectivityStatus3 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject3'))

String subjectivityStatus4 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject4'))

String subjectivityStatus5 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject5'))

String subjectivityStatus6 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject6'))

String subjectivityStatus7 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject7'))

TestObject closingButton = findTestObject('Underwriting/Subjectivity/Bisnis/BtnClosing Instruction RM Aktif')

// Kumpulkan semua status dalam satu List
List<String> allStatuses = Arrays.asList(subjectivityStatus1.trim(), subjectivityStatus2.trim(), subjectivityStatus3.trim(), 
    subjectivityStatus4.trim(), subjectivityStatus5.trim(), subjectivityStatus6.trim(), subjectivityStatus7.trim())

// Definisikan status yang membuat tombol NON-AKTIF
List<String> disabledStatuses = Arrays.asList('Belum Disetujui', 'Revisi', 'Waiting for Approval', 'On Hold')

//List<String> enabledStatuses = Arrays.asList('Disetujui')

// Cek apakah ada satu pun status di List yang masuk ke kategori DISABLED
boolean isAnyDisabled = false

for (String status : allStatuses) {
    if (disabledStatuses.contains(status)) {
        isAnyDisabled = true

        break
    } 
}

if (!(isAnyDisabled)) {
    // KONDISI 1: TIDAK ADA yang DISABLED (Berarti semua pasti Disetujui) -> Tombol AKTIF
    WebUI.verifyElementPresent(closingButton, 10, FailureHandling.STOP_ON_FAILURE)

    //WebUI.verifyElementAttributeValue(closingButton, 'disabled', 'false', 3, FailureHandling.CONTINUE_ON_FAILURE)

	// Verifikasi 2: Pastikan elemen bisa DIKLIK (Ini membuktikan bahwa tombol aktif/enabled)
	WebUI.waitForElementClickable(closingButton, 10, FailureHandling.STOP_ON_FAILURE)
	
    println('SEMUA status Disetujui. Tombol Closing Instruction AKTIF.')
	
	for (int i = 0; i < allStatuses.size(); i++) {
		WebUI.comment((('Status Subjektivitas ke-' + (i + 1)) + ': ') + allStatuses.get(i))
	}
	
} else {
    WebUI.verifyElementAttributeValue(closingButton, 'disabled', 'true', 10, FailureHandling.STOP_ON_FAILURE)

    println('Ada status yang belum terpenuhi/revisi. Tombol Closing Instruction DISABLED.')

    for (int i = 0; i < allStatuses.size(); i++) {
        WebUI.comment((('Status Subjektivitas ke-' + (i + 1)) + ': ') + allStatuses.get(i))
    }
}

