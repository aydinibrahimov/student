package az.ingress.student.controller;

import az.ingress.student.config.AppConfig;
import az.ingress.student.domain.Student;
import az.ingress.student.service.StudentInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController("student")
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final AppConfig appConfig;
    private final StudentInfoService studentInfoService;

@PostMapping()
    public void createStudent(@RequestBody Student student){
         studentInfoService.createStudent(student);
    }



@GetMapping()
    public String getAppDetails(){
    appConfig.getDevelopers().stream().forEach(System.out::println);
    appConfig.getNumbers().forEach((k,v)->System.out.println(k+"="+v));
return (appConfig.getName()+" \n "+appConfig.getVersion());
    }
}
