package org.example.POJO;
import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category")
    private String category;

    @Column(name="IDcategory")
    private int IDcategory;

    public Category() {
    }

    public Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIDcategory() {
        return IDcategory;
    }

    public void setIDcategory(int IDcategory) {
        this.IDcategory = IDcategory;
    }

    @Override
    public String toString() {
        return "category{" +
                "category='" + category + '\'' +
                ", IDcategory=" + IDcategory +
                '}';
    }
}
