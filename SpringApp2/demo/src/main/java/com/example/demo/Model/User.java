package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Productid;

    private String ProductName;
    private String ProductDesc;
    private String ProductFeed;
    private int ProductPri;

    public User (){

    }

    

    public User(int id, String name,String desc,String feed,int price) {
        this.Productid = id;
        this.ProductName = name;
        this.ProductDesc = desc;
        this.ProductFeed = feed;
        this.ProductPri = price;
    }



    public int getProductid() {
        return Productid;
    }



    public void setProductid(int productid) {
        Productid = productid;
    }



    public String getProductName() {
        return ProductName;
    }



    public void setProductName(String productName) {
        ProductName = productName;
    }



    public String getProductDesc() {
        return ProductDesc;
    }



    public void setProductDesc(String productDesc) {
        ProductDesc = productDesc;
    }



    public String getProductFeed() {
        return ProductFeed;
    }



    public void setProductFeed(String productFeed) {
        ProductFeed = productFeed;
    }



    public int getProductPri() {
        return ProductPri;
    }



    public void setProductPri(int productPri) {
        ProductPri = productPri;
    }



    @Override
    public String toString() {
        return "User [id=" + Productid + ", name=" + ProductName + ", Desc=" + ProductDesc +", feed=" + ProductFeed +", price=" + ProductPri + "]";
    }

    

    
}
