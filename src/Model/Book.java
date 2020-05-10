/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



/**
 * 
 * @author milly g
 */
@Entity
public class Book implements Serializable{
        //@Basic
        @Id  @GeneratedValue
        private int BookNum;
        private String Title;
        private String PublishingHouse;   
        private String Author;
        private String DateOfPublication;
        private String pages;
        
        private BookCategory bc;
//        @ManyToOne(fetch = FetchType.EAGER)
//        @ManyToMany
//        private List<Client_M> client =new ArrayList<>();
        @ManyToOne
        private OperationModel opmodel;

    public OperationModel getOpmodel() {
        return opmodel;
    }

    public void setOpmodel(OperationModel opmodel) {
        this.opmodel = opmodel;
    }

//    public List<Client_M> getClient() {
//        return client;
//    }
//
//    public void setClient(List<Client_M> client) {
//        this.client = client;
//    }
       

    public Book() {
    }

    /**
     *
     * @param BookNum
     */


    

    public Book(int BookNum, String Title, String PublishingHouse, String Author, String DateOfPublication, String pages, BookCategory bc) {
        this.BookNum = BookNum;
        this.Title = Title;
        this.PublishingHouse = PublishingHouse;
        this.Author = Author;
        this.DateOfPublication = DateOfPublication;
        this.pages = pages;
        this.bc = bc;
    }

    public int getBookNum() {
        return BookNum;
    }

    public void setBookNum(int BookNum) {
        this.BookNum = BookNum;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

      
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getPublishingHouse() {
        return PublishingHouse;
    }

    public void setPublishingHouse(String PublishingHouse) {
        this.PublishingHouse = PublishingHouse;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getDateOfPublication() {
        return DateOfPublication;
    }

    public void setDateOfPublication(String DateOfPublication) {
        this.DateOfPublication = DateOfPublication;
    }

    public BookCategory getBc() {
        return bc;
    }

    public void setBc(BookCategory bc) {
        this.bc = bc;
    }

   

   

    
        
        
        
}
