package com.csi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue

    public int empid;

    public String empname;

    public String empAddress;

    public long empcontactnumber;

    public Double empSalary;

    public String uidNumber;

    public String empMotherName;

    public Employee(){

    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public long getEmpcontactnumber() {
        return empcontactnumber;
    }

    public void setEmpcontactnumber(long empcontactnumber) {
        this.empcontactnumber = empcontactnumber;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public String getUidNumber() {
        return uidNumber;
    }

    public void setUidNumber(String uidNumber) {
        this.uidNumber = uidNumber;
    }

    public String getEmpMotherName() {
        return empMotherName;
    }

    public void setEmpMotherName(String empMotherName) {
        this.empMotherName = empMotherName;
    }
}
