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
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

// ALL DATA DISETUJUI
WebUI.openBrowser('https://staging.underwriting.web.brinesia.app/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'miranti.cecilia')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Underwriting/Menu/Menu Aksep COB'))

WebUI.click(findTestObject('Underwriting/Menu/SubMenu Approval'))

WebUI.click(findTestObject('Underwriting/Search Pengajuan'))

WebUI.click(findTestObject('Underwriting/All Pengajuan'))

WebUI.click(findTestObject('Underwriting/BtnCari'))

WebUI.click(findTestObject('Underwriting/Approve JTL/Dashboard/LastNextSub'))

WebUI.click(findTestObject('Underwriting/Subjectivity/Underwriting/testUW6'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

String underwritingDok1 = WebUI.getText(findTestObject('Putusan/DokUnderwriting 1'))

String underwritingDok2 = WebUI.getText(findTestObject('Putusan/DokUnderwriting 2'))

String underwritingDok3 = WebUI.getText(findTestObject('Putusan/DokUnderwriting 3'))

List<String> isDocumentPresent = Arrays.asList(underwritingDok1.trim(), underwritingDok2.trim(), underwritingDok3.trim())

List<String> DocumentNotPresent = Arrays.asList('Tidak Ada')

boolean isAnyDocument = true

for (String status : isDocumentPresent) {
    if (DocumentNotPresent.contains(status)) {
        isAnyDisabled = true

        break
    }
}

if (isAnyDocument) {
    println('✅ Dokumen Underwriting DITEMUKAN.')

    for (int i = 0; i < isDocumentPresent.size(); i++) {
        WebUI.comment((('Dokumen yang ditampilkan: ' + (i + 1)) + ': ') + isDocumentPresent.get(i))
    }
} else {
    println('❌ Dokumen Underwriting TIDAK DITEMUKAN. (Asumsi: Dokumen tidak dimasukan).')
}

