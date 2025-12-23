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

WebUI.openBrowser('https://staging.underwriting.web.brinesia.app/')

//Approval by JTL
//WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'miranti.cecilia')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Underwriting/Menu/Menu Aksep COB'))

WebUI.click(findTestObject('Underwriting/Menu/SubMenu Approval'))

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/lastNext'))

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/submissionDetail'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputTSI'), '200000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputKapasitasTreaty'), '10')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputQuotaShare'), '5')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputRIComm'), '9')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputOR'), '10')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputSurplus'), '25')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputRICommSurplus'), '20')

WebUI.scrollToElement(findTestObject('Underwriting/Approve TMO/inputDisposisi'), 0)

WebUI.delay(1)

WebUI.setText(findTestObject('Underwriting/Approve TMO/inputDisposisi'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.setText(findTestObject('Underwriting/Approve TMO/inputDraft'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.scrollToElement(findTestObject('Underwriting/Approve TMO/inputLimit'), 0)

WebUI.setText(findTestObject('Underwriting/Approve TMO/inputLimit'), 'Junior Team Leader')

WebUI.sendKeys(findTestObject('Underwriting/Approve TMO/inputLimit'), Keys.chord(Keys.ENTER))

//Tambah Data Subjectivity

WebUI.click(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/AddSubjectivity'))
WebUI.setText(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/SubjectivityNote'), 'Dokumen Sample')
WebUI.setText(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/inputDateSubject'), '11/19/2025')
WebUI.setText(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/SubjectivityDescription'), 'lanjut testing')
		
		//Script Upload Dokumen "Gagal" Loc File sudah benar 
		//WebUI.click(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/AttachmentSubjectivity'))
		//WebUI.uploadFile(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/AttachmentSubjectivity'), 'D:/Sample Dokumen/sample.pdf')
		
WebUI.click(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/ButtonSendSubject1'))
WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)
WebUI.acceptAlert()
WebUI.delay(2)

WebUI.setText(findTestObject('Underwriting/Approve TMO/inputDateValidity'), '11/19/2025')

		//Stript Opsi 2
		//String filePath1 = 'C:/Users/ACER/Downloads/Legal Consent'
		//WebUI.uploadFile(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/AttachmentSubjectivity'), filePath1)
		
		//Upload Dok Underwriting
		//WebUI.click(findTestObject('Underwriting/Approve TMO/Dokumen Underwriting/AddDocUnder'))
		//WebUI.setText(findTestObject('Underwriting/Approve TMO/Dokumen Underwriting/inputNamaDok'), 'sample')
		//WebUI.click(findTestObject('Underwriting/Approve TMO/Dokumen Underwriting/AttachmentDocUnder'))
		//WebUI.uploadFile(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/AttachmentSubjectivity'), 'D:/Sample Dokumen/sample.pdf')
		
// Spreading of Risk
// TSI
//WebUI.setText(findTestObject('null'), '120000000')
WebUI.setText(findTestObject('null'), '5000000')
WebUI.setText(findTestObject('null'), 'cicilan bulanan')

// TSI Share BRINS
WebUI.setText(findTestObject('null'), '120000000')
WebUI.setText(findTestObject('null'), '5000000')
WebUI.setText(findTestObject('null'), 'cicilan bulanan')

// UR
WebUI.setText(findTestObject('null'), '120000000')
WebUI.setText(findTestObject('null'), '5000000')
WebUI.setText(findTestObject('null'), 'cicilan bulanan')

// OR
WebUI.setText(findTestObject('null'), '120000000')
WebUI.setText(findTestObject('null'), '5000000')
WebUI.setText(findTestObject('null'), 'cicilan bulanan')

// Quota Share
WebUI.setText(findTestObject('null'), '120000000')
WebUI.setText(findTestObject('null'), '5000000')
WebUI.setText(findTestObject('null'), 'cicilan bulanan')

// Surplus
WebUI.setText(findTestObject('null'), '120000000')
WebUI.setText(findTestObject('null'), '5000000')
WebUI.setText(findTestObject('null'), 'cicilan bulanan')

// Facultative
WebUI.setText(findTestObject('null'), '120000000')
WebUI.setText(findTestObject('null'), '5000000')
WebUI.setText(findTestObject('null'), 'cicilan bulanan')

// Special Fac
WebUI.setText(findTestObject('null'), '120000000')
WebUI.setText(findTestObject('null'), '5000000')
WebUI.setText(findTestObject('null'), 'cicilan bulanan')

// Send Spreading of Disk
WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM1'))
WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM2'))
WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM3'))
WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM4'))
WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM5'))
WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM6'))
WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM7'))
WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM8'))

// Status Akseptasi
	//WebUI.click(findTestObject('Underwriting/Approve TMO/input_StatusAkseptasi'))
	
	//WebUI.setText(findTestObject('Underwriting/Approve TMO/input_StatusAkseptasi'), 'Process')
	
	//WebUI.sendKeys(findTestObject('Underwriting/Approve TMO/input_StatusAkseptasi'), Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Underwriting/Approve TMO/buttonSubmit'))

