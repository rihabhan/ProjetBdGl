package com.enit.ProjectSpring11.Services;

import java.util.List;


import com.enit.ProjectSpring11.model.Department;
public interface DepartmentService {
	List <Department> getDepartments();
	Department saveDepartment (Department d);
	void deleteDepartment(int id);
    Department getDepartmentById(int id); // Add this method

}
