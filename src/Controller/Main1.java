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
import org.hibernate.Session;

/**
 *
 * @author <milly g@VNGTechnology>
 */
public class Main1 {

    public static void main(String[] args) {
        Session s = HibernateUtil.getSessionFactory().openSession();
//         BookCategory bs=(BookCategory) s.get(BookCategory.class, "Cat0");
//    for (int i = 0; i < 3; i++) {
//            Book bc= new Book();
//            bc.setAuthor("MIKA");
//            bc.setDateOfPublication("23-01-1229");
//            bc.setPages("34");
//            bc.setTitle("number");
//            bc.setPublishingHouse("aa");
//            bc.setBc(bs);
//             new HibernateTest().insertBook(bc);
//        }
//   Book b= (Book) s.createQuery("from Book where BookNum='297e4b9071d5f23d0171d5f246830000'").uniqueResult();
//        System.out.println(""+b.getBc().getCategoryId());
        s.getTransaction().begin();
        OperationModel opm = new OperationModel();
        Book b = new Book();
        b.setBookNum(0);
        Client_M cm = new Client_M();
        cm.setId(43);
        opm.getBookname().add(b);
        opm.setClientname(cm);
        s.save(opm);
        s.getTransaction().commit();

    }
}
