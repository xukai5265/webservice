package cn.lingban.webservice.entity;


import java.io.Serializable;

/**
 * Created by xukai on 2017/4/18.
 */
public class Task implements Serializable {
    private static final long serialVersionUID = -4601687272216326006L;
    private String orderId;
    private String oemCode;
    private Integer orderType;
    private String phone;
    private String customerName;
    private String sex;
    private Integer remainingOrders;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOemCode() {
        return oemCode;
    }

    public void setOemCode(String oemCode) {
        this.oemCode = oemCode;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getRemainingOrders() {
        return remainingOrders;
    }

    public void setRemainingOrders(Integer remainingOrders) {
        this.remainingOrders = remainingOrders;
    }
}
