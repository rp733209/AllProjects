package com.csi.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    public int empid;

    public String empName;

    public long empContactNumber;

    public double empSalary;

    public String empAddress;

    public Employee() {
        // TODO Auto-generated constructor stub
    }

    public Employee(String empName, long empContactNumber, double empSalary, String empAddress) {
        super();
        this.empName = empName;
        this.empContactNumber = empContactNumber;
        this.empSalary = empSalary;
        this.empAddress = empAddress;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpContactNumber() {
        return empContactNumber;
    }

    public void setEmpContactNumber(long empContactNumber) {
        this.empContactNumber = empContactNumber;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", empName=" + empName + ", empContactNumber=" + empContactNumber
                + ", empSalary=" + empSalary + ", empAddress=" + empAddress + "]";
    }

}
