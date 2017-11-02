package com.employee.dao;

import com.employee.entity.Department;
import com.employee.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class EmployeeDao {

    public ArrayList<Employee> getAllEmployee() {

        ArrayList<Employee> lstEmployee = new ArrayList<>();

        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            // *** Importance: all access inside DB must be between Transaction().begin() and close
            session.getTransaction().begin();

            // HQL query object
            String sql = "from Employee"; // Select all

            // Query object
            Query<Employee> query = session.createQuery(sql);

            // get result of query
            lstEmployee = (ArrayList<Employee>) query.list();

            Department department = lstEmployee.get(0).getDepartment();

            String deptName = department.getDeptName();
            String a = "sss";

        }catch (Exception e) {
            e.printStackTrace();

        } finally {
            session.getTransaction().commit();
        }

        return lstEmployee;
    }
}
