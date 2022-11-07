package az.ingress.student.service;

import az.ingress.student.domain.Student;
import az.ingress.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentInfoService {
    private final StudentRepository studentRepository;

    public void createStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> getAll(){
      return   studentRepository.findAll();
    }
}
