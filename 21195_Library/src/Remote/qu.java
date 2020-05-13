/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Remote;

import Modele.BCategory;
import Modele.Book;
import Modele.CCategory;
import Modele.Client;
import Modele.Operation;
import Modele.OperationId;
import Modele.fot;
import java.io.File;
import java.sql.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author <milly g@VNGTechnology>
 */
public class qu {
    public static void main(String[] args) {
//        Session s= HibernateUtil.getSessionFactory().openSession();
//        s.getTransaction().begin();
//        Client cl=new Client();
//       cl.setId(33);
//        cl.setCat(CCategory.STAFF);
//        File f= new File("Documents\\layersOfAnetwork.jpg");
//        cl.setPhoto(f);
//        Book b= new Book(35);
//        Book be= new Book(34);
//Book be4=(Book) s.get(Book.class, 34);
//        cl.getBks().add(be4);
//        cl.getBks().add(be);
//        Operation e= new Operation();
//        OperationId opid= new OperationId(15, 13);
//        e.setOpid(opid);
//        e.setClien_id(15);
//        e.setDate("12-05-2020");
//        e.setStatus(1);
//Query q= s.createQuery("select Photo from Client where Photo is not null");
//q.setMaxResults(1);
// File fe=(File) q.uniqueResult();
//        Client c= (Client) s.get(Client.class, 38);
        
        
//        fe=c.getPhoto();
//        if(fe.equals(f)){
//            System.out.println("same");
//        }
//        Query q=s.createQuery("from Book where Cat='STUDENT'")
//        List<Book> ls=q.list();
//        System.out.println(""+ls.get(0).getBookid());
//        e.getOpbook().add(new Book(13));
//        cl.getOperation().add(e);
//        cl.setLname("ngabo");

//        Book b= new Book();
//        b.setBookid(4);
//        s.update(b);
//        b.setOp(new Operation(1));
//        b.setPages("12");
//        b.setAuthor("guther");
//        b.setBc(new BCategory(0));
        String st1="2020-05-01";
        String st2="2020-05-02";
        if(st1.compareTo(st2)<1){
            System.out.println("less");
            
        }
        String st3="2020-05-01";
        String st4="2020-05-02";
        System.out.println(""+BCategory.BIO);
        System.out.println(""+CCategory.valueOf("STUDENT"));
        //        s.update(cl);
//        s.persist(cl);
//s.update(cl);
//        s.delete(cl);
//s.save(b);


//s.delete("from Client where clientid=30", cl);
//        s.getTransaction().commit();
//        s.close();
    }
}
