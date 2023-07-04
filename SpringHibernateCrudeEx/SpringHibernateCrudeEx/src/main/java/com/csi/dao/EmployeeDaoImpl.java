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
        Session session = factory.openSession();
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
    public void updateDataById(int empId, Employee employee) {

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        for (Employee employee1 : getAllData()) {
            if (employee1.getEmpid() == empId) {
                employee1.setEmpName(employee.getEmpName());
                employee1.setEmpDOB(employee.getEmpDOB());
                employee1.setEmpEmailId(employee.getEmpEmailId());
                employee1.setEmpSalary(employee.getEmpSalary());
                employee1.setEmpPassword(employee.getEmpPassword());

                session.update(employee1);
                transaction.commit();
            }

        }

    }

    @Override
    public List<Employee> getAllData() {
        Session session = factory.openSession();

        return session.createQuery("from Employee").list();
    }

    @Override
    public Employee getDataById(int empId) {

        Session session = factory.openSession();
        Employee employee = (Employee) session.get(Employee.class, empId);

        return employee;
    }

    @Override
    public void deleteDataById(int empId) {
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        for (Employee employee1 : getAllData()) {
            if (employee1.getEmpid() == empId) {
                session.delete(employee1);
                transaction.commit();
            }
        }

    }


    @Override
    public void deleteAllData() {
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        for (Employee employee1 : getAllData()) {
            session.delete(employee1);
            transaction.commit();
        }

    }

}
