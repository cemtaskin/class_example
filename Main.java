import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Ali", "Duru", "1001", LocalDate.of(1985, 1, 1));
        Student student2 = new Student("Aliye", "Duru", "1002", LocalDate.of(1982, 1, 19));

        student.sayHello();
        student.sayNumber();
        student.sayNumber(5);

        student2.sayHello();

        student.sayAge();
        student2.sayAge();
    }
}
