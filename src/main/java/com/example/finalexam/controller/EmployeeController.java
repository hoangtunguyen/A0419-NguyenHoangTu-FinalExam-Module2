package com.example.finalexam.controller;

import com.example.finalexam.model.Employee;
import com.example.finalexam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    public static Map<String,String> groupEmployee(){
        Map<String, String> groupEmployee = new HashMap<>();
        groupEmployee.put("Lễ Tân", "Lễ Tân");
        groupEmployee.put("Phục vụ", "Phục vụ");
        groupEmployee.put("Tiếp đoàn", "Tiếp đoàn");
        return groupEmployee;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("employees", employeeService.employees());
        model.addAttribute("employee", new Employee());
        model.addAttribute("map", EmployeeController.groupEmployee());
        return "homepage";
    }

    @PostMapping("/doAdEmployee")
    public String doAddForm(@ModelAttribute(name = "employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/";
    }

    @GetMapping("/getEmployeeByID/{id}")
    public String doAddForm(@PathVariable Integer id, Model model) {
        model.addAttribute("map", EmployeeController.groupEmployee());
        model.addAttribute("employee", employeeService.getEmpoyyeeById(id));
        return "employee";
    }

    @PostMapping("/updateEmployee")
    public String updateEmployee(@ModelAttribute(name = "employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id) {
        employeeService.deleteById(id);
        return "redirect:/";
    }

    @PostMapping("/search")
    public String searchName(@RequestParam(value = "search") String name, Model model) {
        List<Employee> employees = employeeService.searchEmployee(name);
        model.addAttribute("employees", employees);
        model.addAttribute("map", EmployeeController.groupEmployee());
        model.addAttribute("employee", new Employee());

        return "homepage";
    }
}