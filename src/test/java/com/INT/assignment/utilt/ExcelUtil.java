package com.INT.assignment.utilt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

    private static final String EXCEL_PATH =
        "src/test/resources/testdata/LoginData.xlsx";

    public static Object[][] getTestData() throws IOException {

        FileInputStream fis = new FileInputStream(EXCEL_PATH);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0); // first sheet

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rowCount - 1][colCount];

        // start from row 1 (skip header)
        for (int i = 1; i < rowCount; i++) {

            for (int j = 0; j < colCount; j++) {
                data[i - 1][j] =
                        sheet.getRow(i).getCell(j).toString();
            }
        }

        workbook.close();
        fis.close();

        return data;
    }
}

