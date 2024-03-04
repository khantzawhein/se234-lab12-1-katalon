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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('http://47.128.186.251:8080/')

WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_studentId_studentId'), '63')

WebUI.click(findTestObject('Page_Vite App/button_checkPartialStudents'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/td_student_id'), '6321105008')

WebUI.verifyElementText(findTestObject('Page_Vite App/td_student_id_2'), '6321155667')

WebUI.verifyElementText(findTestObject('Page_Vite App/td_first_name_2'), 'Hiroko')

WebUI.verifyElementText(findTestObject('Page_Vite App/td_gpa_2'), '0.20')

WebUI.verifyElementText(findTestObject('Page_Vite App/td_last_name_2'), 'Basket')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/div_total_gpa'), '0.72')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/td_first_name'), 'Job')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/td_last_name'), 'Sung')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vite App/td_gpa'), '1.25')

WebDriver driver = DriverFactory.getWebDriver()

WebElement table = driver.findElement(By.xpath('//*[@id="app"]/div[3]/div/div/div/table/tbody'))

List<WebElement> table_row = table.findElements(By.tagName('tr'))

int row_counts = table_row.size()

WebUI.verifyEqual(2, table_row.size())

WebUI.closeBrowser()

