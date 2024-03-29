package model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "order", schema = "dbo", catalog = "clothesLuxury")
public class OrderEntity {
    private int id;
    private Timestamp orderDate;
    private String address;
    private boolean status;
    private Timestamp boughtDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "orderDate")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "status")
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Basic
    @Column(name = "boughtDate")
    public Timestamp getBoughtDate() {
        return boughtDate;
    }

    public void setBoughtDate(Timestamp boughtDate) {
        this.boughtDate = boughtDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (id != that.id) return false;
        if (status != that.status) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (boughtDate != null ? !boughtDate.equals(that.boughtDate) : that.boughtDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (status ? 1 : 0);
        result = 31 * result + (boughtDate != null ? boughtDate.hashCode() : 0);
        return result;
    }
}
