/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Book;
import Model.BookCategory;
import Model.ClientCategory;
import Model.Client_M;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author <milly g@VNGTechnology>
 */
public class Main {
    public static void main(String[] args) {
  /*   for (int i = 0; i < 3; i++) {
            BookCategory bc= new BookCategory(i,"Cat");
             new HibernateTest().insertBookCategory(bc);
        }
       Session s= HibernateUtil.getSessionFactory().openSession();
        List<BookCategory> ls=(List<BookCategory>) s.createQuery("from BookCategory").list();
        ls.forEach((l) -> {
            System.out.println(""+l.getCategoryId());
        });*/
    Session s= HibernateUtil.getSessionFactory().openSession();
//Criteria cr= s.createCriteria(BookCategory.class).add(Restrictions.isNotNull("CategoryId"));
/*Query q= s.createSQLQuery("select categoryid,categoryname from bookcategory");
 //List <BookCategory>bs= cr.list();
 q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
 List bs = q.list();
 bs.forEach(b->{
     Map m= (Map) b;
  System.out.println(""+m.get("categoryid")+"\t"+m.get("categoryname"));
 });*/

       
    for (int i = 0; i < 3; i++) {
            Book bc= new Book();
            bc.setAuthor("MIKA");
            bc.setBc(new BookCategory(0,"Cat"));
            bc.setDateOfPublication("09-01-2001");
            bc.setPages("34");
            bc.setTitle("number");
            bc.setPublishingHouse("aa");
//            bc.setClient(new Client_M(40));
            
             new HibernateTest().insertBook(bc);
        }
//        for (int i = 0; i <3; i++) {
//            Client_M clm= new Client_M();
//            clm.setClient(ClientCategory.STUDENT);
//            clm.setEmailAddress("@millyg.com");
//            clm.setFirstName("milly");
//            clm.setLastName("g");
//            clm.setPhoneNumber("0780310798");
//            clm.getBook().add(new Book(30+i, "number", "aa", "MIKA", null, "34", new BookCategory(0, "Cat"), clm));
//            new HibernateTest().insertClient(clm);
//        }
//new HibernateTest().updateAllBook(new Client_M(40), 30, 32);
//List<Book> ls= s.createQuery("select book from Client_M").list();
//        ls.forEach((l) -> {
//            System.out.println(""+l);
//        });
        
//List ls = s.createSQLQuery("select distinct(client_id) from book").setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP).list();
//this is how you checkout clients in the weak or mapped entity
//unlike
//    ls.forEach((Object l) -> {
//        Map m= (Map) l;
//            System.out.println(""+m.get("client_id"));
//        });
        /*Session s= HibernateUtil.getSessionFactory().openSession();
        List<BookCategory> ls=(List<BookCategory>) s.createQuery("from BookCategory").list();
        ls.forEach((l) -> {
            System.out.println(""+l.getCategoryId());
        });*/
    
    }
}

