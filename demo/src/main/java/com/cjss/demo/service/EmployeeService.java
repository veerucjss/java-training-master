package com.cjss.demo.service;

import com.cjss.demo.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private List<EmployeeModel> employees;

    public List<EmployeeModel> add(EmployeeModel employeeModel) {
        if (employees == null) {
            employees = new ArrayList<>();
        }
        employees.add(employeeModel);
        return employees;
    }

    public EmployeeModel get(int id) {

        Optional<EmployeeModel> first = employees.stream().filter(employeeModel -> employeeModel.getId() == id).findFirst();

        return first.isPresent() ? first.get() : null;
    }

    public void delete(int id) {

        Optional<EmployeeModel> first = employees.stream().filter(employeeModel -> employeeModel.getId() == id).findFirst();

        first.ifPresent(employeeModel -> employees.remove(employeeModel));
    }


}