package org.utils.dataReader;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExcelReaderUtils {
    public String excelReader(String filePath,String sheetname,int rowno,int cellno) throws IOException {
        FileInputStream fis=new FileInputStream(filePath);
        Properties prop=new Properties();
        prop.load(fis);
        Workbook wb= WorkbookFactory.create(fis);
        String print = wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
        return print;
    }
}
