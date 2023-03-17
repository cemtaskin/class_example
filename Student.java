import java.util.Date;

public class Student{

    String name; //properties or fields -> store data
    String surname;
    String number;
    Date dateOfBirth;
    
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

    }




}
