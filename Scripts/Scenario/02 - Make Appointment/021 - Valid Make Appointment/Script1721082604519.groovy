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

WebUI.callTestCase(findTestCase('Scenario/01 - Login Scenario/011 - Valid Login'), [('username') : 'John Doe', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Appointment_Page/select_facility'), facility, true)

//WebUI.click(findTestObject('Appointment_Page/check_apply-readmission'))
if (hospital_readmission == true) {
    WebUI.check(findTestObject('Appointment_Page/check_apply-readmission'))
}

//WebUI.click(findTestObject('Appointment_Page/radio_medicare'))
def select_radio = healthcare_program

switch (select_radio) {
    case select_radio = 'Medicare':
        println(select_radio)

        WebUI.click(findTestObject('Appointment_Page/radio_medicare'))

        break
    case select_radio = 'Medicaid':
        println(select_radio)

        WebUI.click(findTestObject('Appointment_Page/radio_medicaid'))

        break
    case select_radio = 'None':
        println(select_radio)

        WebUI.click(findTestObject('Appointment_Page/radio_none'))

        break
    default:
        println(select_radio)

        WebUI.click(findTestObject('Appointment_Page/radio_none'))

        break
}

WebUI.setText(findTestObject('Appointment_Page/input_visit_date'), visit_date)

WebUI.setText(findTestObject('Appointment_Page/textarea_comment'), comment)

WebUI.click(findTestObject('Appointment_Page/btn_book-appointment'))

WebUI.waitForElementVisible(findTestObject('Confirmation_Page/a_Go-to-Homepage'), 15)

WebUI.verifyElementText(findTestObject('Confirmation_Page/lbl-isi_facility'), facility)

WebUI.verifyElementText(findTestObject('Confirmation_Page/lbl-isi_visit-date'), visit_date)

//WebUI.verifyElementText(findTestObject('Confirmation_Page/lbl-isi_apply-readmission'), 'Yes')
if (hospital_readmission == true) {
    WebUI.verifyElementText(findTestObject('Confirmation_Page/lbl-isi_apply-readmission'), 'Yes')
} else {
    WebUI.verifyElementText(findTestObject('Confirmation_Page/lbl-isi_apply-readmission'), 'No')
}

//WebUI.verifyElementText(findTestObject('Confirmation_Page/lbl-isi_program'), healthcare_program)
switch (select_radio) {
    case select_radio = 'Medicare':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Confirmation_Page/lbl-isi_program'), 'Medicare')

        break
    case select_radio = 'Medicaid':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Confirmation_Page/lbl-isi_program'), 'Medicaid')

        break
    case select_radio = 'None':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Confirmation_Page/lbl-isi_program'), 'None')

        break
    default:
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Confirmation_Page/lbl-isi_program'), 'None')

        break
}

WebUI.verifyElementText(findTestObject('Confirmation_Page/lbl_comment'), comment)

WebUI.delay(3)

WebUI.closeBrowser()

