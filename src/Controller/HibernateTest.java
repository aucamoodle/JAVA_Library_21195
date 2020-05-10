/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Book;
import Model.BookCategory;
import Model.Client_M;
import Model.OperationModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javassist.bytecode.Opcode;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.mapping.Array;

/**
 *
 * @author <milly g@VNGTechnology>
 */
public class HibernateTest {
    public void insertBookCategory(BookCategory b){
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
        s.save(b);
        x.commit();
        s.close();
    }
    public void insertBook(Book b){
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
        s.save(b);
        x.commit();
        s.close();
    }
    public void insertClient(Client_M b){
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
        s.save(b);
        x.commit();
        s.close();
    }
    public void updateClient(Client_M b){
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
        s.update(b);
        x.commit();
        s.close();
    }
    public void updateBook(Book b){
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
        s.update(b);
        x.commit();
        s.close();
    }

    public List<Book> AllClient(Book b){
        List<Book> all;
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
        Query q= s.createQuery("from Book");
        all=q.list();
        x.commit();
        s.close();
        return all;
    }
    public void updateAllBook(Client_M booker,int startid,int endid){
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
        Query q= s.createQuery("update Book set client=:booker where BookNum between :startid and :endid");
        q.setParameter("booker", booker);
        q.setParameter("startid", startid);
        q.setParameter("endid", endid);
        x.commit();
        s.close();
    
    
    }
    public BookCategory findBc(String name){
    Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();
    Query q= s.createQuery("select CategoryId from BookCategory where CategoryName=:name");
    Integer t=(Integer) q.uniqueResult();
    BookCategory bc= new BookCategory();
    bc.setCategoryId(t);
    x.commit();
    s.close();
    return bc;
    }
    public void insertOp(int bookid,int clientid){
    Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();
    Client_M clientname= new Client_M(clientid);
    OperationModel op= new OperationModel();
    Book b= new Book();
    b.setBookNum(bookid);
    op.getBookname().add(b);
    op.setClientname(clientname);
    s.save(op);
    b.setOpmodel(op);
   s.update(b);
    x.commit();
    s.close();
    }
    public void deleteOp(int[] bookid,int clientid){
    Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();
    Client_M client= new Client_M(clientid);
    Query q= s.createQuery("delete OperationModel where Client_M=:client");
    int result=q.executeUpdate();
    System.out.println(""+result);
    
        for (int i : bookid) {
            Book b= new Book();
            b.setBookNum(i);
            b.setOpmodel(null);
            s.update(b);
        }
    x.commit();
    s.close();   
    }
     public List<Book> AllBooks(){
        List<Book> all;
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
        Query q= s.createQuery("from Book");
        all=q.list();
        x.commit();
        s.close();
        return all;
    }
    public List<Client_M> AllClient(){
        List<Client_M> all;
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
        Query q= s.createQuery("from Client_M");
        all=q.list();
        x.commit();
        s.close();
        return all;
    }
    public Client_M searchById(int id){
      
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();  
        Criteria cr=s.createCriteria(Client_M.class);
        cr.add(Restrictions.idEq(id));
        Client_M m=(Client_M) cr.uniqueResult();
        return m;
    }
    public Client_M searchByName(String name){
      
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();  
        Criteria cr=s.createCriteria(Client_M.class);
        cr.add(Restrictions.eq("firstname", name));
        Client_M m=(Client_M) cr.uniqueResult();
        return m;
    }
    public Book searchByBookId(int id){
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();  
        Criteria cr=s.createCriteria(Book.class);
        cr.add(Restrictions.eq("BookNum", id));     

        Book b=   (Book) cr.uniqueResult();
        return b;
    }
    public List<Book> searchByBookName(String name){
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();  
        Criteria cr=s.createCriteria(Book.class);
        cr.add(Restrictions.eq("Title", name));     

        List<Book> b=   (List<Book>) cr.list();
        return b;
    }
     public List<Book> searchByBookDate(String date){
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();  
        Criteria cr=s.createCriteria(Book.class);
        cr.add(Restrictions.eq("DateOfPublication", date));     
        List<Book> b=   (List<Book>) cr.list();
        return b;
    }
     public List<Book> searchByBookCat(int cate){
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();  
        BookCategory bc= new BookCategory();
        bc.setCategoryId(cate);
        Query q= s.createQuery("from Book where bc=:bc");
        q.setParameter("bc", bc);
        List<Book> b=   q.list();
        return b;
    }
//    public File exportXlsx(){
//        List<OperationModel> ls= getAllOps();
////        File f= new File("C:\\Users\\milly g\\Documents\\NetBeansProjects\\LibraryHibernate\\src\\export.xlsx");
//         File f= new File("C:\\Users\\milly g\\Documents\\NetBeansProjects\\LibraryHibernate\\src\\export.xlsx");

//        try {
//            
//            JFileChooser file;
//            try (//             FileWriter fr= new  FileWriter(f);
////            BufferedWriter brw= new BufferedWriter(fr);
//                    FileInputStream fs = new FileInputStream(f)) {
//                Workbook bk= WorkbookFactory.create(fs);
//                Sheet sh= bk.createSheet("1");
//                Iterator<Row> rowit= sh.iterator();
//                
//                ls.forEach((OperationModel op) -> {
//                Row row= (Row) rowit.next();
//                Iterator cellit= row.iterator();
//                 Cell cell= (Cell) cellit.next();
////                    Object[] a=op.getBookname().toArray();
//                    
//                    int columnIndex=cell.getColumnIndex();
//                    switch (columnIndex) { 
//                        default:
//                            cell.setCellValue(op.getOpId());
//                                columnIndex++;
//                              cell= (Cell) cellit.next();  
//                            List<Book> bok=op.getBookname();
//                            Iterator it= bok.iterator();
//                            int bnumber=0;
//                            if(it.hasNext()){
//                                
//                                cell.setCellValue((RichTextString) op.getBookname().get(bnumber));
//                                cellit.next();
//                                bnumber++;
//                                columnIndex++;
//                                it.next();
//                                 cell= (Cell) cellit.next();
//                            }
//                            cell.setCellValue((RichTextString) op.getClientname());
//                            columnIndex++;
//                            break;
//                    }
//                }); file = new JFileChooser();
//                FileNameExtensionFilter fnef = new FileNameExtensionFilter("xlsx");
//                file.addChoosableFileFilter(fnef);
//                try (FileOutputStream frout = new FileOutputStream(f)) {
//                    bk.write(frout);
//                }
//            }
//        //frout.write(b, 0, 0);
//        if(file.showOpenDialog(null) == JFileChooser.SAVE_DIALOG)
//          {
//              file.setSelectedFile(f);
//               //fs.getChannel().
//    }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(HibernateTest.class.getName()).log(Level.SEVERE, null, ex);
//        
//        } catch (IOException ex) {
//            Logger.getLogger(HibernateTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        
//    
//        return f;
//    }
    public List<OperationModel> getAllOps(){
    Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();  
    Criteria cr= s.createCriteria(OperationModel.class);
//    Object[] values=getOps().toArray();
//    cr.add(Restrictions.in("Book", values));
    List<OperationModel> oplist= cr.list();
    x.commit();
    return oplist;
    }
    public List<Book> getOps(){
    Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();  
    Query q=s.createQuery("from Book where opmodel is null");  
    List<Book> books=q.list();
    x.commit();
    return books;
    }
    public List<BookCategory> getAllCats(){
    Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();  
    Query q=s.createQuery("from BookCategory"); 
    List<BookCategory> ls=q.list();
    x.commit();
    return ls;
    }
    
}
