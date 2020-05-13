/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Remote;

import Modele.BCategory;
import Modele.Book;
import Modele.Client;
import Modele.Registration;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author <milly g@VNGTechnology>
 */
public class Controller {
    public List<Client> AllClients() {
    Session s= HibernateUtil.getSessionFactory().openSession();
    s.getTransaction().begin();
        List<Client> cl= s.createQuery("from Client").list();
        s.getTransaction().commit();
        return cl;  
    }
    public Client OneClient(int id){
    Session s= HibernateUtil.getSessionFactory().openSession();
    s.getTransaction().begin();
    Client cl= (Client) s.get(Client.class, id);
    s.getTransaction().commit();
    return cl;
    
    }
       public void insertBook(Book b){
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
        s.save(b);
        x.commit();
        s.close();
    }
        public void insertClient(Client b){
        Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
        s.save(b);
        x.commit();
        s.close();
    }
    public void updateClient(Client b){
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
    public List<Book> findBc(String  name){
    Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();
//    Query q= s.createSQLQuery("select * from Book where bc=name");
//    q.setParameter("bc", name);
Criteria cr= s.createCriteria(Book.class);
cr.add(Restrictions.eq("bc", name));
    List<Book> bc= cr.list();
//    BCategory bc= new BCategory();
//    bc.getName();
    x.commit();
    s.close();
    return bc;
    }
    public List<Object[]> allOps(){
    Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();
    Query q=s.createSQLQuery("select clientid,dateop,bookid from client inner join book on\n" +
"        client.clientid=book.client_clientid");
    List<Object[]> ls=q.list();
     
    return ls;
    }
    public List<Book> bookByCat(String name){
    Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();
    Query q=s.createQuery("from Book where bc=:name");
    q.setParameter("bc", name);
    List<Book> ls=q.list();
    return ls;
    
    }
     public List<Book> bookByDate(String date){
    Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();
    Query q=s.createQuery("from Book where dateofpublication=:date");
    q.setParameter("date", date);
    List<Book> ls=q.list();
    return ls;
    
    }
    public Client clientByName(String name){
    Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();
    Criteria cr=s.createCriteria(Client.class);
    cr.add(Restrictions.eq("Fname", name));
    Client cl=(Client) cr.uniqueResult();
    return cl;
    }
    public List<Object[]>  report(String start,String end){
        List<String> ls2 =new ArrayList<>();
        ls2.add(start);
        ls2.add(end);
    Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();
    Query q=s.createSQLQuery("select clientid,dateop,bookid from client inner join book on\n" +
"        client.clientid=book.client_clientid where dateop between :start and :end");
//    q.setParameter("date", start);
//    q.setParameter("date",end);
q.setParameterList(start, ls2);
    List<Object[]> ls= q.list();
    
    return ls;
    }
    public Book getBook(int id){
     Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();
    Criteria cr=s.createCriteria(Book.class);
    cr.add(Restrictions.eq("bookid", id));
      Book b=(Book) cr.uniqueResult();
      x.commit();
      s.close();
    return b;
    }
    public void updateClientremove(String date){
      Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
//        s.update(b);
        Query q=s.createSQLQuery("delete from borrow where date=:date");
        q.setParameter("date", date);
        x.commit();
        s.close();
    }
    List<Integer> ls2=null;
    public void updateBooks(List<Book> ls,int clid){
            Integer e;
       ls2 =new ArrayList<>();
         for (Iterator<Book> iterator = ls.iterator(); iterator.hasNext();) {
            Book next = iterator.next();
            e=next.getBookid();
            ls2.add(e);
        }
        Session s= HibernateUtil.getSessionFactory().openSession();
    Transaction x= s.beginTransaction();
     
    Query q=s.createSQLQuery("update book set client_clientid=:clid where bookid in :ls2");
    x.commit();
    s.close();
    }
    /*
    nOW THE PART FOR
    AUTHENTICATION
    */
    public void insertregister(Registration rg){
      Session s= HibernateUtil.getSessionFactory().openSession();
      Transaction x= s.beginTransaction();
      s.save(rg);
      x.commit();
      s.close();
    }
    
    public Registration getLogine(String user){
     Session s= HibernateUtil.getSessionFactory().openSession();
        Transaction x= s.beginTransaction();
//        s.update(b);
        Criteria cr=s.createCriteria(Registration.class);
        cr.add(Restrictions.eq("username", user));
        Registration r=(Registration) cr.uniqueResult();
        x.commit();
        s.close();
    return r;
    }
    
    
}
