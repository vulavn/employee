package com.employee.dao;

import com.employee.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class DepartmentDao {

    public ArrayList<Department> getAllDepartment() {

        ArrayList<Department> lstDepartment = new ArrayList<>();

        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            // *** Importance: all access inside DB must be between Transaction().begin() and close
            session.getTransaction().begin();

            // HQL query object
            String sql = "from Department"; // Select all

            // Query object
            Query<Department> query = session.createQuery(sql);

            // get result of query
            lstDepartment = (ArrayList<Department>) query.getResultList();

        }catch (Exception e) {
            e.printStackTrace();

        } finally {
            session.getTransaction().commit();
        }

        return lstDepartment;
    }
}