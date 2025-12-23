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
import java.util.Arrays as Arrays

//Step 1 
WebUI.openBrowser('https://staging.business.web.brinesia.app/')

WebUI.setText(findTestObject('BusinessRM/inputEmail'), 'cob.semanggi.admin')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('BusinessRM/inputOTP'), '123456')

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.dismissAlert()

WebUI.click(findTestObject('BusinessRM/BurgerMenu'))

WebUI.click(findTestObject('BusinessRM/AksepCOB'))

WebUI.click(findTestObject('BusinessRM/Submission'))

//WebUI.click(findTestObject('BusinessRM/tambahData'))

//WebUI.click(findTestObject('BusinessRM/TidakSub'))

//def dropdownObject1 = findTestObject('BusinessRM/Nama Relationship Manager')

//WebUI.selectOptionByLabel(dropdownObject1, 'COB Semanggi RM', false)

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

// Closing Instruction by JTL 
//WebUI.click(findTestObject('BusinessRM/inputCaptive'))

//WebUI.click(findTestObject('BusinessRM/sumberBisnis'))

//def dropdownObject2 = findTestObject('BusinessRM/sumberBisnis')

//WebUI.selectOptionByLabel(dropdownObject2, 'Direct', false)

//WebUI.waitForElementClickable(findTestObject('BusinessRM/sumberBisnis'), 0)

//WebUI.setText(findTestObject('BusinessRM/COB'), 'PROPERTY')

//WebUI.sendKeys(findTestObject('BusinessRM/COB'), Keys.chord(Keys.ENTER))

//WebUI.waitForElementClickable(findTestObject('BusinessRM/COB'), 0)

//WebUI.setText(findTestObject('BusinessRM/TOC'), 'Rumahku')

//WebUI.sendKeys(findTestObject('BusinessRM/TOC'), Keys.chord(Keys.ENTER))

//WebUI.waitForElementClickable(findTestObject('BusinessRM/TOC'), 0)

//def dropdownObject3 = findTestObject('BusinessRM/StatusPenutupan')

//WebUI.selectOptionByLabel(dropdownObject3, 'New', false)

//WebUI.setText(findTestObject('BusinessRM/Tertanggung'), 'Automation QA4')

//WebUI.click(findTestObject('BusinessRM/lewatiPeriode'))

//WebUI.delay(2)

//WebUI.scrollToElement(findTestObject('BusinessRM/Departement'), 0)

//def dropdownObject4 = findTestObject('BusinessRM/Departement')

//WebUI.selectOptionByLabel(dropdownObject4, 'Wholesale', false)

//def dropdownObject5 = findTestObject('BusinessRM/Segment')

//WebUI.selectOptionByLabel(dropdownObject5, 'INDIVIDUAL', false)

//def dropdownObject6 = findTestObject('BusinessRM/TSI_Currency')

//WebUI.selectOptionByLabel(dropdownObject6, 'IDR', false)

//WebUI.setText(findTestObject('BusinessRM/input_TSI'), '120000000')

//WebUI.setText(findTestObject('BusinessRM/input_Share'), '10')

//WebUI.setText(findTestObject('BusinessRM/input_Biaya Akuisisi'), '14')

//WebUI.setText(findTestObject('BusinessRM/Informasi Objek'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

//WebUI.setText(findTestObject('BusinessRM/input_Loss Record'), 'testing')

//def dropdownObject7 = findTestObject('BusinessRM/Frekuensi Klaim')

//WebUI.selectOptionByLabel(dropdownObject7, '4', false)

//WebUI.setText(findTestObject('BusinessRM/Loss Improvement'), 'testing')

//WebUI.setText(findTestObject('BusinessRM/Submission Note'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

//WebUI.click(findTestObject('BusinessRM/buttonNext'))

//WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

//WebUI.acceptAlert()

WebUI.click(findTestObject('BusinessRM/FirstSubList'))

WebUI.click(findTestObject('BusinessRM/buttonNext'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.click(findTestObject('BusinessRM/tambahDok'))

WebUI.setText(findTestObject('BusinessRM/namaDok'), 'Dokumen Sample')

WebUI.uploadFile(findTestObject('BusinessRM/New/AddDok'), 'C:/Users/ACER/Downloads/Sample Dokumen/sample2.jpg')

WebUI.click(findTestObject('BusinessRM/buttonAjukan'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.click(findTestObject('BusinessRM/BurgerMenu'))

WebUI.click(findTestObject('BusinessRM/SignOut'))

// Step 2
WebUI.switchToWindowUrl('https://staging.underwriting.web.brinesia.app/')

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'ariq.maldini')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Underwriting/Menu/Menu Aksep COB'))

WebUI.click(findTestObject('Underwriting/Menu/SubMenu Approval'))

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/lastNext'))

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/lastNextSubNumber'))

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

WebUI.uploadFile(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/AddDokSubject1'), 'C:/Users/ACER/Downloads/Sample Dokumen/sample.pdf')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/ButtonSendSubject1'))

//script dibawah berguna ketika upload file pertama
WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

//
//Script diatas ketika upload kedia tidak berlaku, dan step selanjutnya harus close tab baru
//Kemudian ulangin upload file lagi coba
WebUI.click(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/AddSubjectivity'))

WebUI.setText(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/SubjectivityNote'), 'Dokumen Sample')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/inputDateSubject'), '11/19/2025')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/SubjectivityDescription'), 'lanjut testing')

WebUI.uploadFile(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/AddDokSubject2'), 'C:/Users/ACER/Downloads/Sample Dokumen/sample2.jpg')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dokumen Subjectivity/ButtonSendSubject2'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.switchToWindowIndex(0)

WebUI.setText(findTestObject('Underwriting/Approve TMO/inputDateValidity'), '11/19/2025')

//Upload Dok Underwriting
WebUI.click(findTestObject('Underwriting/Approve TMO/Dokumen Underwriting/AddDocUnder'))

WebUI.setText(findTestObject('Underwriting/Approve TMO/Dokumen Underwriting/inputNamaDok'), 'Dokumen Sample')

WebUI.uploadFile(findTestObject('Underwriting/Approve TMO/Dokumen Underwriting/AddDokUnder'), 'C:/Users/ACER/Downloads/Sample Dokumen/sample.pdf')

WebUI.delay(2)

WebUI.click(findTestObject('Underwriting/Approve TMO/Dokumen Underwriting/ButtonSendUnder'))

// Spreading of Risk
// TSI
//WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_TSI1'), '120000000')
WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_TSI2'), '5000000')

WebUI.setText(findTestObject('Underwriting/Approve TMO/Spreding of Risk/input_TSI3'), 'cicilan bulanan')

WebUI.click(findTestObject('Underwriting/Approve TMO/Spreding of Risk/BtnKIRIM1'))

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
WebUI.click(findTestObject('Underwriting/Approve TMO/input_StatusAkseptasi'))

WebUI.setText(findTestObject('Underwriting/Approve TMO/input_StatusAkseptasi'), 'Process')

WebUI.sendKeys(findTestObject('Underwriting/Approve TMO/input_StatusAkseptasi'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Underwriting/Approve TMO/buttonSubmit'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('BusinessRM/SignOut'))

//Step 3
//WebUI.switchToWindowUrl('https://staging.underwriting.web.brinesia.app/')

WebUI.setText(findTestObject('Underwriting/Login/inputEmail'), 'miranti.cecilia')

WebUI.click(findTestObject('BusinessRM/buttonEnter'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Underwriting/Login/inputOTP'), '123456')

WebUI.click(findTestObject('Underwriting/Approve TMO/Dashboard/burgerMenu'))

WebUI.click(findTestObject('Underwriting/Menu/Menu Aksep COB'))

//WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.click(findTestObject('Underwriting/Menu/SubMenu Approval'))

WebUI.click(findTestObject('Underwriting/Approve JTL/Dashboard/LastNextSub'))

WebUI.click(findTestObject('Underwriting/Approve JTL/Dashboard/LastSubDetail1'))

WebUI.click(findTestObject('BusinessRM/closeInstallApp'))

WebUI.scrollToElement(findTestObject('Underwriting/Approve JTL/SecFasterDecision1'), 0)

WebUI.setText(findTestObject('Underwriting/Approve JTL/input_Disposisi'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.setText(findTestObject('Underwriting/Approve JTL/input_putusan'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.click(findTestObject('Underwriting/Approve JTL/Dokumen Putusan/AddDokPutusan'))

WebUI.setText(findTestObject('Underwriting/Approve JTL/Dokumen Putusan/namaDokPutusan'), 'Dokumen Sample')

WebUI.uploadFile(findTestObject('Underwriting/Approve JTL/Dokumen Putusan/AttDokPutusan'), 'C:/Users/ACER/Downloads/Sample Dokumen/sample2.jpg')

WebUI.click(findTestObject('Underwriting/Approve JTL/Dokumen Putusan/SendDokPutusan'))

WebUI.click(findTestObject('Underwriting/Approve JTL/Btn Closing Instruction1'))

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.waitForAlert(10, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()


