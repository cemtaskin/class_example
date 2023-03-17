import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
       
        Student student = new Student(); //it creates a new object from Student class - > create an instance of Student class
        student.name="Ali";
        student.surname="Duru";
        student.number="1001";
        student.dateOfBirth=LocalDate.of(1985, 1, 1);

            
       
        Student student2 = new Student();
        student2.name="Aliye";
        student2.surname="Duru";
        student2.number="1002";
        student2.dateOfBirth=LocalDate.of(1982,1,19);
        
        student.sayHello();
        student.sayNumber();
        student.sayNumber(5);

        student2.sayHello();
        
        student.sayAge();
        student2.sayAge();
    }
}
