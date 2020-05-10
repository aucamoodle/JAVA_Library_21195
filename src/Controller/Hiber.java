/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Book;
import Model.OperationModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *
 * @author <milly g@VNGTechnology>
 */
public class Hiber {

    public void exportXlsx() {
        List<OperationModel> ls = new HibernateTest().getAllOps();
//        File f= new File("C:\\Users\\milly g\\Documents\\NetBeansProjects\\LibraryHibernate\\src\\export.xlsx");
        File f = new File("C:\\Users\\milly g\\Documents\\NetBeansProjects\\LibraryHibernate\\src\\export1.xlsx");
        JFileChooser file = new JFileChooser();
//                FileNameExtensionFilter fnef = new FileNameExtensionFilter("xlsx");

        if (file.showOpenDialog(null) == JFileChooser.SAVE_DIALOG) {
            try {

                FileInputStream fs = new FileInputStream(f);
                Workbook bk = WorkbookFactory.create(fs);
                Sheet sh = bk.getSheet("Sheet1");
                Iterator<Row> rowit = sh.iterator();
                int i = 0;
                for (Row row : sh) {
                    row = rowit.next();
                    Iterator cellit = row.iterator();
                    while (cellit.hasNext()) {
                        Cell cell = (Cell) cellit.next();
                        int columnIndex = cell.getColumnIndex();
                        switch (columnIndex) {
                            default:
                                OperationModel op = ls.get(i);
                                cell.setCellValue((RichTextString) op.getClientname());
                                columnIndex++;
                                cell = (Cell) cellit.next();
                                List<Book> bok = op.getBookname();
                                Iterator it = bok.iterator();
                                int bnumber = 0;
                                if (it.hasNext()) {

                                    cell.setCellValue((RichTextString) op.getBookname().get(bnumber));
                                    cellit.next();
                                    bnumber++;
                                    columnIndex++;
                                    it.next();
                                    cell = (Cell) cellit.next();
                                }
                                cell.setCellValue((RichTextString) op.getClientname());
                                columnIndex++;
                                break;
                        }
                    }
                    i++;
                }
                fs.close();
                try (FileOutputStream frout = new FileOutputStream(f)) {
                    bk.write(frout);
                    file.getSelectedFile();
                    frout.close();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Hiber.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Hiber.class.getName()).log(Level.SEVERE, null, ex);
            } catch (EncryptedDocumentException ex) {
                Logger.getLogger(Hiber.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args) {
        List a= new ArrayList<>();
        a.add("jhj");
        a.add("fee");
        Object[] ab= new Object[2];
        ab[1]=a;
        Object[][] A={new Object[]={"DWDW"},"DW"};
        for (int i = 0; i < ab.length; i++) {
            System.out.println(""+a.get(i));
        }
    }
    }
