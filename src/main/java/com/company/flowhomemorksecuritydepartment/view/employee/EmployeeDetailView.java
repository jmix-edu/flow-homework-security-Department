package com.company.flowhomemorksecuritydepartment.view.employee;

import com.company.flowhomemorksecuritydepartment.entity.Employee;

import com.company.flowhomemorksecuritydepartment.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "employees/:id", layout = MainView.class)
@ViewController("Employee.detail")
@ViewDescriptor("employee-detail-view.xml")
@EditedEntityContainer("employeeDc")
public class EmployeeDetailView extends StandardDetailView<Employee> {
}