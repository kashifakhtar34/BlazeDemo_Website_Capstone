package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcelUtils {

    public static Object[][] getExcelData() {

        Object[][] data = null;

        try {

            FileInputStream fis =
            new FileInputStream(
            "src/test/resources/testdata/BookingData.xlsx");

            Workbook wb =
            WorkbookFactory.create(fis);

            Sheet sheet =
            wb.getSheetAt(0);

            int rows =
            sheet.getPhysicalNumberOfRows();

            int cols =
            sheet.getRow(0).getLastCellNum();

            data =
            new Object[rows-1][cols];

            for(int i=1;i<rows;i++) {

                for(int j=0;j<cols;j++) {

                    data[i-1][j] =
                    sheet.getRow(i)
                    .getCell(j)
                    .toString();
                }
            }

            wb.close();

        } catch(Exception e) {

            e.printStackTrace();
        }

        return data;
    }
}