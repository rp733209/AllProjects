package com.csi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
    @GeneratedValue
    public int empId;

public String empname;

public double empSalary;

public long empcontactnumber;

public String empAddress;

    public Employee() {

    }

    public Employee(String empname, double empSalary, long empcontactnumber, String empAddress) {
        this.empname = empname;
        this.empSalary = empSalary;
        this.empcontactnumber = empcontactnumber;
        this.empAddress = empAddress;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public long getEmpcontactnumber() {
        return empcontactnumber;
    }

    public void setEmpcontactnumber(long empcontactnumber) {
        this.empcontactnumber = empcontactnumber;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empname='" + empname + '\'' +
                ", empSalary=" + empSalary +
                ", empcontactnumber=" + empcontactnumber +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}
