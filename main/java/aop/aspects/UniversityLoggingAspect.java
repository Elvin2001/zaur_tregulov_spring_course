package aop.aspects;

import aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    //    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов перед методом getStudents()");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())"
//            , returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade += 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов после работы метода getStudents()");
//    }
    @AfterThrowing(pointcut = "execution(* getStudents())",
            throwing = "exception")
    public void afterThrowingStudentsAdvice(JoinPoint joinPoint, Throwable exception) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("afterGetStudentsAdvice: method = " + methodSignature.getName() +
                " выбросил исключение " + exception.getMessage());
    }
}
