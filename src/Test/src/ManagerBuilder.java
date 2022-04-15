package Test.src;

import java.time.LocalDate;
import java.time.LocalTime;

public class ManagerBuilder {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private LocalDate dob;
    private Double salary;

    public ManagerBuilder() {}

    public static ManagerBuilder builder(){
        return new ManagerBuilder();
    }

    public Manager build(){
        return new Manager(id, firstName, lastName, phoneNumber, email, dob, salary);
    }
    public ManagerBuilder id (Long id) {
        this.id = id;
        return this;
    }

    public ManagerBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ManagerBuilder lastName (String lastName) {
        this.lastName = lastName;
        return  this;
    }

    public ManagerBuilder phoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ManagerBuilder email (String email) {
        this.email = email;
        return this;
    }

    public ManagerBuilder dob (LocalDate dob) {
        this.dob = dob;
        return this;
    }

    public  ManagerBuilder salary (double salary) {
        this.salary = salary;
        return this;
    }
}
