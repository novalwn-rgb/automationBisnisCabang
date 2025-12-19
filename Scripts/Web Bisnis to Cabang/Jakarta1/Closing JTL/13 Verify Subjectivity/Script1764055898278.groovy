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

WebUI.click(findTestObject('BusinessRM/BurgerMenu'))

WebUI.click(findTestObject('Underwriting/Subjectivity/Bisnis/Menu Aksep COB'))

WebUI.click(findTestObject('Underwriting/Subjectivity/Bisnis/SubMenu Submission'))

WebUI.click(findTestObject('Underwriting/Subjectivity/testbisnis1'))

String subjectivityStatus1 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject1'))

String subjectivityStatus2 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject2'))

String subjectivityStatus3 = WebUI.getText(findTestObject('Underwriting/Subjectivity/Bisnis/ACCSubject3'))

TestObject closingButton = findTestObject('Underwriting/Subjectivity/Bisnis/BtnClosing Instruction RM Aktif')

// Kumpulkan semua status dalam satu List
List<String> allStatuses = Arrays.asList(subjectivityStatus1.trim(), subjectivityStatus2.trim(), subjectivityStatus3.trim())

// Definisikan status yang membuat tombol NON-AKTIF
List<String> disabledStatuses = Arrays.asList('Belum Disetujui', 'Revisi', 'Waiting for Approval', 'On Hold')

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

