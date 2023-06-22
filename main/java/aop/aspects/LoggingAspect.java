package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import aop.Book;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineMethodFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineMethodFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }


//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    public void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    public void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    public void allGetAndReturnMethodsFromUniLibrary() {
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + signature);
        System.out.println("methodSignature.getMethod() = " + signature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + signature.getReturnType());
        System.out.println("methodSignature.getName() = " + signature.getName());

        if (signature.getName().equals("addBook")) {

            Object[] arguments = joinPoint.getArgs();
            for (Object arg : arguments) {
                if (arg instanceof Book) {
                    Book myBook = (Book) arg;
                    System.out.println("Информация о книге: название - " + myBook.getName() +
                            ", автор - " + myBook.getAuthor() + ", год издания - " +
                            myBook.getYearOfPublication());

                } else if (arg instanceof String) {
                    System.out.println("книгу в библиотеку добавляет " + arg);
                }
            }
        }

        System.out.println("beforeGetBookAdvice: логирование " +
                "попытки получить книгу/журнал");
        System.out.println("------------------------------------------------");
    }

}
