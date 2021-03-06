package com.infinity.jerry.securitysupport.coal_security.entity;

import org.litepal.crud.DataSupport;

/**
 * Created by jerry on 2017/9/27.
 */

public class TempCancelLic extends DataSupport {

    private int id;
    private int planId;
    private String inspItem;
    private String content;
    private String name;
    //告知信息
    private String mine;
    private String address;
    private String postCode;
    private String contact;
    private String phone;

    private int companyId;
    private int type;
    private int subItemId;

    public int getSubItemId() {
        return subItemId;
    }

    public void setSubItemId(int subItemId) {
        this.subItemId = subItemId;
    }

    @Override
    public String toString() {
        return "TempCancelLic{" +
                "id=" + id +
                ", planId=" + planId +
                ", inspItem='" + inspItem + '\'' +
                ", content='" + content + '\'' +
                ", name='" + name + '\'' +
                ", mine='" + mine + '\'' +
                ", address='" + address + '\'' +
                ", postCode='" + postCode + '\'' +
                ", contact='" + contact + '\'' +
                ", phone='" + phone + '\'' +
                ", companyId=" + companyId +
                ", type=" + type +
                '}';
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getInspItem() {
        return inspItem;
    }

    public void setInspItem(String inspItem) {
        this.inspItem = inspItem;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMine() {
        return mine;
    }

    public void setMine(String mine) {
        this.mine = mine;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String edPhone) {
        this.phone = edPhone;
    }
}
