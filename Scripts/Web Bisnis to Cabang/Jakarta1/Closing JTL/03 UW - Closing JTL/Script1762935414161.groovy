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

WebUI.openBrowser('https://staging.underwriting.web.brinesia.app/')

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'm.alfath')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Underwriting/Menu/Menu Aksep COB'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.click(findTestObject('Underwriting/Menu/SubMenu Approval'))

//WebUI.click(findTestObject('Underwriting/Approve JTL/Dashboard/LastNextSub'))

WebUI.click(findTestObject('Underwriting/Approve JTL/Dashboard/LastSubDetail1'))

WebUI.scrollToElement(findTestObject('Subjectivity/Underwriting/Mira/SecSubjectivity'), 0)

//Dok 2
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/TambahSubject'))

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/textAreaSubjectivityNote'), 'Dokumen test 2')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/Date2'), '11/19/2025')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/SubjectivityDescription'), 'Dokumen Sample 2')

//WebUI.uploadFile(findTestObject('Subjectivity/Underwriting/Mira/Attach2'), 'C:/Users/ACER/Downloads/Sample Dokumen/samplepptx-2-1 (3)-1-1 (3).pptx')
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/SendSubject2'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//Dok 3
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/TambahSubject'))

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/textAreaSubjectivityNote'), 'Dokumen test 3')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/Date3'), '11/19/2025')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/SubjectivityDescription'), 'Dokumen Sample 3')

WebUI.uploadFile(findTestObject('Subjectivity/Underwriting/Mira/Attach3'), 'C:/Users/ACER/Downloads/Sample Dokumen/Legal Consent.docx')

WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/SendSubject3'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//All CheckBox
//WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/AllcheckBoxSubjectivity'))

WebUI.scrollToElement(findTestObject('Underwriting/Approve JTL/SecFasterDecision1'), 0)

WebUI.setText(findTestObject('Underwriting/Approve TMO/Decision By RM/inputDisposisi'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Decision By RM/inputPutusan'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.scrollToElement(findTestObject('Putusan/SecDok Putusan'), 0)

//Dok 1
WebUI.click(findTestObject('Putusan/BtnTambah Putusan'))

WebUI.setText(findTestObject('Putusan/inputNama Dok'), 'Dokumen test 1')

WebUI.uploadFile(findTestObject('Putusan/Attach1'), 'C:/Users/ACER/Downloads/Sample Dokumen/samplepptx-2-1 (3)-1-1 (3).pptx')

WebUI.click(findTestObject('Putusan/Send1'))

//Dok 2
WebUI.click(findTestObject('Putusan/BtnTambah Putusan'))

WebUI.setText(findTestObject('Putusan/inputNama Dok'), 'Dokumen test 2')

WebUI.uploadFile(findTestObject('Putusan/Attach2'), 'C:/Users/ACER/Downloads/Sample Dokumen/Legal Consent.docx')

WebUI.click(findTestObject('Putusan/Send2'))

//checkbox berlaku untuk non captive
//WebUI.click(findTestObject('Putusan/CheckBoxDecision1'))
//
//WebUI.click(findTestObject('Putusan/CheckBoxDecision2'))

WebUI.click(findTestObject('Underwriting/Approve JTL/Btn Closing Instruction1'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

