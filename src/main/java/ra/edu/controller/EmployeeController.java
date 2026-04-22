package ra.edu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.edu.entity.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping()
    public List<Employee> getAllEmployees(){
        return new ArrayList<>(Arrays.asList(
                new Employee(1L, "Nguyễn Việt Anh", 25.05),
                new Employee(2L, "Nguyễn Hải Nam", 25.07),
                new Employee(3L, "Nguyễn Kiều Trang", 29.05)
        ));
    }
}
