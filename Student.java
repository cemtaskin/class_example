import java.time.LocalDate;
import java.time.Period;


public class Student{

    String name; //properties or fields -> store data
    String surname;
    String number;
    LocalDate dateOfBirth;

     
    public Student(){ //this is constructor method with no params. Zero paramter constructor method is called as default constructor
        System.out.println("Def constructor is triggered automatically");
    }
    
    public Student(String name, String surname, String number, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.dateOfBirth = dateOfBirth;
    }


    //a method with no paramaters  named as sayHello. 
    void sayHello (){
        System.out.println(String.format("Hi my name is %s. My Surname is %s and my number is %s",name,surname,number));
    }

    void sayNumber(){
        System.out.println(String.format("My number is %s",number));
    }

    void sayNumber(int count){ //says the number count times
        for(int i=0;i<count;i++){
            System.out.println(String.format("My number is %s",number));
        }  
    }

    void sayAge(){ //create a method prints out the age of student in system output
        int years=  Period.between(dateOfBirth, LocalDate.now()).getYears();
        System.out.println(String.format("My age is %d",years));
    }




}
