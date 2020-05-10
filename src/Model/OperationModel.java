package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author milly g
 */
@Entity
public class OperationModel implements Serializable {
    @Id @GeneratedValue
    private int opId;
    @ManyToOne
    private Client_M clientname;
    @OneToMany(mappedBy="opmodel",fetch = FetchType.EAGER)
    private List<Book> bookname= new ArrayList<>();
    private OperationCategory opcategory;
    @OneToMany(mappedBy = "opmodel")
    private Book books;

    public int getOpId() {
        return opId;
    }

    public void setOpId(int opId) {
        this.opId = opId;
    }

    public OperationModel() {
    }

    
    public OperationModel(Client_M clientname, List<Book> bookname) {
        this.clientname = clientname;
        this.bookname = bookname;
    }

    public Client_M getClientname() {
        return clientname;
    }

    public void setClientname(Client_M clientname) {
        this.clientname = clientname;
    }

    public List<Book> getBookname() {
        return bookname;
    }

    public void setBookname(List<Book> bookname) {
        this.bookname = bookname;
    }
    
    
}
