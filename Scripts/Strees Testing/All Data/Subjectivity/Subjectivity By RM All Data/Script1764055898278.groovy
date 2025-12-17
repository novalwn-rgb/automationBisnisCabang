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

WebUI.click(findTestObject('Underwriting/Approve JTL/Dashboard/LastNextSub'))

WebUI.click(findTestObject('Subjectivity/Underwriting/tesUW7'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.scrollToElement(findTestObject('Subjectivity/Underwriting/Mira/SecSubjectivity'), 0)

//Dok 1
//WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/TambahSubject'))
//
//WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/textAreaSubjectivityNote'), 'Dokumen test 1')
//
//WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/DataSubject1'), '11/19/2025')
//
//WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/SubjectivityDescription'), 'Dokumen Sample 1')
//
//WebUI.uploadFile(findTestObject('Subjectivity/Underwriting/Mira/Attach1'), 'C:/Users/ACER/Downloads/Sample Dokumen/example-fake-zip-file-1mb (1) (1).zip')
//
//WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/SendSubject1'))
//
//WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.acceptAlert()

//Dok 2
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/TambahSubject'))

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/textAreaSubjectivityNote'), 'Dokumen test 2')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/DateSubject2'), '11/19/2025')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/SubjectivityDescription'), 'Dokumen Sample 2')

//WebUI.uploadFile(findTestObject('Subjectivity/Underwriting/Mira/Attach2'), 'C:/Users/ACER/Downloads/Sample Dokumen/samplepptx-2-1 (3)-1-1 (3).pptx')
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/SendSubject2'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//Dok 3
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/TambahSubject'))

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/textAreaSubjectivityNote'), 'Dokumen test 3')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/DateSubject3'), '11/19/2025')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/SubjectivityDescription'), 'Dokumen Sample 3')

WebUI.uploadFile(findTestObject('Subjectivity/Underwriting/Mira/Attach3'), 'C:/Users/ACER/Downloads/Sample Dokumen/Legal Consent.docx')

WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/SendSubject3'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//Dok 4
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/TambahSubject'))

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/textAreaSubjectivityNote'), 'Dokumen test 4')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/DateSubject4'), '11/19/2025')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/SubjectivityDescription'), 'Dokumen Sample 4')

//WebUI.uploadFile(findTestObject('Subjectivity/Underwriting/Mira/Attach4'), 'C:/Users/ACER/Downloads/Sample Dokumen/SampleVideo_1280x720_1mb.mp4')
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/SendSubject4'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//Dok 5
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/TambahSubject'))

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/textAreaSubjectivityNote'), 'Dokumen test 5')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/DateSubject5'), '11/19/2025')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/SubjectivityDescription'), 'Dokumen Sample 5')

//WebUI.uploadFile(findTestObject('Subjectivity/Underwriting/Mira/Attach5'), 'C:/Users/ACER/Downloads/Sample Dokumen/BN57673UNDFL-0202SMG0725..pdf')
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/SendSubject5'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//Dok 6
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/TambahSubject'))

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/textAreaSubjectivityNote'), 'Dokumen test 6')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/DateSubject6'), '11/19/2025')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/SubjectivityDescription'), 'Dokumen Sample 6')

WebUI.uploadFile(findTestObject('Subjectivity/Underwriting/Mira/Attach6'), 'C:/Users/ACER/Downloads/Sample Dokumen/sample2.jpg')

WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/SendSubject6'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//Dok 7
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/TambahSubject'))

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/textAreaSubjectivityNote'), 'Dokumen test 7')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/DateSubject7'), '11/19/2025')

WebUI.setText(findTestObject('Subjectivity/Underwriting/Mira/SubjectivityDescription'), 'Dokumen Sample 7')

//WebUI.uploadFile(findTestObject('Subjectivity/Underwriting/Mira/Attach7'), 'C:/Users/ACER/Downloads/Sample Dokumen/Monitoring Akseptasi COB.xlsx')
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/SendSubject7'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//All CheckBox
WebUI.click(findTestObject('Subjectivity/Underwriting/Mira/AllcheckBoxSubjectivity'))

WebUI.scrollToElement(findTestObject('Underwriting/Approve JTL/SecFasterDecision1'), 0)

WebUI.setText(findTestObject('Underwriting/Approve TMO/Decision By RM/inputDisposisi'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Decision By RM/inputPutusan'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.click(findTestObject('Underwriting/Approve TMO/Decision By RM/Btn Decision'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()