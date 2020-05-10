/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author <milly g@VNGTechnology>
 */
import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.io.FileOutputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
public class JTable2Pdf extends JFrame {
  private JTable table;
public JTable2Pdf() {
    getContentPane().setLayout(new BorderLayout());
    createTable();
  }
  private void createTable() {
      Object[][] data = {
                {"Kathy", "Smith",
                 "SnowboardingXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new Integer(5), new Boolean(false)},
                {"John", "Doe",
                 "Rowing", new Integer(3), new Boolean(true)},
                {"Sue", "Black",
                 "Knitting", new Integer(2), new Boolean(false)},
                {"Jane", "White",
                 "Speed reading", new Integer(20), new Boolean(true)},
                {"Joe", "Brown",
                 "Pool", new Integer(10), new Boolean(false)}
                };
      String[] columnNames = {"First Name",
              "Last Name",
              "Sport",
              "# of Years",
              "Vegetarian"};

    table = new JTable(data, columnNames);

    JPanel tPanel = new JPanel(new BorderLayout());
    tPanel.add(table.getTableHeader(), BorderLayout.NORTH);
    tPanel.add(table, BorderLayout.CENTER);

    getContentPane().add(tPanel, BorderLayout.CENTER);
  }
  private void print() {
    Document document = new Document(PageSize.A4.rotate());
    try {
      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\jTable.pdf"));

      document.open();
      PdfContentByte cb = writer.getDirectContent();

      cb.saveState();
      Graphics2D g2 = cb.createGraphics(500, 500);

      Shape oldClip = g2.getClip();
      g2.clipRect(10, 0, 500, 500);

      table.print(g2);
      g2.setClip(oldClip);

      g2.dispose();
      cb.restoreState();
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    document.close();
  }
  public static void main(String[] args) {
    JTable2Pdf frame = new JTable2Pdf();
    frame.pack();
    frame.setVisible(true);
    frame.print();
  }
}