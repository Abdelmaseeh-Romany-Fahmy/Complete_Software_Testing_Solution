package Automation_Project.Automation_Exercises.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegisterData {
	 FileInputStream stream = null;

	    public FileInputStream connectExcelFile() {
	        String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\Excel\\RegisterData.xlsx";
	        File file = new File(filePath);

	        try {
	            if (!file.exists()) {
	                throw new RuntimeException("Excel file not found at path: " + filePath);
	            }
	            stream = new FileInputStream(file);
	        } catch (IOException e) {
	            System.out.println("Error opening file: " + e.getMessage());
	            throw new RuntimeException(e);
	        }

	        return stream;
	    }

	    public Object[][] getExcelLoginData() throws IOException {
	        stream = connectExcelFile();
	        XSSFWorkbook workBook = new XSSFWorkbook(stream);
	        XSSFSheet registerSheet = workBook.getSheetAt(0);

	        int nRows = registerSheet.getLastRowNum() + 1; // no header
	        int nCols = registerSheet.getRow(0).getLastCellNum();

	        Object[][] excelData = new Object[nRows][nCols];
	     


	        for (int i = 0; i < nRows; ++i) {
	            XSSFRow currentRow = registerSheet.getRow(i);
	            for (int j = 0; j < nCols; ++j) {
	                if (currentRow.getCell(j) != null) {
	                    excelData[i][j] = currentRow.getCell(j).toString();
	                } else {
	                    excelData[i][j] = "";  
	                }
	            }
	        }
	        for (Object[] row : excelData) {
	            System.out.println("ROW => " + java.util.Arrays.toString(row));
	        }
	        workBook.close();
	        return excelData;
	    }
}
