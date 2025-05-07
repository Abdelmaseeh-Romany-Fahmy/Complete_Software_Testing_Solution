package Automation_Project.Automation_Exercises.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ContactData {
    FileInputStream stream = null;

    public FileInputStream connectExcelFile() {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\Excel\\ContactUSData.xlsx";
        File file = new File(filePath);

        if (!file.exists()) {
            throw new RuntimeException("Excel file not found: " + filePath);
        }

        try {
            stream = new FileInputStream(file);
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }

        return stream;
    }

    public Object[][] getExcelLoginData() throws IOException {
        stream = connectExcelFile();
        XSSFWorkbook workBook = new XSSFWorkbook(stream);
        XSSFSheet contactSheet = workBook.getSheetAt(0);

        int nRows = contactSheet.getLastRowNum() + 1; // no header
        int nCols = contactSheet.getRow(0).getLastCellNum();

        Object[][] excelData = new Object[nRows][nCols];

        for (int i = 0; i < nRows; ++i) {
            XSSFRow currentRow = contactSheet.getRow(i);
            for (int j = 0; j < nCols; ++j) {
                if (currentRow.getCell(j) != null) {
                    excelData[i][j] = currentRow.getCell(j).toString();
                } else {
                    excelData[i][j] = "";  
                }
            }
        }

        workBook.close();
        return excelData;
    }

}
