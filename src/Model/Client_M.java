/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
public class Client_M implements Serializable {

    @Id
    @GeneratedValue
    private int Id;
    private String FirstName;
    private String LastName;
    private String EmailAddress;
    private String PhoneNumber;
    private String Photo;
    //private String Password;
    private ClientCategory Client;
//    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    @ManyToMany    
    private List<Book> book = new ArrayList<>();
    @OneToMany(mappedBy="clientname")
    private List<OperationModel> opmodel=new ArrayList<>();

    public List<OperationModel> getOpmodel() {
        return opmodel;
    }

    public void setOpmodel(List<OperationModel> opmodel) {
        this.opmodel = opmodel;
    }

    public Client_M(int Id) {
        this.Id = Id;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Client_M(int Id, String FirstName, String LastName, String EmailAddress, String PhoneNumber, String Photo, ClientCategory Client) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.EmailAddress = EmailAddress;
        this.PhoneNumber = PhoneNumber;
        this.Photo = Photo;
        this.Client = Client;
    }

    public Client_M() {
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public ClientCategory getClient() {
        return Client;
    }

    public void setClient(ClientCategory Client) {
        this.Client = Client;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public String toString() {
        return "" + Id;
    }

}
