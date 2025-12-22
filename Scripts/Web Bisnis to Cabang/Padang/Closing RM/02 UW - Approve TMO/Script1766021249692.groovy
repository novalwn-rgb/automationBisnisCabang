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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('https://staging.underwriting.web.brinesia.app/')

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'sekar.ayuni')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Underwriting/Menu/Menu COB'))

WebUI.click(findTestObject('Underwriting/Menu/SubMenu Approval'))

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/NextSubList'))

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/lastNextSubNumber'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputTSI'), '200000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputKapasitasTreaty'), '10')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputQuotaShare'), '5')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputRIComm'), '9')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputOR'), '10')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputSurplus'), '25')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Kapasitas Treaty/inputRICommSurplus'), '20')

WebUI.scrollToElement(findTestObject('Underwriting/BrinsToUW/Sekar/InputDisposisi'), 0)

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/iframe_Disposisi'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.sendKeys(findTestObject('Underwriting/BrinsToUW/Sekar/iframe_Disposisi'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/iframe_Putusan'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.sendKeys(findTestObject('Underwriting/BrinsToUW/Sekar/iframe_Putusan'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Underwriting/BrinsToUW/Sekar/InputLimit'), 0)

WebUI.click(findTestObject('Other Cabang/Padang/UW/Tedi/Dropdown Limit'))

WebUI.click(findTestObject('Other Cabang/Padang/UW/Tedi/PilihLimit1'))

WebUI.scrollToElement(findTestObject('Underwriting/Subjectivity/Underwriting/Mira/SecSubjectivity'), 0)

//Tambah Data Subjectivity
//Dok 1
WebUI.click(findTestObject('Underwriting/BrinsToUW/Sekar/BtnTambahSubject'))

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/InputSubjectivityNote'), 'Dokumen test 1')

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/Date1'), '12/10/2025')

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/InputSubjectKet'), 'Dokumen Sample 1')

WebUI.uploadFile(findTestObject('Underwriting/BrinsToUW/Sekar/AttachSubject1'), 'C:/Users/ACER/Downloads/Sample Dokumen/samplepptx-2-1 (3)-1-1 (3).pptx')

WebUI.click(findTestObject('Underwriting/BrinsToUW/Sekar/SendSubject1'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//Dok 2
WebUI.click(findTestObject('Underwriting/Subjectivity/Underwriting/Mira/TambahSubject'))

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/InputSubjectivityNote'), 'Dokumen test 2')

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/Date2'), '11/19/2025')

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/InputSubjectKet'), 'Dokumen Sample 2')

//WebUI.uploadFile(findTestObject('Underwriting/Subjectivity/Underwriting/Mira/Attach2'), 'C:/Users/ACER/Downloads/Sample Dokumen/samplepptx-2-1 (3)-1-1 (3).pptx')
WebUI.click(findTestObject('Underwriting/BrinsToUW/Sekar/SendSubject2'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//Dok 3
WebUI.click(findTestObject('Underwriting/Subjectivity/Underwriting/Mira/TambahSubject'))

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/InputSubjectivityNote'), 'Dokumen test 3')

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/Date3'), '11/19/2025')

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/InputSubjectKet'), 'Dokumen Sample 3')

WebUI.uploadFile(findTestObject('Underwriting/BrinsToUW/Sekar/AttachSubject3'), 'C:/Users/ACER/Downloads/Sample Dokumen/Legal Consent.docx')

WebUI.click(findTestObject('Underwriting/BrinsToUW/Sekar/SendSubject3'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/DateValidity'), '12/10/2025')

WebUI.scrollToElement(findTestObject('Underwriting/Dokumen/Sec DokUnderwriting'), 0)

//Upload Dok Underwriting
//Dok 1
WebUI.click(findTestObject('Underwriting/BrinsToUW/Sekar/BtnTambahUnder'))

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/InputNamaDokUnder'), 'Dokumen test 1')

WebUI.uploadFile(findTestObject('Underwriting/BrinsToUW/Sekar/AttachUnder1'), 'C:/Users/ACER/Downloads/Sample Dokumen/samplepptx-2-1 (3)-1-1 (3).pptx')

WebUI.click(findTestObject('Underwriting/BrinsToUW/Sekar/SendUnder1'))

// Spreading of Risk
// TSI
//WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_TSI1'), '120000000')
WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/PremiSoR'), '5000000')

WebUI.setText(findTestObject('Underwriting/BrinsToUW/Sekar/KetSoR'), 'cicilan bulanan')

WebUI.click(findTestObject('Underwriting/BrinsToUW/Sekar/SendSoR1'))

//WebUI.delay(10)

// TSI Share BRINS
WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_TSI Share Brins1'), '120000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_TSI Share Brins2'), '5000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_TSI Share Brins3'), 'cicilan bulanan')

WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM2'))

// UR
WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_UR1'), '120000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_UR2'), '5000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_UR3'), 'cicilan bulanan')

WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM3'))

// OR
WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_OR1'), '120000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_OR2'), '5000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_OR3'), 'cicilan bulanan')

WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM4'))

// Quota Share
WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_Quota Share1'), '120000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_Quota Share2'), '5000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_Quota Share3'), 'cicilan bulanan')

WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM5'))

// Surplus
WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_Surplus1'), '120000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_Surplus2'), '5000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_Surplus3'), 'cicilan bulanan')

WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM6'))

// Facultative
WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_Facultative1'), '120000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_Facultative2'), '5000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_Facultative3'), 'cicilan bulanan')

WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM7'))

// Special Fac
WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_Special Fac1'), '120000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_Special Fac2'), '5000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_Special Fac3'), 'cicilan bulanan')

WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM8'))

// Status Akseptasi
WebUI.click(findTestObject('Other Cabang/Padang/UW/Tedi/Dropdown Akseptasi'))

WebUI.click(findTestObject('Other Cabang/Padang/UW/Tedi/Pilih Akseptasi4'))

WebUI.click(findTestObject('Underwriting/BrinsToUW/Sekar/BtnSubmit'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.closeBrowser()
