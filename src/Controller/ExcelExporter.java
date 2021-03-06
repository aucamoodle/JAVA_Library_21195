/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.store.Path;

/**
 *
 * @author <milly g@VNGTechnology>
 */
public class ExcelExporter {

    public ExcelExporter() {
    }
    
 public void writeToExcell(JTable table, Path path) throws FileNotFoundException, IOException {
    new WorkbookFactory() {};
    Workbook wb = new XSSFWorkbook(); //Excell workbook
    Sheet sheet = wb.createSheet(); //WorkSheet
    Row row = sheet.createRow(2); //Row created at line 3
    TableModel model = table.getModel(); //Table model


    Row headerRow = sheet.createRow(0); //Create row at line 0
    for(int headings = 0; headings < model.getColumnCount(); headings++){ //For each column
        headerRow.createCell(headings).setCellValue(model.getColumnName(headings));//Write column name
    }

    for(int rows = 0; rows < model.getRowCount(); rows++){ //For each table row
        for(int cols = 0; cols < table.getColumnCount(); cols++){ //For each table column
            row.createCell(cols).setCellValue(model.getValueAt(rows, cols).toString()); //Write value
        }

        //Set the row to the next one in the sequence 
        row = sheet.createRow((rows + 3)); 
    }
    wb.write(new FileOutputStream(path.toString()));//Save the file     
}   
}
