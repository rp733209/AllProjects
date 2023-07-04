package com.csi.dao;

import com.csi.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

    @Override
    public void signUp(Employee employee) {

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(employee);

        transaction.commit();

    }

    @Override
    public boolean signIn(String empEmailId, String empPassword) {

        boolean flag = false;

        for (Employee employee : getAllData()) {
            if (employee.getEmpEmailId().equals(empEmailId) && employee.getEmpPassword().equals(empPassword)) {
                flag = true;

                break;
            }
        }
        return flag;
    }

    @Override
    public Employee getDataById(long empId) {
        // return getAllData().stream().filter(emp-> emp.getEmpId()==empId).collect(Collectors.toList()).get(0);

        Session session = factory.openSession();

        return (Employee) session.get(Employee.class, empId);
    }

    @Override
    public List<Employee> getDataByName(String empName) {
        return getAllData().stream().filter(emp -> emp.getEmpName().equals(empName)).collect(Collectors.toList());
    }

    @Override
    public List<Employee> sorBySalary() {
        return getAllData().stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary)).collect(Collectors.toList());
    }

    @Override
    public Employee getDataByContactNumber(long empContactNumber) {
        return getAllData().stream().filter(emp -> emp.getEmpContactNumber() == empContactNumber).collect(Collectors.toList()).get(0);
    }

    @Override
    public List<Employee> getAllData() {

        Session session = factory.openSession();

        return session.createQuery("from Employee").list();
    }

    @Override
    public void updateData(long empId, Employee employee) {

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        for (Employee employee1 : getAllData()) {
            if (employee1.getEmpId() == empId) {
                employee1.setEmpName(employee.getEmpName());
                employee1.setEmpDOB(employee.getEmpDOB());
                employee1.setEmpSalary(employee.getEmpSalary());
                employee1.setEmpAddress(employee.getEmpAddress());
                employee1.setEmpContactNumber(employee.getEmpContactNumber());
                employee1.setEmpEmailId(employee.getEmpEmailId());
                employee1.setEmpPassword(employee.getEmpPassword());

                session.update(employee1);

                transaction.commit();
            }
        }
    }

    @Override
    public void deleteDataById(long empId) {
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        for (Employee employee1 : getAllData()) {
            if (employee1.getEmpId() == empId) {


                session.delete(employee1);

                transaction.commit();
            }
        }

    }

    @Override
    public void deleteAllData() {

        Session session = factory.openSession();

        for (Employee employee : getAllData()) {
            Transaction transaction = session.beginTransaction();

            session.delete(employee);

            transaction.commit();
        }
    }
}
