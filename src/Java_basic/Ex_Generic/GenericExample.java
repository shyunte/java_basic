package Java_basic.Ex_Generic;

public class GenericExample {
    public static void main(String[] args) {

        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<highStudent>(new highStudent()));
        Course.registerCourse1(new Applicant<middelStudent>(new middelStudent()));

        //Course.registerCourse2(new Applicant<Person>(new Person()));   <? extends Student>의 파라미터가 아님
        Course.registerCourse2(new Applicant<Student>(new Student()));
        //Course.registerCourse2(new Applicant<Worker>(new Worker()));   <? extends Student>의 파라미터가 아님
        Course.registerCourse2(new Applicant<highStudent>(new highStudent()));
        Course.registerCourse2(new Applicant<middelStudent>(new middelStudent()));
    }
}
