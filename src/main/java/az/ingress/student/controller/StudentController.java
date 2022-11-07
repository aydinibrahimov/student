package az.ingress.student.controller;

import az.ingress.student.config.AppConfig;
import az.ingress.student.domain.Student;
import az.ingress.student.service.StudentInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("student")
@RequiredArgsConstructor
public class StudentController {

    private final AppConfig appConfig;
    private final StudentInfoService studentInfoService;

@PostMapping
    public void createStudent(@RequestBody Student student){
         studentInfoService.createStudent(student);
    }



@GetMapping("/details")
    public String getAppDetails(){
return (appConfig.getName()+" \n "+appConfig.getVersion());
    }
}
