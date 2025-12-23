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

// HANYA 2 DATA SAJA YANG DISETUJUI
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

// ==========================================================
// A. Verifikasi Status Dokumen Putusan
// ==========================================================
//TestObject documentPutusanRowTemplate = findTestObject('Putusan/DokumenPutusanRowTemplate' // Gunakan template yang sudah ada.
//    )
//
//String documentName1 = 'Dokumen test 1'
//
//String documentName2 = 'Dokumen test 3'
//
//List<String> requiredDocuments = Arrays.asList(documentName1, documentName2)
//
//boolean allDocumentsApproved = true
//
//WebUI.comment('--- Memulai Verifikasi Dokumen Putusan ---')
//
//for (String docName : requiredDocuments) {
//    if (requiredDocuments.contains(docName)) {
//        allDocumentsApproved = true
//
//        break
//    }
//}
//    
//	if (allDocumentsApproved) {
//		println(('✅ Dokumen Putusan \'' + requiredDocuments) + '\' DITEMUKAN. (Disetujui)')
//	} else {
//		println(('❌ Dokumen Putusan \'' + requiredDocuments) + '\' TIDAK DITEMUKAN. (Belum Disetujui)')
//
//		allDocumentsApproved = false
//	}


//tes2
// Deklarasi Test Object yang sudah dibuat sebelumnya (baris pertama)
//TestObject anyDocumentRow = findTestObject('Putusan/DokPutusan Bisnis1')
//
//TestObject anyDocumentRow = findTestObject('Putusan/DokPutusan Bisnis2')
//
//// Deklarasi Test Object baru (nama dokumen di baris pertama)
//TestObject documentNameObject = findTestObject('Putusan/DokPutusan Bisnis1')
//
//TestObject documentNameObject = findTestObject('Putusan/DokPutusan Bisnis2')
//
//WebUI.comment('--- Verifikasi Dokumen Putusan (Keberadaan Baris Pertama) ---')
//
//boolean isDocumentPresent = WebUI.verifyElementPresent(anyDocumentRow, 5, FailureHandling.OPTIONAL)
//
//if (isDocumentPresent) {
//    // TAMBAHKAN LANGKAH INI: Ambil nama dokumen yang ditemukan
//    String namaDokumenDitemukan = WebUI.getText(documentNameObject).trim()
//
//    println('✅ Dokumen Putusan DITEMUKAN. Persetujuan berhasil diverifikasi.')
//
//    // Tampilkan nama dokumen yang ditemukan
//    println('   -> Dokumen yang ditampilkan: ' + namaDokumenDitemukan) // Lanjutkan dengan klik tombol/aksi berikutnya di halaman ini.
//    // WebUI.click(findTestObject('...'))
//    // WebUI.stopTestCase()
//} else {
//    println('❌ Dokumen Putusan TIDAK DITEMUKAN. (Asumsi: Belum disetujui atau gagal tampil).')
//}



String subjectivityStatus1 = WebUI.getText(findTestObject('Putusan/DokPutusan Bisnis1'))

String subjectivityStatus2 = WebUI.getText(findTestObject('Putusan/DokPutusan Bisnis2'))

List<String> isDocumentPresent = Arrays.asList(subjectivityStatus1.trim(), subjectivityStatus2.trim())

List<String> DocumentNotPresent = Arrays.asList('Dokumen test 2', 'Dokumen test 4')

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
