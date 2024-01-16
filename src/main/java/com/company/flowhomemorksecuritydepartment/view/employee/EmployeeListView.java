package com.company.flowhomemorksecuritydepartment.view.employee;

import com.company.flowhomemorksecuritydepartment.entity.Employee;

import com.company.flowhomemorksecuritydepartment.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "employees", layout = MainView.class)
@ViewController("Employee.list")
@ViewDescriptor("employee-list-view.xml")
@LookupComponent("employeesDataGrid")
@DialogMode(width = "64em")
public class EmployeeListView extends StandardListView<Employee> {
}