package com.ren.ssm.entity;

public class vipCompany {
    private Integer id;

    private String name;

    private String address;

    private String phone;

    private String legalperson;

    private String remark;

    public vipCompany(Integer id, String name, String address, String phone, String legalperson, String remark) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.legalperson = legalperson;
        this.remark = remark;
    }

    public vipCompany() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson == null ? null : legalperson.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}