package model;

import jakarta.persistence.*;

@Entity
@Table(name = "product", schema = "dbo", catalog = "clothesLuxury")
public class ProductEntity {
    private int id;
    private String productName;
    private String imgProduct;
    private int price;
    private int likeCount;
    private boolean isActive;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "imgProduct")
    public String getImgProduct() {
        return imgProduct;
    }

    public void setImgProduct(String imgProduct) {
        this.imgProduct = imgProduct;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "likeCount")
    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    @Basic
    @Column(name = "isActive")
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (id != that.id) return false;
        if (price != that.price) return false;
        if (likeCount != that.likeCount) return false;
        if (isActive != that.isActive) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (imgProduct != null ? !imgProduct.equals(that.imgProduct) : that.imgProduct != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (imgProduct != null ? imgProduct.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + likeCount;
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
