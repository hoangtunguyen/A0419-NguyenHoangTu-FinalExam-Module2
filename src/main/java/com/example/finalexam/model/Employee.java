package com.example.finalexam.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "code")
    private String code;

    @Column(name = "employeegroup")
    private String employeeGroup;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "dob")
    private String birthday;

    @Column(name = "sex")
    private String sex;


    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column(name = "cmndcode")
    private String cmndCode;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    public Employee() {
    }

    public Employee(String code, String employeeGroup, String fullName, String birthday, String sex, String phoneNumber, String cmndCode, String email, String address) {
        this.code = code;
        this.employeeGroup = employeeGroup;
        this.fullName = fullName;
        this.birthday = birthday;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.cmndCode = cmndCode;
        this.email = email;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmployeeGroup() {
        return employeeGroup;
    }

    public void setEmployeeGroup(String employeeGroup) {
        this.employeeGroup = employeeGroup;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCmndCode() {
        return cmndCode;
    }

    public void setCmndCode(String cmndCode) {
        this.cmndCode = cmndCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
