import Test.src.Manager;
import Test.src.ManagerBuilder;
import Test.src.ManagerDaoImpl;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
        ManagerBuilder managerBuilder = new ManagerBuilder();
        managerBuilder.firstName("Jack");
        managerBuilder.lastName("Sparrow");
        managerBuilder.dob(LocalDate.ofEpochDay(1993-11-20));
        managerBuilder.phoneNumber("+996773596848");
        managerBuilder.email("sparr@gmail.com");
        managerBuilder.salary(15000);
        Manager m= managerBuilder.build();

        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        managerDaoImpl.save(m);
        }
    }

