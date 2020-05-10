/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author milly g
 */
@Entity
public class BookCategory implements Serializable {
    @Id //@GeneratedValue(strategy=GenerationType.AUTO,generator="system-uuid")
    //@GenericGenerator(name = "system-uuid",strategy="uuid")
    private int CategoryId;
    private String CategoryName;

    public BookCategory() {
    }

    public BookCategory(int CategoryId, String CategoryName) {
        this.CategoryId = CategoryId;
        this.CategoryName = CategoryName;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int CategoryId) {
        this.CategoryId = CategoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.CategoryId);
        hash = 43 * hash + Objects.hashCode(this.CategoryName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BookCategory other = (BookCategory) obj;
        if (!Objects.equals(this.CategoryId, other.CategoryId)) {
            return false;
        }
        if (!Objects.equals(this.CategoryName, other.CategoryName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+ CategoryId;
    }
    
    

    
    
}
