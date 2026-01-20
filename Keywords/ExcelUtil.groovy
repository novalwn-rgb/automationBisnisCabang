import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook

class ExcelUtil {

	static String getCellValue(String filePath, int row, int col) {
		FileInputStream fis = new FileInputStream(filePath)
		Workbook wb = new XSSFWorkbook(fis)
		Sheet sheet = wb.getSheetAt(0)
		Row r = sheet.getRow(row)
		Cell c = r.getCell(col)

		c.setCellType(CellType.STRING)
		return c.getStringCellValue()
	}
}
