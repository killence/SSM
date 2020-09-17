package com.killen.entity;

import java.util.Date;

/**
 * @ClassName : Address
 * @Description :
 * @Author : KILLEN
 * @Date: 2020-09-17 19:24
 */

public class Address {
    private Integer id;
    private String province;
    private String city;
    private String area;
    private String address;
    private Date createTime;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public Address() {
    }

    public Address(Integer id, String province, String city, String area, String address, Date createTime) {
        this.id = id;
        this.province = province;
        this.city = city;
        this.area = area;
        this.address = address;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
