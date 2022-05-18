package org.utils.PageUtils;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExportData {
    public void excel(String data) throws IOException  {
        FileInputStream fis1=new FileInputStream("src/test/resources/Excel/highlight.xlsx");
        Workbook wb= WorkbookFactory.create(fis1);
        Sheet sh=wb.getSheet("highlight");
        String[] arr = data.split("\n");
        for(int i = 0 ; i < arr.length ; i++){
            Row row = sh.getRow(i+1);
            Cell cell = row.createCell(0);
            cell.setCellValue(arr[i]);
            FileOutputStream fos = new FileOutputStream("src/test/resources/Excel/highlight.xlsx");
            wb.write(fos);
        }

        wb.close();

    }
}