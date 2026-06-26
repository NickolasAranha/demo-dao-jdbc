package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n==== TEST 1: department insert ====");
        Department department = new Department(null, "Games");
        departmentDao.insert(department);
        System.out.println(department);

        System.out.println("\n==== TEST 2: department update ====");
        department.setName("Food");
        departmentDao.update(department);
        System.out.println(department);

        System.out.println("\n==== TEST 3: department delete ====");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");


        sc.close();
    }
}
