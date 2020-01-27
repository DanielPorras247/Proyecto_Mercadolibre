package co.com.test.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jline.internal.Log;

public class Excel {

    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;

    private Excel() {
        throw new IllegalStateException("Excel");
    }

    public static void setExcelFile(String path,String sheetName)  {
        try {
            // Open the Excel file
            FileInputStream excelFile = new FileInputStream(path);
            // Access the required test data sheet
            ExcelWBook = new XSSFWorkbook(excelFile);
            ExcelWSheet = ExcelWBook.getSheet(sheetName);

        } catch (Exception e){
            Log.error("No fue posible cerrar el stamented", e);
        }
    }

    @SuppressWarnings("deprecation")
    public static String getCellData(int rowNum, int colNum) {
        String cellData = "";
        try{
            Cell = ExcelWSheet.getRow(rowNum).getCell(colNum);

            if (Cell.getCellType()==1){
                cellData = Cell.getStringCellValue();
            }
            if (Cell.getCellType()==0){
                cellData = Cell.getRawValue();
            }
            return cellData;
        }catch (Exception e){
            Log.error("No fue posible cerrar el stamented", e);
            return "";
        }
    }
    public static int contarFilas()
    {
        return ExcelWSheet.getLastRowNum();
    }

    public static void setCellData(int rowNum, int colNum, String textObtenido) {
        try {
            ExcelWSheet.getRow(rowNum).createCell(colNum).setCellValue(textObtenido);
            ExcelWSheet.getRow(rowNum).getCell(colNum).setCellValue(textObtenido);
        }catch (Exception e){
            Log.error("No fue posible cerrar el stamented", e);
        }
    }
    public static void saveData(String path) throws IOException {
        try {
            FileOutputStream excelFileOut = new FileOutputStream(path);
            ExcelWBook.write(excelFileOut);
        }catch (Exception e) {
            Log.error("No fue posible cerrar el stamented", e);

        }
    }
    public static void cerrarBook() throws IOException {
        ExcelWBook.close();
    }

}
