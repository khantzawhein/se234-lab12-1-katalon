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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://47.128.186.251:8080/')

WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_studentId_studentId'), studentId)

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Check Student'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/td_student_id'), studentId)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/td_first_name'), name)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/td_last_name'), surname)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/td_gpa'), gpa)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/div_total_gpa'), totalGpa)

WebUI.closeBrowser()

